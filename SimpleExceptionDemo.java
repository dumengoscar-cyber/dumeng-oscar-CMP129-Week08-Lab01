//name: oscar dumeng
// date: 10/29/2026
// lab: 1
// week: 8
// course: cmp129

public class SimpleExceptionDemo {
public static void safeDivide(int numerator, int denominator)
{
    //checks for a exception
    try {
       int result = numerator / denominator;
System.out.println("result: " + result);
//looks for division by 0
    } catch(ArithmeticException e){
        System.out.println("error: cant divide by 0");
        //starts to print results after 
    }finally{
        System.out.println("division is complete"); 
    }
 }
 public static void main(String[] args){
    safeDivide(10, 5);
    safeDivide(15, 0);
    safeDivide(-30, 6);
 }
}
