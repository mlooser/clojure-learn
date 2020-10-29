(ns clojuredemo.multimethod-test
    (:require [clojure.test :refer :all]))

(defmulti my-multi (fn [params] (:type params)))

(defmethod my-multi :a
           [params]
           (str (:val params) " in a"))

(defmethod my-multi :b
           [params]
           (str (:val params) " in b"))

(defmethod my-multi :default
           [params]
           (str (:val params) " in default"))

(defmethod my-multi nil
           [params]
           (str (:val params) " in nil"))

(deftest my-multi-test
  (is (= "A in a" (my-multi {:type :a :val "A"})))
  (is (= "B in b" (my-multi {:type :b :val "B"})))
  (is (= "D in default" (my-multi {:type :xxx :val "D"})))
  (is (= "N in nil" (my-multi {:val "N"}))))