# holy-lambda-steps
Test of integration between holy lambda and Step functions. Use to document issue https://github.com/FieryCod/holy-lambda/issues/83

This is an implementation in Clojure/HL of the example in  https://aws.amazon.com/getting-started/hands-on/handle-serverless-application-errors-step-functions-lambda/

# Lifecycle

```shell
bb compile
sam build
#sam local invoke -e resources/event-test-archive.json
sam deploy --guided
```

Note: there is a new babashka task named `compile` that compiles the java exceptions and then calls `hl:compile`
