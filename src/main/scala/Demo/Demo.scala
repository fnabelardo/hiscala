package Demo

object Demo {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def square(x : Int) = x * x
  }

  def subtract(x : Int, y : Int) : Int = {
    x - y;
  }

  def multiply(x : Int, y : Int) : Int = x * y;

  def divide(x : Int, y : Int) = x / y;

  def main(args: Array[String]): Unit = {
    println("Math add: " + Math.add(45, 15))
    println("Math square: " + Math.square(3));
    println("subtract: " + subtract(45, 15))
    println("multiply: " + multiply(45, 15))
    println("divide: " + divide(45, 15))
  }
}
