public class DescendingOrder {
    public static void printNumbers(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int arr[]={389,600,50};
        printNumbers(arr);  
    }

    
}
