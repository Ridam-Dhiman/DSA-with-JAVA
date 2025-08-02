class Print_n_times{
    public static void main(String args[]){
        Print_num(1, 5);
        Print_name(1, 5, "RHYTHM");
        Print_rev(1, 9);
    }
    public static void Print_num(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        Print_num(i+1, n);
    }
    public static void Print_rev(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(n);
        Print_rev(i, n-1);
    }
    public static void Print_name(int i, int n, String name){
        if(i > n){
            return;
        }
        System.out.println(name);
        Print_name(i+1, n, name);
    }

}