import java.util.Scanner;
public class checkingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float num=sc.nextFloat();
        if(num < 0){
            System.out.println("Negative Number");
        }else if(num>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
