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

  }
}
