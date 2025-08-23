class QuickSort{
    public static void main(String args[]){
        int a[] = {34,12,78,12,99};
        print_arr(a, 4);
        Sort(a, 0, 4);
        print_arr(a, 4);

    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Sort(int arr[], int low, int high){
        int ptn_index;
        if(low < high){
            ptn_index = Partition(arr, low, high);
            Sort(arr, low, ptn_index - 1);
            Sort(arr, ptn_index + 1, high);
        }
    }

    public static int Partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i, j;
        i = low + 1;
        j = high;
        int temp;
        while(i < j){
            while(pivot <= arr[i]){
                i++;
            }
            while(pivot < arr[j]){
                j--;
            }
            if(i < j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}