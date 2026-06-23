import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number of Element in an array:");
        int n =sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            arr[i]=d;
        }
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
