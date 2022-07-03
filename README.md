# holy-lambda-steps
Test of integration between holy lambda and Step functions. 

This is used to document issue https://github.com/FieryCod/holy-lambda/issues/83

This project is an implementation in Clojure/HL of the example in  https://aws.amazon.com/getting-started/hands-on/handle-serverless-application-errors-step-functions-lambda/

# Lifecycle

```shell
bb compile
sam build
sam deploy --guided
```

Note: there is a new babashka task named `compile` that compiles the java exceptions and then calls `hl:compile`
