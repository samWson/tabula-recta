(ns tabula-recta.core-test
  (:require [clojure.test :refer :all]
            [tabula-recta.core :refer :all]))

(deftest test-alphabet
  (testing "Alphabet generation"
    (is (= (take 3 (cycle alphabet)) '(\A \B \C)))
    (is (= (take 29 (cycle alphabet)) '(\A \B \C \D \E \F \G \H \I \J \K \L \M \N \O \P \Q \R \S \T \U \V \W \X \Y \Z \A \B \C)))))

(deftest test-tabula-recta
  (testing "Tabula lookup"
    (is (= (get-in tabula-recta [:M :N]) \Z))
    (is (= (get-in tabula-recta [:A :A]) \A))
    (is (= (get-in tabula-recta [:Z :Z]) \Y))))
