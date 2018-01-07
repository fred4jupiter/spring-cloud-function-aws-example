# spring-cloud-function-aws-example

Example application for Spring Cloud Function implementing an AWS Lambda function.

## Setings on function upload

Use this function handler name

```java
de.fred4jupiter.function.uppercase.handler.aws.UppercaseFunctionHandler
```

Under Basic Settings use this:

- Memory: 192 MB
- Timeout: 1 min

## Test request

You can use something like that as test request:

```json
{
  "input": "Hello World!"
}
```

## Using the AWS CLI

```bash
aws lambda create-function --function-name uppercaseFunction --role arn:aws:iam::[USERID]:role/service-role/[ROLE] --zip-file fileb://spring-cloud-function-aws-example/target/spring-cloud-function-aws-example-1.0.0-SNAPSHOT-aws.jar --handler de.fred4jupiter.function.uppercase.handler.aws.UppercaseFunctionHandler --description "Example of a Spring Cloud Function Lambda Function" --runtime java8 --region eu-central-1 --timeout 60 --memory-size 192 --publish
```