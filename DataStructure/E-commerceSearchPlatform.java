import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an Target Number:");
        int target=sc.nextInt();
        System.out.println("Enter Number Of Elements in an Array");
        int n=sc.nextInt();
        int arr[] =new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Enter a Number:");
            int d =sc.nextInt();
            arr[i]=d;
        }
        int result=BinarySearch(arr,target,0,n-1);
        
        if(result!=-1){
            System.out.print("Element found at the index of:"+result);
        }else{
             System.out.print("Element not found");
        }
    }
    public static int BinarySearch(int arr[],int target,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]< target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
