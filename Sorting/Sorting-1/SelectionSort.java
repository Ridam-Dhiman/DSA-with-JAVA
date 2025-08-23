class SelectionSort{
    public static void main(String args[]){
        int a[] = {56, 98, 12, 66};
        Sort(a, 4);
    }
    public static void Sort(int arr[], int n){
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j <= n-1; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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