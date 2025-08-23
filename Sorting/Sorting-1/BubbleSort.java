class BubbleSort{
    public static void main(String args[]){
        int a[] = {56, 98, 12, 66};
        int a1[] = {1, 2, 3, 4};
        Sort(a, 4);
        Sort(a1, 4);
    }
    
    public static void Sort(int arr[], int n){
        int didSwap = 0;
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    didSwap = 1;
                }
            }
        }

        if(didSwap == 0){
            System.out.println("No swapping");
        }
        else{
            System.out.println("Swapping done");
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