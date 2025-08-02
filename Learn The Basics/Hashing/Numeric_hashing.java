import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

class Numeric_hashing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Main array inputting :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Hashing done :");
        // int hash[] = new int[13];
        // for(int i=0; i<n; i++){
        //     hash[arr[i]] += 1;
        // }

        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int i = 0; i<n; i++){
            int key = arr[i];
            int freq = 0;
            if(h1.containsKey(key)){
                freq = h1.get(key);
            }
            freq += 1;
            h1.put(key, freq);
        }

        int max_freq = 0;
        int min_freq = n;
        int max_ele = 0;
        int min_ele = 0;
        for(Entry<Integer, Integer> i : h1.entrySet()) {
            // System.out.print(i + ",");
            int cnt = i.getValue();
            int ele = i.getKey();
            if(cnt > max_freq){
                max_freq = cnt;
                max_ele = ele;
            }
            if(cnt < min_freq){
                min_freq = cnt;
                min_ele = ele;
            }
        }
        System.out.println("Maximum element : " + max_ele);
        System.out.println("Mininum element : " + min_ele);


        System.out.println("Queries :");
        int q = sc.nextInt();
        while(q-- != 0){
            int num = sc.nextInt();
            if(h1.containsKey(num)){
                System.out.println(h1.get(num));
            }
            else{
                System.out.println(0);
            }
        }
    }
}