import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        Integer n1 = obj.nextInt();
        int n2 = Reverse(n1);
        if(n1 == n2){
            System.out.println("It is a palindrome...");
        }
        else{
            System.out.println("Not a palindrome...");
        }
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