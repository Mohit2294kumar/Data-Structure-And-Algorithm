public class BinarySearch{
    static int Search(int arr[], int x, int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return mid;
            }else if (arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    return -1;
    }
    public static void main(String[] args){
        int arr[] = {10, 20,30,40,50,100,4546};
        int x=144;
        int index = Search(arr, x,0, arr.length-1);
        if (index==-1){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is present at position"+index);
        }
    }
}