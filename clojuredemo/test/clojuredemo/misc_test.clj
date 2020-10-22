(ns clojuredemo.misc-test
    (:require [clojure.test :refer :all]))

(deftest assoc-test
  (is (= {:a 1 :b 2} (assoc {:a 1} :b 2))))

(deftest concat-test
  (is
   (= '(1 2 3 4)
      (concat [1 2] [3 4]))))