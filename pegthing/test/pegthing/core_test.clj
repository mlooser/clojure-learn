(ns pegthing.core-test
    (:require [clojure.test :refer :all]
              [pegthing.core :refer :all]))

(deftest tri*-test
  (is (= '(1 3 6 10 15) (take 5 tri))))

(deftest triangular?-test
  (is (= false (triangular? 5)))
  (is (= true (triangular? 6))))