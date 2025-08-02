import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class Divisors{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number :");
        Integer n2 = obj.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        // for(int i = 1; i <= n2; i++){
        //     if(n2 % i == 0){
        //         // System.out.print(i + " ");
        //         a1.add(i);
        //     }
        // }
        for(int i = 1; i <= Math.sqrt(n2); i++){
            if(n2 % i == 0){
                // System.out.print(i + " ");
                a1.add(i);
                if(n2 / i != i){
                    // System.out.print(n2/i + " ");
                    a1.add(n2/i);
                }
            }
        }
        a1.sort(Comparator.naturalOrder());
        System.out.print(a1);
    }
}