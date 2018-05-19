It integrates [cider-nrepl](https://github.com/clojure-emacs/cider-nrepl)
and [tools.deps.alpha](https://github.com/clojure/tools.deps.alpha).


deps.edn:

```edn
{:aliases
 {:cider {:extra-deps {darkleaf/cider-tools-deps
                       {:git/url "https://github.com/darkleaf/cider-tools-deps.git"
                        :sha "3e6e5ce5cc7a9b9c99e43fb54c7280f8933c85da"}}
          :main-opts ["-m" "darkleaf.cider-tools-deps"
                      "port" "8888" "host" "0.0.0.0"]}}}
```

usage: `clojure -Acider`
