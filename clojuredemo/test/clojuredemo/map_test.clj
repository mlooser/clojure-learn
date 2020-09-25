(ns clojuredemo.map-test
  (:require [clojure.test :refer :all]))


(deftest map-test
  (is (= '(2 3 4) (map inc [1 2 3])))
  (is (= '(3 5 4) (map + [1 2 3] [2 3 1])))
  (is (= '("aA" "bB" "cC") (map str ["a" "b" "c"] ["A" "B" "C"])))
  (is (= '({:first "fv1" :second "sv1"} {:first "fv2" :second "sv2"})
         (map
           (fn [f s] {:first f :second s})
           ["fv1" "fv2"]
           ["sv1" "sv2"])))
  )

(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))
(defn stats
  "returns sum, avg and count of given vector"
  [numbers]
  (map #(% numbers) [sum avg count]))

(deftest stats-test
  (is (= '(6 2 3) (stats [1 2 3]))))

(def test-map
  [{:key "k1" :val "v1"}
   {:key "k2" :val "v2"}])

(deftest get-by-key-test
  (is (= '("k1" "k2") (map :key test-map)))
  (is (= '("v1" "v2") (map :val test-map)))
  )