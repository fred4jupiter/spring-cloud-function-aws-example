package de.fred4jupiter.function.uppercase.functions;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.fred4jupiter.function.uppercase.service.UppercaseService;

@Component("uppercaseFunction")
public class UppercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {

	private static final Logger logger = LoggerFactory.getLogger(UppercaseFunction.class);

	private final UppercaseService uppercaseService;

	@Autowired
	public UppercaseFunction(final UppercaseService uppercaseService) {
		this.uppercaseService = uppercaseService;
	}

	@Override
	public UppercaseResponse apply(final UppercaseRequest uppercaseRequest) {
		logger.debug("called function 'uppercaseFunction' ...");
		final UppercaseResponse result = new UppercaseResponse();

		result.setResult(uppercaseService.uppercase(uppercaseRequest.getInput()));

		return result;
	}
}
