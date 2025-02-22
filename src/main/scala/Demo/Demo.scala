package Demo

// Scala - Options (Some or None)
/*  */
object Demo {
  val lst = List(1, 2, 3)
  var map = Map(1 -> "Noel", 2 -> "Abe", 3 -> "Liam")

  def main(args: Array[String]): Unit = {
    //Find something in the List lst. The find method return the first element found
    println(lst.find(_ > 6));//Output: None
    println(lst.find(_ > 2));//Output: Some(3)

  }

}
