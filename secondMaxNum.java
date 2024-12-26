import java.util.Scanner;
public class secondMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[]=new double[3];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the num"+i+":");
            arr[i]=sc.nextDouble();
        }
        double max=Integer.MIN_VALUE;
        double secMax=Integer.MIN_VALUE;
        for(double num:arr){
            if(num>max){
                secMax=max;
                max=num;
            }else if(num>secMax && num<max){
                secMax=num;
            }
        }
        System.out.println("Second Maximum Number : "+secMax);
    }
    
}
