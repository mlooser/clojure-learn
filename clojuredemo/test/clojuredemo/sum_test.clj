(ns clojuredemo.sum-test
  (:require [clojure.test :refer :all]
            [clojuredemo.sum :refer :all]))

(deftest sum-numbers-test
  (is ( = 5 ( sum-numbers 2 3)))
  (is ( = 2 ( sum-numbers 2 nil)))
  (is ( = 3 ( sum-numbers nil 3)))
  (is ( = 0 ( sum-numbers nil nil)))
  )

(deftest sum-list-elements-test
  (is ( = 10 ( sum-list-elements [1 2 3 4]))))

(deftest sum-lists-test
  (is ( = [3 5] ( sum-lists [1 2] [2 3])))
  (is ( = [2 3] ( sum-lists [] [2 3])))
  (is ( = [1 2] ( sum-lists [1 2] [])))
  (is ( = [3 5 1] ( sum-lists [1 2] [2 3 1])))
  )

(defn sum
  ([vals] (sum vals 0))
  ([vals result]
   (if (empty? vals)
     result
     (recur (rest vals) (+ result (first vals))))))

(deftest sum-test
  (is (= 6 (sum [1 2 3])))
  (is (= 6 (sum '(1 2 3))))
  (is (= 6 (sum #{1 2 3}))))
