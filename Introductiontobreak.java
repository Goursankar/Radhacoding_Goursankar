import java.util.Scanner;
public class Introductiontobreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(;n%5==0;n++){
           if(n%7==0){
               System.out.println(n+" divisible by 5 and 7");
           }else{
               break;
           }
        }
    }
}
