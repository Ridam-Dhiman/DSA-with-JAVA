import java.util.Scanner;

class GreatestCommonDivisor{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        Integer n1 = obj.nextInt();
        Integer n2 = obj.nextInt();
        System.out.println(GCD(n1, n2));
        System.out.println(Math.min(n1, n2));
        
    }
    public static int GCD(int n1, int n2){
        int gcd = 1;
        for(int i = 1; i < Math.min(n1, n2); i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}