(defproject stockfighter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
  		[clj-http "2.2.0"]
                [org.clojure/data.json "0.2.6"]
                [org.clojure/core.async "0.2.385"]
                [org.clojure/core.match "0.3.0-alpha4"]]
  :main ^:skip-aot stockfighter.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
