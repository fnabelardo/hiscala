package Demo

// Scala - Fully Applied Functions
object Demo {

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    println(sum(10, 20, 30))
  }
}
