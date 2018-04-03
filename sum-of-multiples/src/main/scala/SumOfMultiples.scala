object SumOfMultiples {
    def sum(factors: Set[Int], limit: Int): Int = {
        var multiples: Set[Int] = Set()
        for (number <- factors) {
            var i: Int = 1
            var mul: Int = number * i
            while ( mul < limit ) {
               i += 1
               mul = number * i
              if (mul < limit && !multiples(mul)){
                  multiples += mul
              }
            }
        }

        var sum: Int = 0
        for (number <- multiples){
          sum += number
        }
        return sum
    }
}

