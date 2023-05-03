// WAP to Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
import java.util.Scanner;
public class Operatorsbyswitchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an operator (+,-,*,/,%)");
        char op=sc.next().charAt(0);
        System.out.println("Enter the first operand to calculate");
        double num1=sc.nextDouble();
        System.out.println("Enter the second operand to calculate");
        double num2=sc.nextDouble();
        switch (op){
            case'+':
                System.out.println("The addition of entered two operands is "+(num1+num2));
                break;
            case'-':
                System.out.println("The subtraction of entered two operands is "+(num1-num2));
                break;
            case'*':
                System.out.println("The multiplication of entered two operands is "+(num1*num2));
                break;
            case'/':
                System.out.println("The quotient by division of entered two operands is "+(num1/num2));
                break;
            case'%':
                System.out.println("The remainder by division of entered two operands is  "+(num1%num2));
                break;
            default:
                System.out.println("The entered operator is invalid");
        }
    }
}
