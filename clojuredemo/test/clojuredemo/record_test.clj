(ns clojuredemo.record-test
    (:require [clojure.test :refer :all]))

(defprotocol MyProtocol
  "My Test protocol"
  (test-method [x] "sample test method"))

(defrecord MyRecord [key val]
  MyProtocol
  (test-method [x] (str key val)))

(def mr-instance-1 (MyRecord. "K1" "V1"))
(def mr-instance-2 (->MyRecord "K2" "V2"))
(def mr-instance-3 (map->MyRecord {:key "K3" :val "V3"}))

(deftest record-test
  (is (= "K1V1" (test-method mr-instance-1)))
  (is (= "K2V2" (test-method mr-instance-2)))
  (is (= "K3V3" (test-method mr-instance-3))))
