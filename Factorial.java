import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print its factorial");
        int n=sc.nextInt();
        int Fact=1,i=n;
        for(;i>=1;i--){
            Fact*=i;
            System.out.print(i+"*");
        }
        System.out.print("=" + Fact + " Is the Factorial of the number " +n+ ".");
    }
}
