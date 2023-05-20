import java.util.Scanner;
public class Sumofdigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum of digits of the number");
        int n = sc.nextInt();
        int sum=0,num=n;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }System.out.println("The sum of digits in the number " + n +" is " + sum);
    }
}
