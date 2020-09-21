(ns clojuredemo.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn -main
  "I don't do a whole lot...yet."
  [& args]
  (println "Hello, World!"))

(defn my-first
  [[first]]
  (str "first arg is " first))