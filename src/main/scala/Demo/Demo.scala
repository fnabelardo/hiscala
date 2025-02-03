package Demo

object Demo {

  def math(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z);

  def main(args: Array[String]): Unit = {
    println(math(50, 20, 10, (x, y) => x + y))
    println(math(50, 20, 10, _+_)) // Equals to println(math(50, 20, 10, (x, y) => x + y))
    println(math(50, 20, 10, (x, y) => x * y))
    println(math(50, 20, 10, _*_)) // Equals to println(math(50, 20, 10, (x, y) => x * y))
    println(math(50, 20, 10, (x, y) => x max y))
    println(math(50, 20, 10, _ max _))// Equals to println(math(50, 20, 10, (x, y) => x max y))
    println(math(50, 20, 10, (x, y) => x min y))
    println(math(50, 20, 10, _ min _))

  }
}
