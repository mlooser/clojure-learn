(ns clojuredemo.misc-test
    (:require [clojure.test :refer :all]))

(deftest assoc-test
  (is (= {:a 1 :b 2} (assoc {:a 1} :b 2)))
  )

(deftest take-test
  (is (= '(1 2 3) (take 3 [1 2 3 4])))
  )

(deftest drop-test
  (is (= '(2 3) (drop 1 [1 2 3])))
  )

(def test-data
  [{:a 1} {:a 2} {:a 3} {:a 4} {:a 5}])

(deftest take-while-test
  (is (= '({:a 1} {:a 2})
         (take-while #(<= (:a %) 2) test-data)))
   )

(deftest drop-while-test
  (is (= '({:a 4} {:a 5})
         (drop-while #(<= (:a %) 3) test-data)))
  )