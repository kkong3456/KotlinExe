//두개주사위 눈의 합이 6이 되는 모든 경우의수
var xxx=mutableMapOf<Int,Int>()
fun twoDice():Unit{
    for(x in 1..6){
        for(y in 1..6){
            if((x+y)==6){
                xxx[x]=y
            }
        }
    }
    println(xxx)
}

twoDice()

