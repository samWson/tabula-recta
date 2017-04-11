(ns tabula-recta.core
  (:gen-class))

(defn alphabet
  "Returns a lazy sequence of alphabet characters"
  []
  (map char
       (range (int \A) (inc (int \Z)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
