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

    // Match as expression
    val result = age match {
      case 20 => age;
      case 18 => age;
      case 30 => age;
      case 40 => age;
      case 50 => age;
      case _ => "default";
    }

    println("result = " + result)

    // Evaluate multiple cases
    var i = 7;
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd");
      case 0 | 2 | 4 | 6 | 8 | 10 => println("even");
    }

  }
}
