;For Java9, you must use the following to compile: java -cp cljs.jar:src --add-modules java.xml.bind clojure.main build.clj
;NOTE the `--add-modules java.xml.bind` arg. This is needed because Java9 deprecated, renamed and removed this!
(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'hello-world.core
                       :output-to "out/main.js"})
