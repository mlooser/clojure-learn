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

(defn triangular?
  [n]
  (= n (last (take-while #(>= n %) tri))))

(defn row-tri
  [n]
  (last (take n tri)))

(defn row-num
  [pos]
  (inc (count (take-while #(> pos %) tri))))

(defn connect
  [board max-pos pos neighbor dest]
  (if (<= dest max-pos)
    (reduce
      (fn [new-board [p1 p2]]
        (assoc-in new-board [p1 :connections p2] neighbor))
      board
      [[pos dest] [dest pos]])
    board))