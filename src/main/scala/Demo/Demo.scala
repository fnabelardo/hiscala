package Demo

// Scala - Currying
/* Currying is the technique of transforming a function
   that takes multiple arguments into a function
   that takes a single argument. */
object Demo {
  def add = (x: Int, y: Int) => x + y;

  def add2(x: Int) = (y: Int) => x + y;

  def main(args: Array[String]): Unit = {
    println(add(20, 10)) //Output: 30
    println(add2(20)(30)); //Output: 50
  }
}
