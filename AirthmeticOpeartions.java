import java.util.Scanner;
public class AirthmeticOpeartions {
    public static double evaluateExpression(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1=sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2=sc.nextDouble();
        System.out.print("Enter the operation you want : ");
        char  operator =sc.next().charAt(0);
        switch(operator){
            case '+':
                return (num1 + num2);
            case '-':
                return (num1-num2);
            case '*':
                return (num1*num2);
            case '/':
                if(num2!=0){
                    return (num1/num2);
                }else{
                    System.out.println("Division by Zero not allowed");
                }
               
            default:
               System.out.println("invalid! operation");
               return Double.NaN;
        }
    }
    public static void main(String[] args) {
        System.out.println(evaluateExpression());
    }
    
}
