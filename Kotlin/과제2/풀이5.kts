val grades=arrayOf<Int>(70,71,72,77,78,79,80,82,90,99)

val passOrNot=Array<Boolean>(10,{true})
fun passOrNot():Unit{
    for ((index,grade) in grades.withIndex()){
        if(grade>=80){
            passOrNot[index]=true
        }else{
            passOrNot[index]=false
        }
    }
//    println(passOrNot[0])
//    for((index,grade) in passOrNot.withIndex()){
//        println(index+" : "+grade)
//    }
    for (i in 0 until passOrNot.size){
        println(passOrNot[i])
    }
}

passOrNot()

