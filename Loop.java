import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number upto you want to print");
        int n=sc.nextInt();
        //int num=1,sum=0;                                                              //num=Initial value starting from 1.
        //while(num<=n){                                                                //using while loop
        //    System.out.print(num +",");                                               //printing 1 to n
        //    sum+=num;
        //    num++;
        //}
        //System.out.println("sum = "+sum);                                              //printing the sum of 1 to n
        //int sum=0;
        //for(int num=1;num<=n;num++) {                                                    //using for loop
        //    System.out.print(num + ",");                                                 //printing 1 to n
        //    sum += num;
       // }
        // System.out.println("sum = "+sum);                                                //printing the sum of 1 to n
       // int sum=0;
       // for(int num=n;num>0;num--){                                                         // using for loop
       //     System.out.print(num + ",");                                                    //printing n to 1
         //   sum += num;
        //}
       // System.out.println("sum = "+sum);                                                   //printing the sum of n to 1
        do{                                                                                   //using do while loop
            System.out.println(n);                                                            //printing n
            n++;
        }while(n<=10);                                                                        //checking if n<=10 or not
    }
}
