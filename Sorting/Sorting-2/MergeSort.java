import java.util.ArrayList;

class MergeSort{
    public static void main(String args[]){
        int a[] = {56, 98, 12, 66};
        MSort(a, 0, 3);
        print_arr(a, 4);
    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        MSort(arr, low, mid);
        MSort(arr, mid + 1, high);
        Merge(arr, low, mid, high);
        
    }

    public static void Merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid+1;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i += 1;
            }
            else{
                temp.add(arr[j]);
                j += 1;
            }
        }
        while(i <= mid){
            temp.add(arr[i]);
            i += 1;
        }
        while(j <= high){
            temp.add(arr[j]);
            j += 1;
        }
        for(int x = low; x <= high; x++){
            arr[x] = temp.get(x-low);
        }
    }
}