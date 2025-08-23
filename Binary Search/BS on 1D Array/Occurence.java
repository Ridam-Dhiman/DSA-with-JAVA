class Occurence{
    public static void main(String args[]){
        int arr[] = {3, 5, 8, 12, 15, 15, 15, 30};
        better(arr, 115);
    }
    public static void brute(int arr[], int x){
        int f = -1; 
        int l = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                if(f == -1){
                    f = i;
                }
                l = i;
            }
        }
        System.out.println("First Occurence: " + f);
        System.out.println("Last Occurence: " + l);
    }

    // TC -> O(2*logn)
    public static void better(int arr[], int x){
        lb(arr, 0, arr.length - 1, x);
        ub(arr, 0, arr.length - 1, x);
    }
    public static void lb(int arr[], int l, int h, int t){
        int ans = -1;
        while(l <= h){
            int m = (l + h)/2;
            if(arr[m] >= t){
                ans = m;
                h = m - 1; 
            }else{
                l = m + 1; 
            }
        }
        System.out.println("First :" + ans);
    }
    public static void ub(int arr[], int l, int h, int t){
        int ans = -1;
        while(l <= h){
            int m = (l + h)/2;
            if(arr[m] > t){
                ans = m;
                h = m - 1; 
            }else{
                l = m + 1; 
            }
        }
        System.out.println("last :" + ans);
    }
}