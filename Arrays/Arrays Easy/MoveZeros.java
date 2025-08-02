import java.util.ArrayList;

class MoveZeros{
    public static void main(String args[]){
        int[] a = {34, 0, 78, 32, 0, 45, 0, 0};
        remove_2(a, a.length);
    }
    public static void remove(int arr[], int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();
        System.out.println(nz);
        for(int i = 0; i < nz; i++){
            arr[i] = temp.get(i);
        }
        for(int i = nz; i < n; i++){
            arr[i] = 0;
        }
        System.out.println(arr.length);
        print_arr(arr, n);
    }

    public static void remove_2(int arr[], int n){
        int j = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        print_arr(arr, n);
        System.out.println(arr.length);
    }
    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}