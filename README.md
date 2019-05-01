# Benchmark

## Clojure 1.10.0

```bash
➜  bench java -version
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)
➜  bench clj -Aperf -m bench

testing... 0
Evaluation count : 2200416 in 6 samples of 366736 calls.
             Execution time mean : 275,970627 ns
    Execution time std-deviation : 3,320345 ns
   Execution time lower quantile : 272,504796 ns ( 2,5%)
   Execution time upper quantile : 280,871431 ns (97,5%)
                   Overhead used : 8,502248 ns

testing... 1
Evaluation count : 2235966 in 6 samples of 372661 calls.
             Execution time mean : 297,910630 ns
    Execution time std-deviation : 13,573236 ns
   Execution time lower quantile : 276,977827 ns ( 2,5%)
   Execution time upper quantile : 311,603572 ns (97,5%)
                   Overhead used : 8,502248 ns

testing... 2
Evaluation count : 1990140 in 6 samples of 331690 calls.
             Execution time mean : 297,696011 ns
    Execution time std-deviation : 12,702563 ns
   Execution time lower quantile : 287,078251 ns ( 2,5%)
   Execution time upper quantile : 316,385017 ns (97,5%)
                   Overhead used : 8,502248 ns
```

```bash
➜  bench java -version
java version "1.8.0_172"
Java(TM) SE Runtime Environment (build 1.8.0_172-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.172-b11, mixed mode)
➜  bench clj -Aperf -m bench

testing... 0
Evaluation count : 2778450 in 6 samples of 463075 calls.
             Execution time mean : 216.911389 ns
    Execution time std-deviation : 6.387732 ns
   Execution time lower quantile : 211.261297 ns ( 2.5%)
   Execution time upper quantile : 227.098694 ns (97.5%)
                   Overhead used : 1.857220 ns

Found 1 outliers in 6 samples (16.6667 %)
	low-severe	 1 (16.6667 %)
 Variance from outliers : 13.8889 % Variance is moderately inflated by outliers

testing... 1
Evaluation count : 2476710 in 6 samples of 412785 calls.
             Execution time mean : 237.203048 ns
    Execution time std-deviation : 6.433959 ns
   Execution time lower quantile : 227.998854 ns ( 2.5%)
   Execution time upper quantile : 243.114418 ns (97.5%)
                   Overhead used : 1.857220 ns

testing... 2
Evaluation count : 2633502 in 6 samples of 438917 calls.
             Execution time mean : 229.660842 ns
    Execution time std-deviation : 2.586916 ns
   Execution time lower quantile : 226.571484 ns ( 2.5%)
   Execution time upper quantile : 232.095831 ns (97.5%)
                   Overhead used : 1.857220 ns
```
