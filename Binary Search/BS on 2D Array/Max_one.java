import java.util.*;
class Max_one{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        int n = 3, m = 4;

        int mat[][] = {{0,1,1,1}, {0,1,1,1}, {1,1,1,1}};
        optimal(mat, n, m);
    }
    public static void brute(ArrayList<ArrayList<Integer>> arr, int n, int m){
        int cnt = -1;
        int idx = -1;
        for(int i = 0; i < n; i++){
            int row_cnt = 0;
            for(int j = 0; j < m; j++){
                row_cnt += arr.get(i).get(j);
            }
            if(row_cnt > cnt){
                cnt = row_cnt;
                idx = i;
            }
        }
        System.out.println(idx);
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

    public static void optimal(int arr[][], int n, int m){
        int cnt = -1;
        int idx = -1;
        for(int i = 0; i < n; i++){
            int row_cnt = m - ub(arr[i], 0, m-1, 0);
            // System.out.println(row_cnt);
            if(row_cnt > cnt){
                cnt = row_cnt;
                idx = i;
            }
        }
        System.out.println(idx);
    }
}