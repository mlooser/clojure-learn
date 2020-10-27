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

(deftest rom-num-test
  (is (= 1 (row-num 1)))
  (is (= 2 (row-num 2)))
  (is (= 2 (row-num 3)))
  (is (= 3 (row-num 4)))
  (is (= 3 (row-num 5)))
  (is (= 3 (row-num 6))))

(deftest connect-test
  (is
   (=
    {1 {:connections {4 2}}
     4 {:connections {1 2}}}
    (connect {} 15 1 2 4)))
  (is
   (=
    {4 {:connections {1 2}}
     1 {:connections {4 2}}}
    (connect-down-left {} 15 1))))

