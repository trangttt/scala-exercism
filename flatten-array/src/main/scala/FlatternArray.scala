import scala.util.control.Breaks._

object FlattenArray {
    def flatten(input: List[Any]): List[Int] = {
        var ret: List[Int] = List.empty[Int]
        for (item <- input) {
            breakable {
                var newL: List[Int] = List.empty[Int]
                if ( item.isInstanceOf[List[_]] ) {
                    newL = ret ::: flatten(item.asInstanceOf[List[Any]])
                } else if ( item == null ) {
                    break
                } else {
                    newL = ret :+ item.asInstanceOf[Int]
                }
                ret = newL
            }
        }
        return ret
    }
}
