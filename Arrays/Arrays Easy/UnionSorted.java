import java.util.HashSet;
import java.util.ArrayList;

class UnionSorted{
    public static void main(String args[]){
        int a[] = {1, 1, 3, 3, 5, 6};
        int b[] = {3, 4, 5, 6, 7, 8, 9};
        Union1(a, b);
        Union2(a, b);

    }

    public static void Union1(int a[], int b[]){
        HashSet<Integer> h = new HashSet<>();
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