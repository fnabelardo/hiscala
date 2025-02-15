package Demo

// Scala - Partially Applied Functions
import java.util.Date
object Demo {

  //Real world example
  def log(date : Date, message : String): Unit = {
    println(date.toString + "  " + message)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    // _: Wild card
    val f = sum(10, 20, _ : Int)
    val y = sum(10, _: Int, _ : Int)
    println(f(30)) //Output: 60
    println(y(40, 30)) //Output: 80

    //Real world example
    val date = new Date;
    val newLog = log(date, _ :String)
    newLog("The message 1");
    newLog("The message 2");
    newLog("The message 3");
    newLog("The message 4");
  }
}
