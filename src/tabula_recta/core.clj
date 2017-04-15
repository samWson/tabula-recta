(ns tabula-recta.core
  (:gen-class))

(def alphabet (map char (range (int \A) (inc (int \Z)))))

(defn keywordize
  "Returns a list of keywords"
  [collection]
  (map keyword (doall (collection))))

;; Trying to create the first row of the tabula-recta here
(def first-row (zipmap (keywordize alphabet) (zipmap (keywordize alphabet) (alphabet))))

(def row {:A {:A "A" :B "B" :C "C"}})

(get-in row [:A :C])

(alphabet)

(keywordize alphabet)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

