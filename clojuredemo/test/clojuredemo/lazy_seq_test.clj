(ns clojuredemo.lazy-seq-test
    (:require [clojure.test :refer :all]))

(defn even-numbers
  ([] (even-numbers 0))
  ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))

(deftest take-even-test
  (is
   (= 12
      (reduce + (take 4 (even-numbers))))))