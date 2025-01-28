package Demo

object Demo {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 5) {
      println("i using to " + i)
    }

    for (i <- 1 until 6) {
      println("i using until " + i)
    }

    // Nested for loop
    for (i <- 1 until 9; j <- 1 to 3) {
      println("i using until " + i + " " + j)
    }

    val lst = List(1,2,3,4,5,6,79,54,6,98)
    for (i <- lst) {
      println("i using lst " + i)
    }

  }
}
