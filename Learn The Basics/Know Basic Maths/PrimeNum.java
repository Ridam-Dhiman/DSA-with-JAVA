import java.util.Scanner;
class PrimeNum{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number :");
        Integer n2 = obj.nextInt();
        System.out.println(checkPrime(n2));
        System.out.println(Math.sqrt(n2));
    }
    public static boolean checkPrime(int n){
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                cnt += 1;
                if(n / i != i){
                    cnt += 1;
                }
            }
        }
        if(cnt == 2){
            return true;
        }
        else{
            return false;
        }
    }
}