package Demo

object Demo {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def square(x : Int) = x * x
  }

  def main(args: Array[String]): Unit = {
    var add = (x: Int, y: Int) => x + y;
    println(add(300, 200))
    println("Math add: " + Math.add(45, 15))
    println("Math square: " + (Math square 3));
  }
}
