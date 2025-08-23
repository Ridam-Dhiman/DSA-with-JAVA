import java.util.*;
class Sum_4{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int target = 10;
        optimal(arr, target);
    }
    public static void brute(int arr[], int t){
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i <n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    for(int l = k+1; l < n; l++){
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if(sum == t){
                            List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(quad);
                            ans.add(quad);
                        }
                    }
                
                }
            }
        }
        System.out.println(ans);
    }
    public static void better(int arr[], int t){
        Set<List<Integer>> ans = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                HashSet<Integer> h = new HashSet<>();
                for(int k = j+1; k < n; k++){
                    int l = t-(arr[i]+arr[j]+arr[k]);
                    if(h.contains(l)){
                        List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[k], l);
                        Collections.sort(quad);
                        ans.add(quad);
                    }else{
                        h.add(arr[k]);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void optimal(int arr[], int t){
        Set<List<Integer>> ans = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j < n; j++){
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k < l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum < t){
                        k++;
                    }else if(sum > t){
                        l--;
                    }else{
                        List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        ans.add(quad);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
