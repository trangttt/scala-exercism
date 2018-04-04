class Accumulate {
    def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
        val b = list.map(item => f(item))
        return b
    }
}
