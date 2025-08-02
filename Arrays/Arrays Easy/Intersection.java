import java.util.ArrayList;
class Intersection{
    public static void main(String args[]){
        int a[] = {1, 1, 3, 3, 5, 5};
        int b[] = {1, 3, 5, 5, 7, 8, 9};
        Common(a, b);
        Common2(a, b);
    }
    public static void Common(int a[], int b[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int vis[];
        vis = new int[b.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j] && vis[j] == 0){
                    ans.add(a[i]);
                    vis[j] = 1;
                    break;
                }
            }
        }
        System.out.print(ans);
    }
    public static void Common2(int a[], int b[]){
        int i, j;
        i = j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.print(ans);
    }
}