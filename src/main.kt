import java.util.Objects

//A list is a generic or

fun main () {
    //immutable lists can't add elements to it.Once created cannot change size of the list
    val codeHive = listOf("AnitaB" , "Lovelace" , "Lisalab")
    codeHive.forEach { x ->
        println(x)
    }
    println(codeHive)

    //mutable lists allows adding and removing elements to its.
    var colours = mutableListOf("Red", "Blue" , "Green")
    colours.add("Yellow")
    colours.remove("Red")
    println(colours)

    var numbers = listOf(19,18,20,18,19,21,22,23,23,22,24,21)
    //counts the number of elements in a list
    println( numbers.count())
    //println(numbers.size())
    //suming up the elements in a list
    println(numbers.sum())
    //getting the least element in a list or Null if list is empty
    println(numbers.minOrNull())
    //getting the maximum element in a list or Null if list is empty
    println(numbers.maxOrNull())
    //getting the average of elements in a list
    println(numbers.average())
    //get first element
    println(numbers.first())
    //getting the last element
    println(numbers.last())
    //Accessing elements in a list using indexing
    println(numbers[9])
    println(numbers.get(3))
    //getting index of element in a list
    println(numbers.indexOf(21))
    println(numbers.lastIndex)
    println(numbers.lastIndexOf(23))

    //Iteration through lists
    numbers.forEach { x ->
        println(x)
    }
    //sorting lists in ascending order
    var numsSorted = numbers.sorted()
    println(numsSorted)
    getSquare(listOf(1,2,3,4,5,6,7,8,9))
    var Toyota = Car("Toyota","Corolla")
    var ford = Car("Ford","Fiesta")
    var audi = Car("Audi","A6")
    var opel = Car("Opel","opel")
    //Creating a list from a customed class(type) either class or data class
    var myCars = listOf(Toyota,ford,audi,opel)
    println(myCars)
    var modelsCar = listOf(Toyota.model,ford.model,audi.model)
    for (x in modelsCar) {
        println(x)
    }
    //In a scalable way of looping through a list
    myCars.forEach { car ->
        println(car.model)
    }
    //Sorting object according to their attributes in ascending order
    var sortedCars = myCars.sortedBy { car -> car.make}
    println(sortedCars)
    //sorting an object according to its attributes in descending order
    var sortedCar = myCars.sortedByDescending { car -> car.model }
    println(sortedCar)
    var fruits = mutableListOf<String>()
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Mango")
    fruits.add("Avocado")
    println(fruits)
    fruits.remove("Apple")
    println(fruits)
    fruits.add(2,"Grapes")
    println(fruits)
    fruits.removeAt(3)
    fruits[1] = "Pear"
    println(fruits)
    var longNames = fruits.filter { fruit -> fruit.length>5 }
    println(longNames)
    var susan = Person("Susan", 22)
    var Grace = Person("Gracel",13)
    var Judy = Person("Judy",10)
    println( Car(myCars))


    var Names = mutableListOf(susan,Grace,Judy)
    println(Names)
    println(People(Names))

     var adults = Names.filter { person -> person.age>=18 }
    println(adults)



}
  fun getSquare (numbers:List<Int>) {
      numbers.forEachIndexed { index,i->
          if(index%2!=0){
              println(i*i)
          }

      }
      for (x in numbers ) {
          println(x)
      }
  }
data class  Car (var make:String, var model:String)
fun Car (cars:List<Car>): List<String>{
    var models = mutableListOf<String>()
    var vowels = listOf('a','e','i','o','u')
    cars.forEach { x ->
        if (vowels.contains(x.model.first().lowercaseChar())){
            models.add(x.model)

        }

    }
 return models
}
data class Person (var name:String, var age:Int)
  fun People (person:List<Person>):List<String> {
      var names = mutableListOf<String>()
      var consonants = listOf('a','b','c','d','e','f','g','h','i')
      person.forEach { p ->
          if (consonants.contains(p.name.elementAt(0).lowercaseChar())){
              names.add(p.name)
          }
      }
    return names
  }



