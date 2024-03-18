fun main(){
   var math:Int= 21
    var chem:Int= 21
    var phyc:Int = 21
    var Bio:Int = 11

    var total:Int= math + chem + phyc + Bio
    if (total> 400){
     println("Invalid")
    }else{
     println("Marks = " + total)
    }

    var average:Int= total/4
 if (average > 100){
  println("Invalid")
 }else {
  println("avarage = " + average)
 }

    if(average > 100 ){
    println("Invalid")}
    else if (average >= 96){
    println("Grade: A")}
    else if(average >=81 ){
    println(" Grade: A-")}
    else if (average >=71 ){
    println("Grade: B+")}
    else if (average >=61 ){
    println("Grade: B")}
    else if (average >=51 ){
    println("Grade: B-")}
    else if (average >=41 ){
    println("Grade: C+")}
    else if(average >=33 ){
    println("Grade: C")}
    else if (average >=21 ){
    println("Grade: C-")}
    else if(average >=20 ){
    println("Grade: D+")}
    else{
    println(" Failed")}

}