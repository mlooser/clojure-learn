(ns pegthing.core
    (require [clojure.set :as set])
    (:gen-class))


(declare successful-move prompt-move game-over prompt-rows)

(defn tri*
  ([] (tri* 0 1))
  ([sum n]
   (let [new-sum (+ sum n)]
     (cons new-sum (lazy-seq (tri* new-sum (inc n)))))))

(def tri (tri*))