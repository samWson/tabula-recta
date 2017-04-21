(defproject tabula-recta "0.1.0"
  :description "A lookup table of offset alphabets"
  :url "https://github.com/samWson/tabula-recta"
  :license {:name "MIT License"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot tabula-recta.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
