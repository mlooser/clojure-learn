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


(def test-board (assoc-in (new-board 5) [4 :pegged] false))

(deftest valid-moves-board
  (is (= {4 2} (valid-moves test-board 1)))
  (is (= {4 5} (valid-moves test-board 6))))

(deftest valid-move?-test
  (is (= 2 (valid-move? test-board 1 4)))
  (is (= 5 (valid-move? test-board 6 4))))
