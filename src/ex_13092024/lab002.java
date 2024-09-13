package ex_13092024;/* Write a program to print the table of number which user will give( int num 10)
output will be like this by using the printf() ,
10 × 1 = 10
10 × 2 = 20
10 × 3 = 30….
10 × 10 = 100.*/

public class lab002 {
    public static void main(String[] args) {
    int num=10;
        System.out.printf("...10 Table.. %n");
       // System.out.printf("%n");  Prints a new line
        System.out.printf("%d * %d =%d %n",num,1,num*1);
        System.out.printf("%d * %d =%d %n",num,2,num*2);
        System.out.printf("%d * %d =%d %n",num,3,num*3);
        System.out.printf("%d * %d =%d %n",num,4,num*4);
        System.out.printf("%d * %d =%d %n",num,5,num*5);
        System.out.printf("%d * %d =%d %n",num,6,num*6);
        System.out.printf("%d * %d =%d %n",num,7,num*7);
        System.out.printf("%d * %d =%d %n",num,8,num*8);
        System.out.printf("%d * %d =%d %n",num,9,num*9);
        System.out.printf("%d * %d =%d %n",num,10,num*10);
    }
}
