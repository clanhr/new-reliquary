(defproject clanhr/new-reliquary "1.0.0"
  :description "Clojure newrelic java api wrapper"
  :url "https://github.com/Yleisradio/new-reliquary"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies.edn "https://raw.githubusercontent.com/clanhr/dependencies/master/dependencies.edn"

  :dependency-sets [:clojure :common]

  :dependencies [[com.newrelic.agent.java/newrelic-api "3.27.0"]]

  :plugins [[clanhr/shared-deps "0.2.6"]]

  :profiles { :dev { :dependencies [[ring/ring-core "1.3.2"]
                                    [ring-mock "0.1.5"]]}})
