(ns clojuredemo.case-test
    (:require [clojure.test :refer :all]))

(defn my-fun [dst src names]
  (reduce
   (fn [acc name]
     (assoc acc name
            (case name
                  (:a :b) (str "1" (name src))
                  (:x :y) (str "2" (name src)))))
   dst names))

(def my-src {:a "A" :b "B" :x "X" :y "Y"})

(deftest my-fun-test
  (is (= {:a "1A"} (my-fun {} my-src [:a])))
  (is (= {:a "1A" :b "1B"} (my-fun {} my-src [:a :b])))
  (is (= {:a "1A" :b "1B" :x "2X"} (my-fun {} my-src [:a :b :x]))))