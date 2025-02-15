package Demo

// Scala - Partially Applied Functions
object Demo {

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c

    // _: Wild card
    val f = sum(10, 20, _ : Int)
    val y = sum(10, _: Int, _ : Int)

    println(f(30)) //Output: 60
    println(y(40, 30)) //Output: 80
  }
}
