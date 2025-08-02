import java.util.Scanner;

class CountDigits{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        Integer n1 = obj.nextInt();
        System.out.println(count(n1));
    }
    public static int count(int n){
        int c = 0;
        while(n > 0){
            c = c+1;
            n = n/10;
        }
        return c;
    }
}