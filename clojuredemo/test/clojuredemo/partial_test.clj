(ns clojuredemo.partial-test
    (:require [clojure.test :refer :all]))

(def add10 (partial + 10))

(defn log
  [log-level message]
  (condp = log-level
         :warn (str "WARN " message)
         :info (str "INFO " message)))

(def warn (partial log :warn))

(deftest partial-test
  (is (= 11 (add10 1)))
  (is (= [11 12] (map add10 [1 2])))
  (is (= "WARN msg" (warn "msg"))))
