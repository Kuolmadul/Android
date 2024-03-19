class person {
    var name = "John"
    var age = 89
    //var email = ""

}






fun main(){
    println("Enter your name:")
    val name = readLine()!!
    println("Enter your age:")
    val age = readLine()!!.toInt()

    println("Hello, $name! You are $age years old")
}