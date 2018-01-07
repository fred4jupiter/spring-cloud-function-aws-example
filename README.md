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