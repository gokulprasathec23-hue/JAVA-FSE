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
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int prev=i;
            for(int j=i+1;j<n;j++){
                if(arr[prev]>arr[j]){
                    prev=j;
                }
            }
            int temp=arr[prev];
            arr[prev]=arr[i];
            arr[i]=temp;
        }
    }
}
