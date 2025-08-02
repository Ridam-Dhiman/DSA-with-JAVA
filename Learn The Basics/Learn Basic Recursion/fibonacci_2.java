class fibonacci_2{
    public static void main(String args[]){
        for(int i = 0; i<5; i++){
            System.out.print(fib(i) + " ");
        }
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            int lst = fib(n-1);
            int seclst = fib(n-2);
            return lst+seclst;
        }
    }
}