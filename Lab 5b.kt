fun main(){
    val age = 21;

    when (age){
        in 0..20 -> println("Family")
        in 60..100 -> println("Senior")
        !in 0..20, !in 60..100 -> println("Normal")
    }
}