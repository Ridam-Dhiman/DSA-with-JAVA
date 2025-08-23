import java.util.*;
class Sum_3{
    public static void main(String args[]){
        int arr[] = {-1, 0, 1, 2, -1, -4};
        optimal(arr);
    }
    public static void brute(int arr[]){
        int n = arr.length;
        // set of list can automatically removes duplicates
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);
                        // no need to check here for duplicates
                        if(!ans.contains(triplet)){
                            ans.add(triplet);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void better(int arr[]){
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < n; i++){
            Set<Integer> h = new HashSet<>();
            for(int j = i+1; j < n; j++){
                int k = -(arr[i]+arr[j]);
                if(h.contains(k)){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(k);
                    Collections.sort(triplet);
                    ans.add(triplet);
                }
                else{
                    h.add(arr[j]);
                }
            }
        }
        System.out.println(ans);
    }

    public static void optimal(int arr[]){
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0){ 
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ArrayList<Integer> triplet = new ArrayList<>(3);
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(arr[k]);
                    ans.add(triplet);
                    j++;
                    k--;
                    while(arr[j] == arr[j-1]) j++;
                    while(arr[k] == arr[k+1]) k--;
                }
                
            }
        }
        System.out.println(ans);
    }

}