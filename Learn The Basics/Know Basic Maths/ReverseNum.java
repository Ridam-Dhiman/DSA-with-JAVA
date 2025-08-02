import java.util.Scanner;

class ReverseNum{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        Integer n1 = obj.nextInt();
        System.out.println(Reverse(n1));
    }
    public static int Reverse(int n){
        int revNum = 0;
        while(n > 0){
            int d = n % 10;
            revNum = (revNum * 10) + d;
            n = n / 10;
        }
        return revNum;
    }
}