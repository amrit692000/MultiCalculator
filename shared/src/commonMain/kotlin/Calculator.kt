
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
     fun Divide(left: Int, right: Int): Int{
        if(right==0)
            ArithmeticException("division by zero not allowed")
         return left/right
     }

 }
