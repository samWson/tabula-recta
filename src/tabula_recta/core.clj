(ns tabula-recta.core)

(def alphabet (map char (range (int \A) (inc (int \Z)))))

(defn keywordize
  "Returns a list of keywords from a list of chars"
  [collection]
  (map keyword
    (map str (doall collection))))

(defn tabula-recta-generator
  "Return a Tabula Recta lookup table"
  [alphabet]
  (zipmap (keywordize alphabet)
    (map zipmap (repeat (keywordize alphabet))
      (iterate rest (cycle alphabet)))))

(def tabula-recta (tabula-recta-generator alphabet))


