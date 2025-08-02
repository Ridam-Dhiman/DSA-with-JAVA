class Reverse_Array{
    public static void main(String args[]){
        int arr[] = {12, 34, 45, 89, 21};
        print_arr(arr, 5);
        System.out.println();
        // Reverse(arr, 5);
        Reverse_recursion(arr, 0, 5);
        print_arr(arr, 5);

    }
    public static void Reverse(int arr[], int n){
        for(int i = 0; i <= n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        print_arr(arr, n);
    }

    public static void Reverse_recursion(int arr[], int i, int n){
        if(i>=n/2){
            return;
        }
        else{
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            Reverse_recursion(arr, i+1, n);
        }
    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}