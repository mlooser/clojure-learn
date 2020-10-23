(ns clojuredemo.conj-test
    (:require [clojure.test :refer :all]))

(deftest conj-test
 (is (= [1 2] (conj [1] 2)))
 (is (= [1 [2]] (conj [1] [2]))))