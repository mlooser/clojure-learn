(ns clojuredemo.misc-test
    (:require [clojure.test :refer :all]))

(deftest assoc-test
  (is (= {:a 1 :b 2} (assoc {:a 1} :b 2)))
  )