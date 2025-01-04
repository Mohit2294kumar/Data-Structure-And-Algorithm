public class InsertionSort{
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //System.out.println("hello world!");
        int arr[]={7,9,4,2,3,1};
        //printarray("unsorted array "+arr);
        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printarray(arr);
    }
}