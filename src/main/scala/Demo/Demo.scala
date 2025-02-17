package Demo

// Scala - Lists
/* The List are immutable, we don't can change de values */
object Demo {
  val mylist: List[Int] = List(1, 2, 4, 5, 7, 9)
  val names: List[String] = List("Jhon", "Doe", "Jane")

  def main(args: Array[String]): Unit = {
    println("Numbers list");
    println(mylist);
    println("Names list");
    println(names);

    //Prepend 0 to the first place in the list
    println(0 :: mylist)
    //Create list with prepended values to Nil
    println(1 :: 3 :: 8 :: Nil)

    //Get the first value of the list
    println(mylist.head)

    //Get the last value of the list
    println(names.last)

    //Check if the list is Empty
    println(mylist.isEmpty)

    //Get the reverse list
    println(names.reverse)

    //Fill the list
    println(List.fill(5)(3))

  }
}
