(ns pegthing.core-test
    (:require [clojure.test :refer :all]
              [pegthing.core :refer :all]))

(deftest tri*-test
  (is (= '(1 3 6 10 15) (take 5 tri))))

(deftest triangular?-test
  (is (= false (triangular? 5)))
  (is (= true (triangular? 6))))

(deftest row-tri-test
  (is (= 1 (row-tri 1)))
  (is (= 3 (row-tri 2)))
  (is (= 6 (row-tri 3))))