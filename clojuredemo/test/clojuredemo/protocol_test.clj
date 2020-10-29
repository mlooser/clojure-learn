(ns clojuredemo.protocol-test
    (:require [clojure.test :refer :all]))

(defprotocol MyProtocol
  "My Test protocol"
  (test-method [x] "sample test method"))

(extend-type
 java.lang.Object
 MyProtocol
 (test-method [x] (str x " Obj")))

(extend-type
 java.lang.String
 MyProtocol
 (test-method [x] (str x " Str")))

(deftest protocol-test
  (is (= "2 Obj" (test-method 2)))
  (is (= "A Str" (test-method "A"))))