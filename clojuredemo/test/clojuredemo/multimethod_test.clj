(ns clojuredemo.multimethod-test
    (:require [clojure.test :refer :all]))

(defmulti my-multi (fn [params] (:type params)))

(defmethod my-multi :a
           [params]
           (str (:val params) " in a"))

(defmethod my-multi :b
           [params]
           (str (:val params) " in b"))

(deftest my-multi-test
  (is (= "A in a" (my-multi {:type :a :val "A"})))
  (is (= "B in b" (my-multi {:type :b :val "B"}))))