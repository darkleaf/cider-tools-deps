It integrates [cider-nrepl](https://github.com/clojure-emacs/cider-nrepl)
and [tools.deps.alpha](https://github.com/clojure/tools.deps.alpha).


deps.edn:

```edn
{:aliases
 {:cider {:extra-deps {darkleaf/cider-tools-deps
                       {:git/url "https://github.com/darkleaf/cider-tools-deps.git"
                        :sha "9a4c8d92bce838b28f1156fa207f29c8441cf59b"}}
          :main-opts ["-m" "darkleaf.cider-tools-deps"
                      "port" "8888" "host" "0.0.0.0"]}}}
```

usage: `clojure -Acider`
