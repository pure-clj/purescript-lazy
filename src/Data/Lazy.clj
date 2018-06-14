(ns Data.Lazy._foreign
  (:refer-clojure :exclude [force]))

(defn defer [thunk]
  (delay (thunk nil)))

(defn force [l]
  (deref l))
