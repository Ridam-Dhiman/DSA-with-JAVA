class MissingNum{
    public static void main(String args[]){
        int a[] = {1, 2, 3, 5, 6};
        // return 4
        // find1(a, 6);
        System.out.println();
        find4(a, 6);
    }

    // Only This will return multiple missing number in the array
    public static void find1(int a[], int n){
        for(int i = 1; i <= n; i++){
            int f = 0;
            for(int j = 0; j < a.length; j++){
                if(a[j] == i){
                    f = 1;
                }
            }
            if(f == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void find2(int a[], int n){
        int hash[];
        hash = new int[n+1];
        for(int i = 0; i < n-1; i++){
            hash[a[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(hash[i] == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void find3(int a[], int n){
        int sum = (n*(n+1))/2;
        int s2 = 0;
        for(int i = 0; i < a.length; i++){
            s2 += a[i];
        }
        System.out.println(sum-s2);
    }
    public static void find4(int a[], int n){
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < a.length; i++){
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        System.out.println(xor1 ^ xor2);
    }
}