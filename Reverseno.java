import java.util.Scanner;
public class Reverseno {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print the reverse form of the number");
        int n=sc.nextInt();
        int rev=0,num=n,rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("The reverse form of the number " + num +" is " +rev + ".");
    }
}
