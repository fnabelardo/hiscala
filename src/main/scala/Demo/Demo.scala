package Demo

import Array._

// Scala - Arrays
object Demo {
  var myarray: Array[Int] = new Array[Int](4) //Declaring Array
  var myarray2 = new Array[Int](5) //Declaring Array
  var myarray3 = Array(1, 2, 3, 5, 8, 9); //Declaring Array

  def main(args: Array[String]): Unit = {
    myarray(0) = 20;
    myarray(1) = 50;
    myarray(2) = 10;
    myarray(3) = 30;

    //Print: The array
    for (x <- myarray) {
      println(x)
    }
    //Print: The array
    for (i <- 0 to (myarray.length - 1)) {
      println(myarray(i))
    }

    //Concat arrays
    val result = concat(myarray, myarray3);
    println("Concat arrays")
    for (x <- result) {
      println(x)
    }
  }
}
