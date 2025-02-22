package Demo

// Scala - Tuples
/* Class that can contain different kind of elements with different data type
* Are immutable. Until 22 elements */
object Demo {
  val myTuple = (1, 2, "Hello", true);
  val myTuple2 = new Tuple3(1, 2, "Hello");
  val myTuple3 = new Tuple2(1, "Hi");

  def main(args: Array[String]): Unit = {
    println(myTuple._1)
    println(myTuple3._2)

    //Iterate over the tuple
    myTuple.productIterator.foreach{
      i => println(i)
    }

    //Other ways to declare tuples
    //Create tuple with 2 elements
    println(1 -> "Noel")//Output: (1,Noel)
    //Create tuple with 3 elements, 1 tuple and another element
    println(1 -> "Noel" -> false)//Output: ((1,Noel),false)
  }

}
