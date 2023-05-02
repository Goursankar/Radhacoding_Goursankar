//Write a program which takes the values of length and breadth from user and check if it is a square or
//not,if it is a square then find its area.
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lenght");
        int length=sc.nextInt();
        System.out.println("Enter the Breadth");
        int breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("It is a Square and its area is "+(length*breadth));
        }else{
            System.out.println("It is not a Square");
        }
    }
}
