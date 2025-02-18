package Demo

import scala.collection.mutable

// Scala - Sets
/* The Set is the collection elements of same data types.
* That contain no duplicate elements */
object Demo {
  //Immutable set
  val immutableSet : Set[Int] = Set(1, 2, 5, 8, 9, 2)
  val immutableSet2 : Set[Int] = Set(4, 2, 6, 8, 9, 2, 3)
  //Mutable set
  var mutableSet: mutable.Set[Int] = mutable.Set(1, 2, 4, 5, 7, 7)
  val names: Set[String] = Set("Jhon", "Doe", "Jane")

  def main(args: Array[String]): Unit = {
    //Add the value to set without persist
    println(immutableSet + 10); //Output: HashSet(5, 10, 1, 9, 2, 8)
    println(immutableSet);      //Output: HashSet(5, 1, 9, 2, 8)

    //Check if value exists
    println(immutableSet(9))      //Output: true.
    println(immutableSet(99))      //Output: false.

    //Methods over sets: head, tail, isEmpty
    println(immutableSet.head)
    println(immutableSet.tail)
    println(immutableSet.isEmpty)
  }
}
