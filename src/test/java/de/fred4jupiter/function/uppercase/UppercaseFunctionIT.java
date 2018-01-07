package de.fred4jupiter.function.uppercase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import de.fred4jupiter.function.uppercase.functions.UppercaseFunction;
import de.fred4jupiter.function.uppercase.functions.UppercaseRequest;
import de.fred4jupiter.function.uppercase.functions.UppercaseResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UpperFunctionApplication.class, webEnvironment = WebEnvironment.NONE)
public class UppercaseFunctionIT {

	@Autowired
	private UppercaseFunction uppercaseFunction;
	
	@Test
	public void toUpperCase() {
		assertNotNull(uppercaseFunction);

		UppercaseRequest request = new UppercaseRequest();
		request.setInput("Hello");
		UppercaseResponse response = uppercaseFunction.apply(request);
		assertNotNull(response);
		assertEquals("HELLO", response.getResult());
	}
}
