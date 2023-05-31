//- Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//calculate Profit or Loss.
import java.util.Scanner;
public class Calculation_of_Profit_or_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the product");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price of the product");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("Profit from the product sold is - Rs " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("Loss from the product sold is - Rs " + (cp - sp));
        } else {
            System.out.println("Neither Profit nor Loss from the product sold");
        }
    }
}