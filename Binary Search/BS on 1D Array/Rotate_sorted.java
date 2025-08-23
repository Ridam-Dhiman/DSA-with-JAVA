class Rotate_sorted{
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        brute(arr, 0);
    }
    public static void brute(int arr[], int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                System.out.println(i);
                break;
            }
        }
    }
    public static void optimal(int arr[], int x){
        int l = 0, h = arr.length-1;
        int ans = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] == x){
                ans = m;
                break;
            }
            else if(arr[m] <= arr[h]){
                if(arr[m] <= x && x <= arr[h]){
                    l = m+1;
                }else{
                    h = m-1;
                }
            }
            else{
                if(arr[l] <= x && x <= arr[m]){
                    h = m-1;
                }else{
                    l = m+1;
                }
            }
        }
        System.out.println(ans);
    }
}