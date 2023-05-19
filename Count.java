 import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count the number of digits of the number");
        int n = sc.nextInt();
        int c=0;
        for(int num=n;num>0;c++){
            num=num/10;
        } System.out.println("The number of digits present in the number " + n +" are " + c);
    }
}
