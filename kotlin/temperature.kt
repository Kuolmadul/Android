fun celsiusToFahrenheit(celsius:Double):Double
{
return celsius * 9/5 +32
}
fun main(){
    val celsiusTemperature = 20.0
    val fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature)
    println("$celsiusTemperature celsius is equal to $fahrenheitTemperature Fahrenheit")
}