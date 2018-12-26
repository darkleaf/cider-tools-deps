(ns darkleaf.cider-tools-deps
  (:require
   [clojure.tools.nrepl.server :as nrepl-server]
   [refactor-nrepl.middleware :as refactor]))

(defn- nrepl-handler []
  (require 'cider.nrepl)
  (ns-resolve 'cider.nrepl 'cider-nrepl-handler))

(defn -main [& {:strs [port host]
                :or {port 4444, host "127.0.0.1"}}]
  (prn (nrepl-server/start-server :port (bigint port)
                                  :bind host
                                  :handler (-> (nrepl-handler)
                                               refactor/wrap-refactor))))
