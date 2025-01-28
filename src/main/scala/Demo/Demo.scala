package Demo

object Demo {
  def main(args: Array[String]): Unit = {
    val age = 50

    // Match as statements
    age match {
      case 20 => println("age: " + age);
      case 18 => println("age: " + age);
      case 30 => println("age: " + age);
      case 40 => println("age: " + age);
      case 50 => println("age: " + age);
      case _ => println("default");
    }
    
  }
}
