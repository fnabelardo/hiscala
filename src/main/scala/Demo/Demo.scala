package Demo

// Scala - Maps
/* A Map is an Iterable consisting of pairs of keys and values */
object Demo {

  val myMap : Map[Int, String] =
    Map(801 -> "Max", 802 -> "Jhon", 804 -> "Doe")

  def main(args: Array[String]): Unit = {
    println(myMap) //Output: Map(801 -> Max, 802 -> Jhon, 804 -> Walter)
    //Get value by key
    println(myMap(802)); //Output: Jhon

    //Get keys of Map
    println(myMap.keys); //Output: Set(801, 802, 804)

    //Get values of Map
    println(myMap.values); //Output: Iterable(Max, Jhon, Doe)

    //Check if  Map is empty
    println(myMap.isEmpty); //Output: false

    //Print Key and Value of Map
    myMap.keys.foreach{ key =>
      print("Key: " + key).toString;
      println(" Value: " + myMap(key));
    }

    //Check if Map contain a key
    println(myMap.contains(801)); //Output: true
  }

}
