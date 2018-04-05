import scala.collection.mutable.Set

object BookStore {
  def total(input: List[Int]) : Double = {
      var dif : Set[Int]   = Set.empty[Int]
      for ( i <- 0 until input.size){
          if (!dif.contains(i))  {
            dif += i
          }
      }

      var noDif = dif.size
      var no: Int = input.size
      var total: Double = 0
      if (noDif > 1) {
        var m = Map( 2 -> 0.95, 3 -> 0.9, 4 -> 0.80, 5 -> 0.75 )
        var discount = noDif * m(noDif) * 8
        total = (no - noDif)  * 8 + discount
      } else {
        total = 8.0 * no
      }


      return total
  }

}
