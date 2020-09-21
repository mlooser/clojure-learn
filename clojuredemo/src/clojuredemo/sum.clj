(ns clojuredemo.sum)

(defn sum-numbers
  "returns sum of two given numbers"
  [arg1 arg2]
  (let [safeArg1 ( or arg1 0)
        safeArg2 ( or arg2 0)]
    (+ safeArg1 safeArg2))
  )

(defn sum-list-elements
  "returns sum of elements on given list"
  [list]
  (loop [sum 0
         remaining list]
    (if (empty? remaining)
      sum
      (let [[first & rest] remaining]
        (recur (sum-numbers sum first) rest)))
    ))

(defn sum-lists
  "returns list containing sum of suitable elements"
  [list1 list2]
  (loop [remaining1 list1
         remaining2 list2
         result []]
      (if (and (empty? remaining1) (empty? remaining2))
        result
        ( let [[ first1 & rest1] remaining1
               [first2 & rest2] remaining2]
            (recur rest1 rest2 (conj result (sum-numbers first1 first2)))
          )
        )
    )
  )