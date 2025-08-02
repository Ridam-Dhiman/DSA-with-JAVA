import java.util.Arrays;
class LargestElement{
    public static void main (String args[]){
        int[] a = {56, 87, 12, 32};
        print_arr(a, 4);
        // System.out.println(largest(a, 4));
        largest_2(a, 4);
    }

    // TC --> O(nlogn) SC --> O(1)
    public static int largest(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-1];
    }

    // TC --> O(n)
    public static void largest_2(int arr[], int n){
        int lar = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        System.out.println(lar);
    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}