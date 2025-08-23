class InsertionSort{
    public static void main(String args[]){
        int a[] = {56, 98, 12, 66};
        int a1[] = {1, 2, 3, 4};
        Sort(a, 4);
        Sort(a1, 4);
    }

    public static void Sort(int arr[], int n){
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j -= 1;
            }
        }
        print_arr(arr, n);
    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}