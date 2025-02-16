package Demo

// Scala - Currying
/* Currying is the technique of transforming a function
   that takes multiple arguments into a function
   that takes a single argument. */
object Demo {
  def add = (x: Int, y: Int) => x + y;
  def add2(x: Int) = (y: Int) => x + y;
  def add3 (x: Int) (y: Int) = x + y; //Another definition for Curried function

  def main(args: Array[String]): Unit = {
    println(add(20, 10)) //Output: 30
    println(add2(20)(30)); //Output: 50

    val sum40 = add2(40);
    println(sum40(100)); //Output: 140

    val sum50 = add3(50)_;//_ Means a second argument that we are going to pass later
    println(sum50(400));//Output: 450
  }
}
