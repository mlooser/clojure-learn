(ns kotlintest.core
    (:gen-class)
    (:import org.mlooser.kotlintest.KtTest))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (doto (KtTest.)
        (.runTest)))
