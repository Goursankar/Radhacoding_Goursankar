import java.util.Scanner;
public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the entered number is Even or Odd");
        int n=sc.nextInt();
        if(n%2==0) {
            System.out.println("The number entered is a Even number");
        }else{
            System.out.println("The number entered is a Odd number");
        }
    }
}
