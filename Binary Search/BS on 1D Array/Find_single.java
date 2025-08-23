class Find_single{
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        optimal(arr);
    }
    public static void brute(int arr[]){
        int ans = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(i == 0){
                if(arr[i] != arr[i+1]) ans = arr[i];
            }else if(i == n-1){
                if(arr[i] != arr[i-1]) ans = arr[i];
            }else{
                if(arr[i] != arr[i+1] && arr[i] != arr[i-1]) ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    // (E, O) -> element is in the right half
    // So, eliminate the left half and we are the part of it //
    // hereby, l = m+1

    public static void optimal(int arr[]){
        int n = arr.length;
        int l = 0, h = n-1;
        int ans = -1;
        if(arr[0] != arr[1]) ans = arr[0];
        else if(arr[n-1] != arr[n-2]) ans = arr[n-1];
        else{
            while(l <= h){
                int m = (l+h)/2;    
                if(arr[m] != arr[m-1] && arr[m] != arr[m+1]){
                    ans = arr[m];
                }
                // We are standing in the left half 
                // And we need to eleminate it
                if((m % 2 != 0 && arr[m-1] == arr[m]) || (m % 2 == 0 && arr[m+1] == arr[m])){
                    l = m+1;
                }else{      // Here we eliminated the right half
                    h = m-1;
                }
            }
        }
        System.out.println(ans);
    }
}