//
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        double input1=sc.nextDouble();
        System.out.println("Enter Second number");
        double input2= sc.nextDouble();
        System.out.println("Addition is " +(input1+input2));
        System.out.println("Substraction is " +(input1-input2));
        System.out.println("Multiplication is " + (input1*input2));
        System.out.println("Division is " + (input1/input2));
    }
}