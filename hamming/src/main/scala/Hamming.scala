object Hamming {
    def distance(s1: String, s2: String): Option[Int] = {
        val len = s1.length()
        val len1 = s2.length()
        if ( len1 == len) {
            var ret: Int = 0
            for ( i <- 0 until len){
                if ( s1(i) == s2(i) )
                    ret += 1
            }
            return Some(ret)
        }
        return None
    }
}
