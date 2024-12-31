import java.util.Scanner;

public class TaxSlab {
    public static int calculateIncome(int income){
        int tax=0;
        if(income<=10000){
            return income;
        }else if(10000 < income &&  income<= 25000){
            tax=(income*10)/100;
            income-=tax;
            return income;
        }else if(25000<income && income<=50000){
            tax=(income*20)/100;
            income-=tax;
            return(2500 + income);
        }else{
            tax=(income*30)/100;
            income-=tax;
            return (5000 + income);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter you Salary :");
        int income=sc.nextInt();
        System.out.println(calculateIncome(income));
    }
    
}
