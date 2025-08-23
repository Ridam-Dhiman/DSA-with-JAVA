class Pascals{
    public static void main(String args[]){
        pro1(6, 3);
        pro21(5);
        System.out.println();
        pro3(5);
    }
    public static void pro1(int r, int c){
        System.out.println(NcR(r-1, c-1));
    }
    // TC -> O(N^2)
    public static void pro2(int r){
        for(int i = 1; i <= r; i++){
            System.out.print(NcR(r-1, i-1) + " ");
        }
    }
    // TC -> O(N)
    public static void pro21(int r){
        int ans = 1;
        System.out.print(ans + " ");
        for(int i = 1; i < r; i++){
            ans = ans*(r-i);
            ans = ans/i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    // TC -> O(N^3)
    public static void pro3(int r){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(NcR(i-1, j-1) + " ");
            }
            System.out.println();
        }
    }
    // We can print the pascals triangle using 2nd approach of problem to so that its time comlexity dropesdown
    public static int NcR(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
}