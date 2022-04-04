fun main () {
    var banker = Banker("Brenda",23)
    var farmer = Farmer("Effence",26)
    var doctor = Doctor("Susan",24)
    banker.sleep()
    farmer.sleep()
    doctor.name
    farmer.cultivateLand()
    banker.name
    println( banker.name)
    println( banker.countMoney(arrayOf(2000,3000,5000,8000)))
    doctor.treatPatient("Mary","Malaria")
    println(banker is Banker)
    println(farmer is Person)
    println(doctor.name)

   farmer.talk("The weather is bad akiii...,but the output is still amazing, Good job!!")
    farmer.eat()
    banker.eat()
    doctor.eat()
    farmer.introduction()
    doctor.introduction()
    banker.introduction()


}
//create a parent class from which these other classes inherit and we should make
// open to be accessible
open class  Person (var name: String , var age: Int){

    open fun talk(words:String) {
        println(words)
    }

    open fun eat () {
        println("yum")
    }

    fun sleep () {
        println("zzzzzz")
    }
   open fun introduction () {
        println("Hi, my name is $name")
    }
}
//Banker is the primary constructor that helps in creating the        println("$name is counting $sum dollars. ") object
class Banker ( name: String,  age: Int):Person(name,age) {


    fun countMoney(notes:Array<Int>):Int {

        var sum = 0
        notes.forEach { note ->
            sum+=note
        }
        return sum
    }

    override fun introduction() {
        super.introduction()

    }

}
class Doctor ( name: String,  age: Int):Person(name,age) {


    fun treatPatient (patient:String, disease: String) {
        println( "Dr.$name who is aged $age years old, is treating $patient for $disease")
    }

    override fun eat() {
        //super.eat()
        println("yum yum nyum")
    }

    override fun introduction() {
        //super.introduction()
        println("Hi ,my name is Dr. $name")
    }
}
class Farmer( name: String,  age: Int) :Person(name, age) {


    fun cultivateLand () {
        println("dig dig dig")
    }

    override fun talk(words: String) {
        super.talk(words)
        println(" But $name the  output is  still good.")
    }

    override fun eat() {
        //super.eat()
        println("I am eating all the food that i have grown")
    }
}
//Overriding parent class functions- implementing what the parent class is supposed to
// do but add ur own functionality using the override keyword.
// If need to do ur own without the parent class ue just omit super keyword.


//Imagine our Person class has fun introduction that prints out