//wap to check whether the number entered by the user is a Lid number or not.
import java.util.Scanner;
public class LidNumber {
    public static void main(String[] args) {
        int evensum=0,oddsum=0,remainder;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether the entered number is a Lid number or not");
        int number=sc.nextInt();
        while(number>0) {
            remainder = number % 10;
            if (remainder % 2 == 0) {
                evensum +=remainder;
            }else {
                oddsum += remainder;
            }number = number / 10;
                if (evensum == oddsum) {
                System.out.println("Entered number is a Lid number");
            }else{
                System.out.println("Entered number is not a Lid number");
            }
        }

    }
}