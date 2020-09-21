(ns clojuredemo.sum-test
  (:require [clojure.test :refer :all]
            [clojuredemo.sum :refer :all]))

(deftest sum-numbers-test
  (is ( = 5 ( sum-numbers 2 3))))

(deftest sum-list-test
  (is ( = 10 ( sum-lists [1 2 3 4]))))
