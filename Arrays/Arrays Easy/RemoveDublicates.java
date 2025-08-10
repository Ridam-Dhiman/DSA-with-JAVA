import java.util.HashSet;
class RemoveDublicates{
    public static void main(String args[]){
        int a[] = {2, 2, 4, 5, 5, 9, 9};
        remove(a, 7);
    }

    // TC --> O(nlogn + n)
    public static void remove(int arr[], int n){
        HashSet<Integer> s1 = new HashSet<>();
        for(int i = 0; i < n; i++){
            s1.add(arr[i]);
        }
        System.out.println(s1);
        int k = s1.size();
        int j = 0;
        for(int x :s1){
            arr[j] = x;
            j++;
        }
        print_arr(arr, k);
    }

    // TC --> O(n)
    public static void remove_2(int arr[], int n){
        int i = 0;
        for(int j = 1; j<n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        print_arr(arr, i+1);
    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}