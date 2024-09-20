/** Grade Calculator */
package ex_20092024;

public class lab28 {
    public static void main(String[] args) {
        int Marks=72;
        String Grade="F";
        if(Marks>=90 && Marks<=100)
            System.out.println("Grade: " + "A");
        else if (Marks>=80 && Marks<=89)
            System.out.println("Grade: " + "B");
        else if (Marks>=70 && Marks<=79)
            System.out.println("Grade: " + "C");
        else if (Marks>=60 && Marks<=69)
            System.out.println("Grade: " + "D");
        else if (Marks<=0 || Marks>=100)
            System.out.println("Invalid !!");

        else System.out.println("Grade: "+ Grade);
    }
}
