package ex_20092024;
import java.lang.Math;
import java.sql.SQLOutput;

public class lab027 {
    public static void main(String[] args) {
        int a=100, b=300;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.addExact(a,b));
        System.out.println(Math.multiplyExact(a,b));
        System.out.println(Math.subtractExact(b,a));
        System.out.println(Math.subtractExact(a,b));

    }
}
