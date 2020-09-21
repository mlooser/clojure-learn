(ns clojuredemo.sum)

(defn sum-numbers
  "returns sum of two given numbers"
  [arg1 arg2]
  (+ arg1 arg2))

(defn sum-lists
  "returns sum of elements on given list"
  [list]
  (loop [sum 0
         remaining list]
    (if (empty? remaining)
      sum
      (let [[first & rest] remaining]
        (recur (sum-numbers sum first) rest)))
    )
  )