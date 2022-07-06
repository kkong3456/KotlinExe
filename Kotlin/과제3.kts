//계산기1
class Calculator1(num1:Int,num2:Int){
    val num1:Int
    val num2:Int
    init{
        this.num1=num1
        this.num2=num2
    }

    fun plusArth():Int{
        return num1+num2
    }
    fun minusArth():Int{
        return num1-num2
    }
    fun productArth():Int{
        return num1*num2
    }
    fun divideArth():Int{
        return num1/num2
    }
}

val xxx1=Calculator1(5,5)
println(xxx1.plusArth())
println(xxx1.minusArth())
println(xxx1.productArth())
println(xxx1.divideArth())

//계산기2
class Calculator2 constructor(num1:Int=0){
    val num1:Int
    init{
        this.num1=num1
    }

    fun calculator(operator:Char,num2:Int):Int{
        if(operator=='+'){
            return num1+num2
        }else if(operator=='-'){
            return num1-num2
        }else if(operator=='*'){
            return num1*num2
        }else if(operator=='/' && num2!=0){
            return num1/num2
        }else{
            println("잘목된 연산입니다.")
            return 0
        }
    }
}

val calculator=Calculator2(5)
println(calculator.calculator('+',5))
println(calculator.calculator('-',5))
println(calculator.calculator('*',5))
println(calculator.calculator('/',5))
println(calculator.calculator('?',5))

//계산기3

