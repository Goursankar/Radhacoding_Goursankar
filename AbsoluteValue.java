//- Write a program to print absolute value of a number entered by the user.
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print absolute value");
        int number=sc.nextInt();
        if(number<0) {
            System.out.println("The absolute value of the number is " + (number = number * -1));
        }else{
            System.out.println("THe absolute value of the number is "+ number);
        }
    }
}
