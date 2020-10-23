(ns clojuredemo.into-test
    (:require [clojure.test :refer :all]))


(deftest into-test
  (is (= [1 2 3 4] (into [1 2] [3 4])))
  (is (= '(1 2 3 4) (sort (into '(1 2) '(3 4)))))
  (is
    (= {:a 1 :b 2}
       (into {:a 1} {:b 2}))))
