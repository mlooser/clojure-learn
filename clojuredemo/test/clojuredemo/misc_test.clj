(ns clojuredemo.misc-test
    (:require [clojure.test :refer :all]))

(deftest assoc-test
  (is (= {:a 1 :b 2} (assoc {:a 1} :b 2))))

(deftest concat-test
  (is
   (= '(1 2 3 4)
      (concat [1 2] [3 4]))))

(deftest repeat-test
  (is
   (= 10
      (reduce + (take 10 (repeat 1))))))

(deftest max-test
  (is (= 3 (max 1 2 3)))
  (is (= [1 2 3] (max [1 2 3]))))

(deftest assoc-get-test
  (is (= 1 (get-in (assoc-in {} [:a :b :c] 1) [:a :b :c]))))