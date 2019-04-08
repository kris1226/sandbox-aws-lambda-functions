(defproject sandbox-helloclj-hi "0.1.0-SNAPSHOT"
  :description "Takes a string value and says hello to it."
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/data.json "0.2.6"]
                 [com.amazonaws/aws-lambda-java-core "1.2.0"]
                 [com.amazonaws/aws-lambda-java-events "2.2.6"]
                 [uswitch/lambada "0.1.2"]]
  :java-source-paths ["src/"]
  :source-paths ["src"]
  :repositories [["maven2-repository.dev.java.net" "https://maven.java.net/content/groups/public/"]
                 ["ccp-deployables-snapshots" "https://maven.java.net/content/repositories/ccp-deployables-snapshots"]
                 ["ccp-deployables-releases" "https://maven.java.net/content/repositories/ccp-deployables-releases"]]
  :aot :all)