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

  }
}
