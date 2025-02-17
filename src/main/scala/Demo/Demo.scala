package Demo

// Scala - String
object Demo {

  val str1 : String = "Hello World"
  val str2 : String = " Noel"

  def main(args: Array[String]): Unit = {
    println(str1.length())
    println(str1.concat(str2))
    println(str1 + str2)
  }
}
