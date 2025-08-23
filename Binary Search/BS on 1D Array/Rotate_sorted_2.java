class Rotate_sorted_2{
    public static void main(String args[]){
        int arr[] = {3, 4, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        optimal(arr, 5);
    }
    // for non unique elements in the array
    public static void optimal(int arr[], int x){
        int l = 0, h = arr.length-1;
        boolean ans = false;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] == x){
                ans = true;
                break;
            }
            else if(arr[l] == arr[m] && arr[m] == arr[h]){
                l += 1;
                h -= 1;
                continue;
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