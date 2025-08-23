import java.util.*;
class Majority{
    public static void main(String args[]){
        int arr[] = {11,33,33,11,33,11};
        brute(arr);
    }
    public static void brute(int arr[]){
        int n = arr.length;
        // HashSet<Integer> h = new HashSet<>();
        // for(int i = 0; i < n; i++){
        //     int cnt = 0;
        //     for(int j = 0; j < n; j++){
        //         if(arr[i] == arr[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt > n/3){
        //         h.add(arr[i]);
        //     }
        // }
        // System.out.println(h);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(l.size() == 0 || l.get(0) != arr[i]){
                int cnt = 0;
                for(int j = 0; j < n; j++){
                    if(arr[i] == arr[j]){
                        cnt++;
                    }
                }
                if(cnt > n/3){
                    l.add(arr[i]);
                }
            }
            if(l.size() == 2){
                break;
            }
        }
        System.out.println(l);
    }
}