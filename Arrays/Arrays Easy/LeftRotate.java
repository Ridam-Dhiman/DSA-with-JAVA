class LeftRotate{
    public static void main(String args[]){
        int[] a = {34, 0, 78, 32, 0, 45, 0, 0};
        rotate_2(a, 3);
    }
    public static void rotate(int arr[], int d){
        int D = d % arr.length;
        int[] temp;
        temp = new int[D];
        for(int i = 0; i < D; i++){
            temp[i] = arr[i];
        }
        for(int i = D; i < arr.length; i++){
            arr[i - D] = arr[i];
        }
        int j = 0;
        for(int i = arr.length - D; i < arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
        print_arr(arr, arr.length);
    }



    public static void rotate_2(int arr[], int d){
        int n = arr.length;
        int D = d % n;
        reverse(arr,0 , D-1);
        reverse(arr,D , n-1);
        reverse(arr,0 , n-1);
        print_arr(arr, n);
    }
    public static void reverse(int arr[], int s, int e){
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    
    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}