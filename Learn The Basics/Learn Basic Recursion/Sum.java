class Sum{
    public static void main(String args[]){
        System.out.println(Sum_num(5));

        // Without Recursion
        int sum = 0;
        for(int i = 0; i<=6; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static int Sum_num(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            int seclst = Sum_num(n-1);
            return n + seclst;
        }
    }
}