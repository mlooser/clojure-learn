(ns clojuredemo.map-args-test
    (:require [clojure.test :refer :all]))

(defn my-fun [arg {:keys [a b c] :as args}]
  (str arg "-" a b c "-" (:a args) (:b args) (:c args)))

(deftest map-test
  (is (= "ARG-ABC-ABC" (my-fun "ARG" {:a "A" :b "B" :c "C"}))))