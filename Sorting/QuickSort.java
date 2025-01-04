public class QuickSort{
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int Partition = partition(arr, low, high);
            quickSort(arr, low, Partition-1);
            quickSort(arr, Partition+1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 1, 7, 2, 5, 0};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}