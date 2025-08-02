class Fibonacci{
    public static void main(String args[]){
        System.out.print(fibo(4));
    }
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            int lst = fibo(n-1);
            int slst = fibo(n-2);
            return lst + slst;
        }
    }
}