class CheckSort{
    public static void main(String args[]){
        int[] a = {12, 45, 78, 43};
        int[] b = {12, 34, 56, 88};
        System.out.println(check_sort(a, 4));
        System.out.println(check_sort(b, 4));
        
    }
    public static boolean check_sort(int arr[], int n){
        int f = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                f = 1;
            }
        }
        if(f == 0){
            return true;
        }
        else{
            return false;
        }
    }
}