/* Leap Year Calculation  */
package ex_20092024;
public class lab025 {
    public static void main(String[] args) {
        int num=2028;
        if(num%4==0 || num%100 ==0 && num%400 ==0)
            System.out.println(num +" is a Leap year!");
        else
            System.out.println(num +" is not a Leap year!");
    }

}
