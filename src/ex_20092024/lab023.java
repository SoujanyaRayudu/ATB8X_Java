/* Print the largest of 3 numbers using Ternary operator*/

package ex_20092024;
public class lab023{
    public static void main(String[] args) {
      //int a=10,b=20,c=15;
        int a=15,b=25,c=10;
        int max= (a>b) ? (a>c?a:c): ((b>c) ? b:c) ;
        System.out.println(max);

    }
}
