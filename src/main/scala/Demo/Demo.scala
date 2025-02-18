package Demo

import scala.collection.mutable

// Scala - Sets
/* The Set is the collection elements of same data types.
* That contain no duplicate elements */
object Demo {
  //Immutable set
  val immutableSet : Set[Int] = Set(1, 2, 5, 8, 9, 2)
  //Mutable set
  //var mutableSet = scala.collection.mutable.Set(1, 2, 4, 5, 7, 7)
  var mutableSet: mutable.Set[Int] = mutable.Set(1, 2, 4, 5, 7, 7)
  val names: Set[String] = Set("Jhon", "Doe", "Jane")

  def main(args: Array[String]): Unit = {
    println(immutableSet);
    println(mutableSet);
  }
}
