class Floor_Ceiling{
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 5};
        int target = 4;
        ceiling(arr, 0, arr.length-1, target);
    }
    public static void ceiling(int arr[], int l, int h, int t){
        int m = (l + h)/2;
        int ans = -1;
        while(l <= h){
            m = (l + h)/2;
            if(arr[m] >= t){
                ans = m;
                h = m - 1; // search in the left half
            }else{
                l = m + 1; // search in the right half
            }
        }
        System.out.println("Ceiling Index :" + ans);
    }
    public static void floor(int arr[], int l, int h, int t){
        int m = (l + h)/2;
        int ans = -1;
        while(l <= h){
            m = (l + h)/2;
            if(arr[m] <= t){
                ans = m;
                l = m + 1; 
            }else{
                h = m - 1; 
            }
        }
        System.out.println("Floor Index :" + ans);
    }
}