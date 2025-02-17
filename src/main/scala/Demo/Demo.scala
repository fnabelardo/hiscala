package Demo

// Scala - Arrays
object Demo {
  var myarray: Array[Int] = new Array[Int](4)//Declaring Array
  var myarray2 = new Array[Int](5)//Declaring Array
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
    for (i <- 0 to (myarray.length -1)) {
      println(myarray(i))
    }
  }
}
