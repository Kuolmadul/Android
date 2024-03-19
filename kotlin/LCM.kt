fun gcd(a: Int, b:Int):Int {
    return if (b == 0) a else gcd(b, a % b)
}
fun lcm(a: Int,b: Int):Int{
return (a*b)/gcd(a,b)
}

fun main(){
    println("Enter the first number:")
    val num1 = readLine()!!.toInt()
    println("Enter the second number:")
    val num2 = readLine()!!.toInt()
    val result = lcm(num1, num2)
    println("LCM of $num1 and $num2 is $result")

}