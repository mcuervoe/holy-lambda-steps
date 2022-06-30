(ns com.company.lambda-steps.core
  (:gen-class)
  (:require
   [fierycod.holy-lambda.response :as hr]
   [fierycod.holy-lambda.agent :as agent]
   [fierycod.holy-lambda.core :as h])
  (:import
    (com.company.lambda_steps.exceptions ServerUnavailableException TooManyRequestsException)))


(defn ExampleLambda
  "I can run on Java, Babashka or Native runtime..."
  [{:keys [event ctx] :as request}]
  (let [status-code (:statusCode event)]
    (case status-code
      "429" (throw (TooManyRequestsException. "429 in status code"))
      "503" (throw (ServerUnavailableException. "503 in status code"))
      "200" (hr/text "OK")
      :else (throw (RuntimeException. "unknown status code")))))


;; Specify the Lambda's entry point as a static main function when generating a class file
(h/entrypoint [#'ExampleLambda])

;; Executes the body in a safe agent context for native configuration generation.
;; Useful when it's hard for agent payloads to cover all logic branches.
(agent/in-context
 (println "I will help in generation of native-configurations"))
