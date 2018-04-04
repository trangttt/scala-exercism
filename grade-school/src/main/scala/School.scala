import scala.collection.mutable.Map

class School {
  type DB = Map[Int, Seq[String]]

  var database = Map.empty[Int, Seq[String]]

  def add(name: String, g: Int) = {
      if (!database.contains(g)) {
        database(g) = Seq.empty[String]
      }
      val newSeq: Seq[String] = database(g) :+ name
        database(g) = newSeq
  }

  def db: DB = {
    return database
  }

  def grade(g: Int): Seq[String] = {
      if (!database.contains(g)){
        database(g) = Seq.empty[String]
      }
      return database(g)
  }

  def sorted: DB = {
        val newDB: DB = database map{ case (k, v) => k -> v.sorted }
        return newDB
  }
}
