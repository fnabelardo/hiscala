package Demo

// Scala - String
object Demo {

  val num1 = 75;
  val num2 = 100.25;
  val str1 : String = "Hello World"
  val str2 : String = " Noel"

  def main(args: Array[String]): Unit = {
    println(str1.length())
    println(str1.concat(str2))
    println(str1 + str2)

    val result = printf("(%d --%f --%s)", num1, num2, str1);
    println(result);//Output: (75 --100.250000 --Hello World)()
    println("(%d --%f --%s)".format(num1, num2, str1));//Output: (75 --100.250000 --Hello World)
    printf("(%d --%f --%s)", num1, num2, str1);//Output: (75 --100.250000 --Hello World)
  }
}
