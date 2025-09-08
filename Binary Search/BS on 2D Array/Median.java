class Median{
    public static void main(String args[]){
        int[][] matrix = {
            {1, 2, 3, 4},
            {9, 11, 12, 13},
            {21, 23, 25, 29}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        Sol1(matrix, n, m);
    }
    public static void Sol1(int matrix[][], int n, int m){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m-1]);
        }

        int req = (m*n)/2;
        while(low <= high){
            int mid = (low+high)/2;
            int smallEquals = BlacBox(matrix, n, m, mid);
            if(smallEquals <= req) low = mid+1;
            else high = mid-1;
        }
        System.out.println(low);
    }
    public static int ub(int arr[], int l, int h, int t){
        int ans = arr.length;
        while(l <= h){
            int m = (l + h)/2;
            if(arr[m] > t){
                ans = m;
                h = m - 1; 
            }else{
                l = m + 1; 
            }
        }
        return ans;
    }
    public static int BlacBox(int matrix[][], int n, int m, int mid){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            cnt += ub(matrix[i], 0, m-1, mid);
        }
        return cnt;
    }
}