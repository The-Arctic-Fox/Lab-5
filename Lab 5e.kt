open class person(val name: String, val age: Int) {}
class mathTeacher(val teacherName: String, val teacherAge: Int, val teach: String) : person(teacherName, teacherAge){}
class footballer(val ballerName: String, val ballerAge: Int, val team: String) : person(ballerName, ballerAge){}
class businessman(val newName: String, val newAge: Int, val business: String) : person(newName, newAge){}

fun main(){
    val mathTeacher = mathTeacher("R. Gunthrey", 50, "Statistics at CSUSB")
    val footballer = footballer("P. Rivers", 38, "Old QB for the Chargers")
    val businessman = businessman("W. Hostler", 55, "Allan's boss at Siemens")

    println(mathTeacher.teacherName)
    println(mathTeacher.teacherAge)
    println(mathTeacher.teach)
    println()

    println(footballer.ballerName)
    println(footballer.ballerAge)
    println(footballer.team)
    println()

    println(businessman.newName)
    println(businessman.newAge)
    println(businessman.business)
}
