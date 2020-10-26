(ns clojuredemo.comp-test
    (:require [clojure.test :refer :all]))

(deftest comp-test
  (is (= 7 ((comp inc *) 2 3)))
  (is (= 8 ((comp #(+ 2 %) #(* %1 %2)) 2 3))))
