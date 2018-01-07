package com.morethanheroic.uppercase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import de.fred4jupiter.function.uppercase.functions.UppercaseFunction;
import de.fred4jupiter.function.uppercase.functions.UppercaseRequest;
import de.fred4jupiter.function.uppercase.functions.UppercaseResponse;
import de.fred4jupiter.function.uppercase.service.UppercaseService;

@RunWith(MockitoJUnitRunner.class)
public class UppercaseFunctionUT {

	@InjectMocks
	private UppercaseFunction uppercaseFunction;

	@Mock
	private UppercaseService uppercaseService;

	@Test
	public void toUpperCase() {
		when(uppercaseService.uppercase(eq("Hello"))).thenReturn("HELLO");

		assertNotNull(uppercaseFunction);

		UppercaseRequest request = new UppercaseRequest();
		request.setInput("Hello");
		UppercaseResponse response = uppercaseFunction.apply(request);
		assertNotNull(response);
		assertEquals("HELLO", response.getResult());
	}
}
