import java.util.*

fun main () {  // entry point for the entire program
    var numbers = arrayOf(12,456,32,535,3,2,78,1)
    println(numbers[3])   //one can create an array of all different data types.
    var friends = arrayOf("Amos","Fred","Brian")
    var country = arrayOf("Kenya", 52000000 , 65 ,"Nairobi","demcracy",0.95)
    var tableOne = arrayOf("Tessa","Nyawera","Angela","Maryann","Mercy","Naima")
    //var x = tableOne[3]   // indexing using square-brackets
    tableOne.set(3,"Brenda")
     println(tableOne.contentToString())
    var table2 = tableOne.plus("Susan")
    println(table2.contentToString())
    // discarding the original array with 6 elements and assigning the new array of 7 elements with tableOne
    tableOne = tableOne.plus("Susan")
    println(tableOne.contentToString())
    // shuffling elements in array
    var ang = tableOne[2]
    var mer = tableOne[4]
    tableOne.set(2,mer)
    tableOne.set(4,ang)
    println(tableOne.contentToString())
    //Adding two arrays together
    var table3 = arrayOf("Conslate","Caro","Esther","Joan")
    var table4 = tableOne.plus(table3)
    println(table4.contentToString())
    println(Arrays.toString(table4))
    //Getting index of an element in an array.
    var index = table4.indexOf("Conslate")
    println(index)

    // in built functions for arrays
    var num = arrayOf(1,2,4,5,6,78,7,6,556,4)
    println(num.contentToString())
    println(num.count())
    println(num.sum())
    println(num.minOrNull()) // prints out the minimum value in the array
    println(num.maxOrNull()) // prints out the maximum value in the array

    // Looping through arrays using built-in functions
    num.forEach { number ->
        println(number) // block variable
        //println(number * number )
        //majina(arrayOf("susan","tessa"))
    }
        var names2 = arrayOf("Frida","Zainab","Amanda","Kate")
        println(names2.sortedArray().contentToString())

}


//    fun majina(names:Array<String>) {
//
//        names.forEach { name ->
//            println(name.uppercase())
//        }}
