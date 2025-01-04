public class ArrayAddition {
    public static void main(String[] args) {
        int A[] = {2, 3, 5};
        int B[] = {4, 3, 5};

        // Create a new array to store the result
        int C[] = new int[A.length];

        // Add corresponding elements from A and B
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print the result
        System.out.print("Resultant array C: ");
        for (int value : C) {
            System.out.print(value + " ");
        }
    }
}
