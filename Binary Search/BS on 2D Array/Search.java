import java.util.*;
class Search{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        optimal(matrix, 8);
        System.out.println(better(matrix, 8));
    }
    public static void brute(ArrayList<ArrayList<Integer>> matrix, int target){
        int n = matrix.size(), m = matrix.get(0).size();
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == target)
                    ans = true;
            }
        }
        System.out.println(ans);
    }

    public static boolean binarySearch(ArrayList<Integer> nums, int target) {
        int n = nums.size(); 
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) == target) return true;
            else if (target > nums.get(mid)) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static boolean better(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();

        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) <= target && target <= matrix.get(i).get(m - 1)) {
                return binarySearch(matrix.get(i), target);
            }
        }
        return false;
    }

    public static void optimal(ArrayList<ArrayList<Integer>> mat, int t){
        int l = 0; 
        int h = (mat.size()*mat.get(0).size())-1;
        boolean ans = false;
        while(l <= h){
            int m = (l+h)/2;
            int r = m / mat.get(0).size();
            int c = m % mat.get(0).size();
            if(mat.get(r).get(c) == t){
                ans = true;
                break;
            }else if(mat.get(r).get(c) < t){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        System.out.println(ans);
    }
}