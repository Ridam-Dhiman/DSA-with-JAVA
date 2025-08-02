import java.util.HashMap;
import java.util.Map.Entry;
class NumCheckOnce{
    public static void main(String args[]){
        int a[] = {1, 2, 2, 3, 4, 1, 4, 5, 5};
        find3(a);
    }
    public static void find1(int a[]){
        int n = a.length;
        for(int i = 0; i < n; i++){
            int num = a[i];
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(a[j] == num){
                    cnt += 1;
                }
            }
            if(cnt == 1){
                System.out.print(num +" ");
            }
        }
    }

    public static void find2(int a[]){
        int n = a.length;
        int maxi = a[0];
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, a[i]);
        }
        int hash[];
        hash = new int[maxi + 1];
        for(int i = 0; i < n; i++){
            hash[a[i]]++;
        }
        for(int i = 0; i < hash.length; i++){
            if(hash[i] == 1){
                System.out.print(i + " ");
            }
        }
    }
    public static void find3(int a[]){
        int n = a.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int val = mpp.getOrDefault(a[i], 0);
            mpp.put(a[i], val+1);
        }
        for(Entry<Integer, Integer> i : mpp.entrySet()){
            if(i.getValue() == 1){
                System.out.print(i.getKey() + " ");
            }
        }

    }

    public static void find4(int a[]){
        int xor1 = 0;
        for(int i = 0; i < a.length; i++){
            xor1 = xor1 ^ a[i];
        }
        System.out.println(xor1);
    }
}