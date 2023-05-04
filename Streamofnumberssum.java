// wap to print the sum of all the stream of numbers.
import java.util.Scanner;
public class Streamofnumberssum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Stream of numbers sum to be print");
        int n=sc.nextInt();
        int sum=0;
        while(n!=-1){
            sum+=n;
            n=sc.nextInt();
        }
        System.out.println("The sum of the entered stream of numbers = "+sum);
    }
}
