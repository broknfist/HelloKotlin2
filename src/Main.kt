var name1: String? = "Gyuri"
var greeting: String? = "Hello"
val name_konst = "Konstans Feri"

fun main() {
    greetingAll()

    println(helloWorld())
    sayHello()
    println(megValami())

    sayWhatIWant( itemToSay = "Kisregény következik")
    sayWhatIWant( itemToSay = "Mi az email?")
    printOutWithForEach()

}

fun printOutWithForEach(){
    val arrayToPrintOut = arrayOf("Bevásárlólista:", "Kenyér", "Tej", "Szalámi")
    arrayToPrintOut.forEach { beszedesebbNevForEachnek ->
        println(beszedesebbNevForEachnek)
    }
}

fun sayWhatIWant(itemToSay:String){
    println(itemToSay)
}

fun helloWorld(): String{
    return "Hello World!"
}

fun sayHello(){
    println("Azt mondom hello")
}

fun megValami() = "Még valami"

fun greetingAll(): Unit{
    println("$greeting"+" "+"$name1"+"!")
    name1 = "Kati"
    greeting = "Szia"
    println("$greeting"+" "+"$name1"+"!")
    name1 = null
    greeting = null
    println("$greeting"+" "+"$name1"+"!"+" csupa null")
    greeting = "Szevasz"
    name1 = "Dónát"
    println("$greeting"+" "+"$name1"+"!")
    greeting = "Üdv "

    when (greeting) {
        null -> greeting = "Hali"
        else -> greeting = "Jó napot"
    }

    if (name1 != null) {
        println("$greeting "+"$name1"+" és "+"$name_konst")
    } else {
        println("Szevasz $name_konst!")
    }

    val newGreeting = if(greeting != null) "Szevasz" else "Halihó"
    val newGreeting2 = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
}