(defproject clj-basic-web "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [hiccup "2.0.0-alpha1"]
                 [compojure "1.6.0"]
                 [org.clojure/java.jdbc "0.6.0"]
                 [com.h2database/h2 "1.4.193"]
                 [proto-repl "0.3.1"]
                 [ring/ring-defaults "0.3.1"]]
  :plugins [[lein-ring "0.12.4"]
            [compojure "1.6.0"]]
  :ring {:handler clj-basic-web.handler/app}
  :main ^:skip-aot clj-basic-web.handler
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
