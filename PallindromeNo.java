import java.util.Scanner;
public class PallindromeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if the entered number is a pallindrome number or not");
        int n=sc.nextInt();
        int sum=0,num=n,r;
        for(;n>0;){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }if(sum==num) {
            System.out.println("The number entered " + num + " is a pallindrome number");
        }else{
            System.out.println("The number entered "+ num + " is not a pallindrome number");
        }
    }
}
