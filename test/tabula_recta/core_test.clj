(ns tabula-recta.core-test
  (:require [clojure.test :refer :all]
            [tabula-recta.core :refer :all]))

;(def 3-chars (\A \B \C))
;(def 29-chars [\A \B \C \D \E \F \G \H \I \J \K \L \M \N \O \P \Q \R \S \T \U \V \W \X \Y \Z \A \B \C])

(deftest test-alphabet
  (testing "Alphabet generation"
    (is (= (take 3 (cycle (alphabet))) '(\A \B \C)))
    (is (= (take 29 (cycle (alphabet))) '(\A \B \C \D \E \F \G \H \I \J \K \L \M \N \O \P \Q \R \S \T \U \V \W \X \Y \Z \A \B \C)))))
