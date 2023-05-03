//Q4 - Write a program to print positive number entered by the user, if user enters a positive number
// it is multiplied by 9 ,if user enters a negative number, it is skipped.
import java.util.Scanner;
public class PositiveNumbersOnly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Entered number is a positive number and the number entered multiplied by 9 is "+ number*9);
        }else{
            System.out.println(" entered number is a negative number hence it will be skipped,try entering a positive number to get result.");
        }
    }
}
