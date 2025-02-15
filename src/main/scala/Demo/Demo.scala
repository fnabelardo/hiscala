package Demo

// Scala - Closures
/* A closure is a function which uses one or more
 variables declared outside this function. */
import java.util.Date
object Demo {
  var number = 10;
  val add = (x : Int) => x + number;

  def main(args: Array[String]): Unit = {
    println(add(20)) //Output: 30
  }
}
