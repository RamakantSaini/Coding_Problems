import java.util.Scanner;
public class findAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rate of the item : ");
        double rate=sc.nextDouble();
        System.out.print("Quantity of an item : ");
        double quantity=sc.nextDouble();
        double amt=rate*quantity;
        if(amt>2000){
            amt=amt-((15*amt)/100);
            System.out.println("Amount to be paid after discount : "+ amt);
        }else{
            System.out.println("Amount to be paid : "+amt);
        }
       
    }
    
}
