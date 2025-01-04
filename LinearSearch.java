class LinearSearch { 
	static int search(int arr[], int x) { 
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] == x) {
				return i;
            } 
		} 
		return -1; 
	} 
	public static void main(String[] args) { 
		int[] arr = { 3, 4, 1, 7, 5 };
		int x = 5; 
		int index = search(arr, x); 
		if (index == -1){ 
			System.out.println("Element is not present in the array"); 
        }else{
			System.out.println("Element found at position " + index);
        } 
	} 
} 
