class Missing{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
        by_maths(arr);
    }

    public static void brute(int arr[]){
    int n = arr.length;
    int mis = -1;
    int rep = -1;
    for(int i = 1; i <= n ; i++){
        int cnt = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] == i){
                cnt++;
            }
        }
        if(cnt == 2){
            rep = i;
        }else if(cnt == 0){
            mis = i;
        }
    }
    System.out.println(mis + " " + rep);
    }

    public static void better(int arr[]){
        int n = arr.length;
        int hash[] =  new int[n+1];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(hash[i] == 2){
                System.out.println("Repeating : " + i);
            }else if(hash[i] == 0){
                System.out.println("Missing : " + i);
            }
        }
    }

    public static void by_maths(int arr[]){
        long n = arr.length;
        long Sn = (n*(n+1))/2;
        long S2n = (n*(n+1)*(2*n+1))/6;
        long s = 0, s2 = 0;
        for(int i = 0; i < n; i++){
            s = s + arr[i];
            s2 = s2 + ((long)arr[i]*(long)arr[i]);
        }
        long val1 = s-Sn;
        long val2 = s2-S2n;
        val2 = val2/val1;
        long r = (val1 + val2)/2;
        long m = r-val1;
        System.out.println("Missing : "+ (int)m +"Repeating :" +(int)r);
    }
    public static void xor(int arr[]){

    }
}
