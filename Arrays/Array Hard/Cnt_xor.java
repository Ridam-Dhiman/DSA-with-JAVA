import java.util.*;
class Cnt_xor{
    public static void main(String args[]){
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        // optimal(arr, k);
        System.out.println(6^4);
    }
    public static void brute(int arr[], int m){
        int n = arr.length;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int xor = 0;
                for(int k = i; k <= j; k++){
                    xor = xor^arr[k];
                }
                if(xor == m){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void better(int arr[], int m){
        int n = arr.length;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int xor = 0;
            for(int j = i; j < n; j++){
                xor = xor^arr[j];
                if(xor == m){
                    cnt++;}
            }
        }
        System.out.println(cnt);
    }
    public static void optimal(int arr[], int k){
        HashMap<Integer, Integer> preXOR = new HashMap<>();
        int n = arr.length;
        int xor = 0;
        int cnt = 0;
        preXOR.put(xor, 1);
        for(int i = 0; i < n; i++){
            xor = xor^arr[i];
            int x = xor^k;
            if(preXOR.containsKey(x)){
                cnt += preXOR.get(x);
            }
            if(preXOR.containsKey(xor)){
                preXOR.put(xor, preXOR.getOrDefault(xor, 0)+1);
            }else{
                preXOR.put(xor,1);
            }
        }
        System.out.println(cnt);
    }
}