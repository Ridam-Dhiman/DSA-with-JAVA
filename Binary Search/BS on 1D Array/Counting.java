class Counting{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 3, 3, 3, 4, 5};
        optimal(arr, 4);
    }
    public static void optimal(int arr[], int x){
        int st = lb(arr, x);
        int ed = ub(arr, x);
        System.out.println(ed-st);
    }
    public static int lb(int arr[], int x){
        int n = arr.length;
        int l = 0, h = n-1;
        int idx = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] >= x){
                idx = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return idx;
    }
    public static int ub(int arr[], int x){
        int n = arr.length;
        int l = 0, h = n-1;
        int idx = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] > x){
                idx = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return idx;
    }
}