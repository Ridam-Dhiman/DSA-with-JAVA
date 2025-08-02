import java.util.Scanner;

class Armstrong{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Nummber of digits in number :");
        Integer n1 = obj.nextInt();
        System.out.println("Enter number :");
        Integer n2 = obj.nextInt();
        int num = 0;
        int n = n2;
        while(n > 0){ 
            int d = n % 10;
            num += Math.pow(d, n1);
            n = n / 10;
        }
        System.out.println(num);
    }
}