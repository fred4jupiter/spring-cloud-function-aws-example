package de.fred4jupiter.function.uppercase.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import de.fred4jupiter.function.uppercase.functions.UppercaseRequest;
import de.fred4jupiter.function.uppercase.functions.UppercaseResponse;

/**
 * This class will be selected in AWS Console as Function Handler.
 * 
 * @author michael
 *
 */
public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}
