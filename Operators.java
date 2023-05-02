import java.util.Scanner;
public class Operators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("addition="+ (a+b));
        System.out.println("subtraction="+ (a-b));
        System.out.println("multiplication="+ (a*b));
        System.out.println("division="+(a/b));
        System.out.println("remainder="+ (a%b));

    }
}
