(ns clojuredemo.reduce-test
    (:require [clojure.test :refer :all]))

(deftest reduce-with-assoc-test
  (is
   (= {:a 2 :b 3}
      (reduce
       (fn [new-map [key val]]
         (assoc new-map key (inc val)))
       {} {:a 1 :b 2}))))

(deftest filter-map-test
  (is
   (= {:a 5 :b 6}
      (reduce
       (fn [new-map [key val]]
         (if(<= val 6)
           (assoc new-map key val)
           new-map))
       {} {:a 5 :b 6 :c 7}))))

(deftest filter-vector-test
  (is
   (= [1 2 3]
      (reduce
       (fn [new-vec val]
         (if (<= val 3)
           (conj new-vec val)
           new-vec))
       [] [1 2 3 4 5]))))

(defn make-something
  [text]
  (reduce (fn [string string-fn] (string-fn string))
          text
          [clojure.string/trim
           clojure.string/upper-case
           #(clojure.string/replace % #"O" "I")]))

(deftest reduce-functions
  (is (= "LIL" (make-something " lol "))))