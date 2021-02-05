;
;  (C) Copyright 2017, 2018, 2019, 2020, 2021  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-rest-api-utils.rest-api-utils-test
  (:require [clojure.test :refer :all]
            [clj-rest-api-utils.rest-api-utils :refer :all]))

;
; Common functions used by tests.
;

(defn callable?
  "Test if given function-name is bound to the real function."
  [function-name]
  (clojure.test/function? function-name))

;
; Tests
;
(deftest test-read-request-body-existence
  "Check that the clj-rest-api-utils.rest-api_utils/read-request-body function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/read-request-body function definition exists."
    (is (callable? 'clj-rest-api-utils.rest-api_utils/read-request-body))))


(deftest test-body->results-existence
  "Check that the clj-rest-api-utils.rest-api_utils/body->results function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/body->results function definition exists."
    (is (callable? 'clj-rest-api-utils.rest-api_utils/body->results))))


(deftest test-send-response-existence
  "Check that the clj-rest-api-utils.rest-api_utils/send-response function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/send-response function definition exists."
    (is (callable? 'clj-rest-api-utils.rest-api_utils/send-response))))


(deftest test-send-response-with-cookie-existence
  "Check that the clj-rest-api-utils.rest-api_utils/send-response-with-cookie function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/send-response-with-cookie function definition exists."
    (is (callable?
          'clj-rest-api-utils.rest-api_utils/send-response-with-cookie))))


(deftest test-send-ok-response-existence
  "Check that the clj-rest-api-utils.rest-api_utils/send-ok-response function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/send-ok-response function definition exists."
    (is (callable? 'clj-rest-api-utils.rest-api_utils/send-ok-response))))


(deftest test-send-error-response-existence
  "Check that the clj-rest-api-utils.rest-api_utils/send-error-response function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/send-error-response function definition exists."
    (is (callable? 'clj-rest-api-utils.rest-api_utils/send-error-response))))


(deftest test-send-error-response-wrong-date-existence
  "Check that the clj-rest-api-utils.rest-api_utils/send-error-response-wrong-date function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/send-error-response-wrong-date function definition exists."
    (is (callable?
          'clj-rest-api-utils.rest-api_utils/send-error-response-wrong-date))))


(deftest test-send-plain-response-existence
  "Check that the clj-rest-api-utils.rest-api_utils/send-plain-response function definition exists."
  (testing
    "if the clj-rest-api-utils.rest-api_utils/send-plain-response function definition exists."
    (is (callable? 'clj-rest-api-utils.rest-api_utils/send-plain-response))))

