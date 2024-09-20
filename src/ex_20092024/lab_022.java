/**Ternary Operators to handle multiple conditions.
 // Input → int score = 85
 // String grade →
 //  score >= 90 → A
 //  score >= 80 → B
 ......... Score >=F
 */
package ex_20092024;
public class lab_022 {
    public static void main(String[] args) {
        int Score=75;
        String grade_1=(Score>=90)?"A":((Score>=80)?"B":(Score>=70)?"C":"F");
         //.......  or
        String grade=(Score>=90 && Score<=100)?"A":((Score>=80 && Score<=89)?"B":((Score>=70 && Score<=79)?"C":"F"));
        System.out.println("Grade --> " + grade_1);
        System.out.println("Grade --> " + grade);

    }
}
