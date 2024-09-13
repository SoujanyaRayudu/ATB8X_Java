/* Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
double a = 34;
double b = 10;
Print - a+b, a-b, ab, a/b, a%b all the outputs.
*/

package ex_13092024;

public class lab003 {
    public static void main(String[] args) {
       double a =34,b=10;
       //using formatters
        System.out.printf("%f + %f = %f %n",a,b,a+b);
        System.out.printf("%f - %f = %f %n",a,b,a-b);
        System.out.printf("%f * %f = %f %n",a,b,a*b);
        System.out.printf("%f / %f = %f %n",a,b,a/b);
        System.out.printf("%f / %f = %f %n",a,b,a%b);
    }
}
