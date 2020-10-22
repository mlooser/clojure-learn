(ns clojuredemo.filter-some-test
    (:require [clojure.test :refer :all]))

(def test-data
  [{:a 10 :b 11} {:a 20 :b 21} {:a 30 :b 31}])

(deftest filter-test
  (is
    (= '({:a 20 :b 21})
       (filter #(== (:a %) 20) test-data))))

(deftest some-test
  (is
    (= true
       (some #(== (:a %) 20) test-data)))
  (is
    (= nil
       (some #(== (:a %) 4) test-data)))
  (is
    (= 11
       (some #(and (== (:a %) 10) (:b %)) test-data))))