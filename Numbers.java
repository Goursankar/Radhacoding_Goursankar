//- Write a program to calculate marks to grades.
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage of marks recieved betwwen 1 to 100");
        int n=sc.nextInt();
        if(n>=90&&n<=100) {
            System.out.println("Your grade received is A+");
        }else if(n>=80&&n<=90) {
            System.out.println("Your grade received is A");
        } else if(n>=70&&n<=80){
            System.out.println("Your grade received is B+");
        }else if(n>=60&&n<=70){
            System.out.println("Your grade received is B");
        }else if(n>=50&&n<=60){
            System.out.println("Your grade received is C");
        }else if(n>=40&&n<=50){
            System.out.println("Your grade received is D");
        }else if(n>=30&&n<=40){
            System.out.println("Your grade received is E");
        }else if(n>=0&&n<=30) {
            System.out.println("Your grade received is F");
        }else{
            System.out.println("Entered percentage of marks is not between 1 to 100");
        }
    }
}
