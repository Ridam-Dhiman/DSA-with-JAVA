import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

class UnionSorted{
    public static void main(String args[]){
        int a[] = {1, 4, 5, 8};
        int b[] = {3, 6, 2, 0};
        Union(a, b);
        // Union2(a, b);
    }

    public static void Union(int a[], int b[]){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            h.put(a[i], h.getOrDefault(a[i], 0)+1);
        }
        for(int i = 0 ; i < b.length; i++){
            h.put(b[i], h.getOrDefault(b[i], 0)+1);
        }
        int arr[] = new int[h.size()];
        int i = 0;
        for(int x : h.keySet()){
            arr[i] = x;
            i++;
        }
        print_arr(arr, arr.length);
    }
    public static void Union1(int a[], int b[]){
        HashSet<Integer> h = new HashSet<>();
        // Using LinkedHashSet to maintain insertion order
        // LinkedHashSet<Integer> h = new LinkedHashSet<>();
        int n1 = a.length;
        int n2 = b.length;
        for(int i = 0; i < n1; i++){
            h.add(a[i]);
        }
        for(int i = 0; i < n2; i++){
            h.add(b[i]);
        }
        int ans[];
        ans = new int[h.size()];
        int i = 0;
        for(int x : h){
            ans[i] = x;
            i++;
        }
        print_arr(ans, ans.length);
    }

    public static void Union2(int a[], int b[]){
        ArrayList<Integer> u = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int n3 = u.size();
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(n3 == 0 || u.get(n3-1) != a[i]){
                    u.add(a[i]);
                    i++;
                }
            }
            else{
                if(n3 == 0 || u.get(n3-1) != b[j]){
                    u.add(b[j]);
                    j++;
                }
            }
        }
        while(i < n1){
            if(u.get(n3-1) != a[i]){
                u.add(a[i]);
                i++;
            }
        }
        while(j < n2){
            if(u.get(n3-1) != b[j]){
                u.add(b[j]);
                j++;
            }
        }
        // System.out.println(u);
        for(int x : u){
            System.out.print(x + " ");
        }
    }

    static void print_arr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}