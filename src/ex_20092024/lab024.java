/* Write a program that classifies a triangle based on its side lengths.
   Given three input values representing the lengths of the sides, determine
    if the triangle is equilateral (all sides are equal),
    isosceles (exactly two sides are equal), or
    scalene (no sides are equal).
    Use an if-else statement to classify the triangle.
    side1, side2, side3 ->  */
package ex_20092024;

public class lab024 {
    public static void main(String[] args) {
        int side1=20, side2=30, side3=10;
        if(side1 == side2 && side1 ==side3)
        {
            System.out.println("Equilateral triangle");
        }else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("Isosceles  triangle");
        }else
            System.out.println("scalene  triangle");
    }
}
