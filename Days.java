//Write a program to print day based on the day number-1 to 7 - Monday to Sunday.
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number between 1 to 7");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Entered day number is Monday");
                break;
            case 2:
                System.out.println("Entered day number is Tuesday");
                break;
            case 3:
                System.out.println("Entered day number is Wednesday");
                break;
            case 4:
                System.out.println("Entered day number is Thursday");
                break;
            case 5:
                System.out.println("Entered day number is Friday");
            break;
            case 6:
                System.out.println("Entered day number is Saturday");
                break;
            case 7:
                System.out.println("Entered day number is Sunday");
                break;
            default:
                System.out.println("Entered day number is invalid");
        }
    }
}
