package Demo

object Demo {
  def main(args: Array[String]): Unit = {

    // Loop with range "to"
    for (i <- 1 to 5) {
      println("i using to " + i)
    }

    // Loop with range "until"
    for (i <- 1 until 6) {
      println("i using until " + i)
    }

    // Nested for loop
    for (i <- 1 until 9; j <- 1 to 3) {
      println("i using until " + i + " " + j)
    }

    // List as range in for loops
    val lst = List(1,2,3,4,5,6,4,5,6,98)
    for (i <- lst) {
      println("i using lst " + i)
    }

    // List as range and if as filter in for loops
    for (i <- lst; if i < 6) {
      println("i using lst " + i)
    }

    // Loop as expression - Result: List
    val result = for {i <- lst; if i < 6} yield {
      i * i
    }

    println("result " + result)

  }
}
