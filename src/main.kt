// Think of class as a template in OOP that is used to make an object. -> drawing of the object.
//Object has attributes/states which is the data , and it has behaviours which in this case
// are functions that the object can perform.
//OOP
//A technique used to break d own a complex problem into smaller bits by creating objects.
//A class has a name
//The body of a class is denoted  by curly braces.
//An object is an instance of a class.
fun main () {
    var toyota = Car("Toyota","Prado","KCT 123B",0,"Susan")
    var subaru = Car("Subaru","Forester","KCV 001R",0,"Mary")
    toyota.start()
    println(toyota.speed)
    toyota.accelerate(30)
    println(toyota.speed)
    subaru.start()
    println(subaru.registration)
    toyota.hoot()
    println( toyota.designer)
    toyota.decelerate(20)
    println(toyota.speed)
    toyota.stop()
    println(toyota.speed)
    var susan = Student("Susan",22,"AnitaB")
    println(susan.stream)
}
class Car (var make: String , var model: String , var registration: String, var speed: Int, var designer : String) {

    fun start () {
        println("Vumuuuu...uu,Vuuumuuu")
    }
    fun accelerate (acceleration: Int):Int {
        speed+=acceleration
        println("Current speed is $speed")
        return acceleration
        return speed
    }
    fun hoot () {
        println("Peeeeeepeeeeeepepepe")
    }
    fun decelerate (deceleration:Int):Int {
        speed-=deceleration
        println("The speed has reduced to $speed")
        return speed
    }
    fun stop () {
        speed = 0

        println("The speed is $speed")
    }

}
// data class used to hold data.
data class  Student(var name: String,var age:Int,var stream:String) {

}
//Principles of OOP
// Encapuslation
//This principle states that all important information is contained
// inside an object and only select information is exposed.
