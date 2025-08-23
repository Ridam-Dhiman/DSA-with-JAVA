class Rev_pair{
    public static void main(String args[]){
        int arr[] = {5, 6, 3, 8, 1};
        System.out.println(Msort(arr, 0, arr.length-1));
        print(arr);
    }

    public static int countPairs(int arr[], int l, int m, int h){
        int right = m+1;
        int cnt = 0;
        for(int left = l; left <= m; left++){
            while(right <= h && arr[left] > 2*arr[right]) right++;
            cnt += right-(m+1);
        }
        return cnt;
    }

    public static int Msort(int arr[], int l, int h){
        int cnt = 0;
        if(l >= h){
            return cnt;
        }
        int m = (l+h)/2;

        cnt += Msort(arr, l, m);
        cnt += Msort(arr, m+1, h);
        cnt += countPairs(arr, l, m, h);
        Merge(arr, l, m, h);
        return cnt;
    }
    public static void Merge(int arr[], int l, int m, int h){
        int i = l;
        int j = m+1;
        int k = 0;
        int arr2[] = new int[h+1];
        while(i <= m && j <= h){
            if(arr[i] <= arr[j]){
                arr2[k] = arr[i];
                k++;
                i++;
            }else{
                arr2[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i <= m){
            arr2[k] = arr[i];
            k++;
            i++;
        }
        while(j <= h){
            arr2[k] = arr[j];
            k++;
            j++;
        }
        for(int x = l; x <= h; x++){
            arr[x] = arr2[x-l];
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}