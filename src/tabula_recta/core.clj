(ns tabula-recta.core
  (:gen-class))

(defn alphabet
  "Returns a lazy sequence of alphabet string characters"
  []  
  (map str
    (map char
       (range (int \A) (inc (int \Z))))))

(defn keywordize
  "Returns a list of keywords"
  [collection]
  (map keyword (doall (collection))))

;; Trying to create the first row of the tabula-recta here
(def first-row (zipmap (keywordize alphabet) (zipmap (keywordize alphabet) (alphabet))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

