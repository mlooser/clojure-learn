(ns clojuredemo.apply-test
    (:require [clojure.test :refer :all]))

(deftest apply-test
  (is (= [1 2 3] (max [1 2 3])))
  (is (= 3 (apply max [1 2 3])))

  (is (= [1 [2 3]] (conj [1] [2 3])))
  (is (= [1 2 3] (apply conj [1] [2 3])))
  )
