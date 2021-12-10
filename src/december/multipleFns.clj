(ns december.multipleFns)

(defn no-arg-fn []
  (println "This is in Zero dimension"))

(defn one-arg-fn [one]
  (println "Length of line is" one))

(defn two-arg-fn [one two]
  (println "area of rectangle with side" one "and" two "is " (* one two)))

(defn three-arg-fn [one two three]
  (println "volume of tank with sides" one two "and" three "is" (* one two three)))

(defn my-function
  ([] (no-arg-fn))
  ([x] (one-arg-fn x))
  ([x y] (two-arg-fn x y))
  ([x y z] (three-arg-fn x y z))
  )

(defn new-fn [&args]

  )