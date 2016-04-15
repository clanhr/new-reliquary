(defproject clanhr/new-reliquary "1.0.1"
  :description "Clojure newrelic java api wrapper"
  :url "https://github.com/Yleisradio/new-reliquary"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.0.2"]
                 [com.newrelic.agent.java/newrelic-api "3.27.0"]]

  :profiles { :dev { :dependencies [[ring/ring-core "1.3.2"]
                                    [ring-mock "0.1.5"]]}})
