
 class Calculator{

     fun Add(left: Int, right: Int): Int{
         return left + right
     }
     fun Subtract(left: Int, right: Int): Int{
         return  left-right
     }
     fun Muliply(left: Int, right: Int): Int{
         return left*right
     }
     fun Divide(left: Int, right: Int): Double{
         if(right==0){
             throw ArithmeticException("Division by zero is not possible!")
         }
         return left.toDouble()/right.toDouble()
     }

 }