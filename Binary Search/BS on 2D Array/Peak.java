import java.util.*;
class Peak{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,4,7,11,15)));
        matrix.add(new ArrayList<>(Arrays.asList(2,5,8,12,19)));
        matrix.add(new ArrayList<>(Arrays.asList(3,6,9,16,22)));
        matrix.add(new ArrayList<>(Arrays.asList(10,13,14,17,24)));
        matrix.add(new ArrayList<>(Arrays.asList(18,21,23,26,30)));
        Sol1(matrix);
    }
    public static void Sol1(ArrayList<ArrayList<Integer>> matrix){
        int n = matrix.size();
        int m = matrix.get(0).size();
        int low = 0, high = m-1;
        int r = -1, c = -1;
        while(low <= high){
            int mid = (low + high)/2;
            // mid --> Gives us the column no.
            int row = maxEle(matrix, n, mid);
            // row --> Gives us the index of max element in row of 'mid' column 
            int left = mid-1 >= 0 ? matrix.get(row).get(mid-1) : -1;
            int right = mid+1 < m ? matrix.get(row).get(mid+1) : -1;

            if(matrix.get(row).get(mid) > left && matrix.get(row).get(mid) > right){
                r = row;
                c = mid;
                break;
            }else if(matrix.get(row).get(mid) < left){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(r + "," + c);
    }
    public static int maxEle(ArrayList<ArrayList<Integer>> matrix, int n, int col){
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i < n; i++){
            if(matrix.get(i).get(col) > max){
                max = matrix.get(i).get(col);
                idx = i;
            }
        }
        return idx;
    }
}