import java.util.*;
class Merge_overlap{
    public static void main(String args[]){
        int[][] arr = {{1, 3}, {2, 4}, {4, 6}, {8, 9}, {10, 12}};
        alternate(arr);
        
    }
    public static void brute(int arr[][]){
        // TC -> nLog(n)
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        // TC -> O(2n)
        for(int i = 0; i < n; i++){
            int s = arr[i][0];
            int e = arr[i][1];
            if(!ans.isEmpty() && e <= ans.get(ans.size()-1).get(1)) continue;
            for(int j = i+1; j < n; j++){
                if(arr[j][0] <= e){
                    e = Math.max(arr[j][1], e);
                }else{
                    break;
                }
            }
            List<Integer> duo = Arrays.asList(s, e);
            ans.add(duo);
        }
        System.out.println(ans);
    }
    public static void optimal(int arr[][]){
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int s = arr[0][0];
        int e = arr[0][1];
        ans.add(Arrays.asList(s, e));
        for(int i = 1; i < n; i++){
            if(arr[i][0] <= e){
                e = Math.max(arr[i][1], e);
                ans.get(ans.size()-1).set(1, e); 
            }else{
                s = arr[i][0];
                e = arr[i][1];
                ans.add(Arrays.asList(s, e));
            }
        }
        System.out.println(ans);
    }
    // Alternate
    public static void alternate(int arr[][]){
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }else{
                ans.get(ans.size()-1).set(1, Math.max(arr[i][1], ans.get(ans.size()-1).get(1)));
            }
        }
        System.out.println(ans);
    }
}