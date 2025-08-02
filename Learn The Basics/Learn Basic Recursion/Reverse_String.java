import java.util.ArrayList;

class Reverse_String{
    public static void main(String args[]){
        String s1 = "MADAM";
        ArrayList<String> a = new ArrayList<>();
        for(int i = 0; i<= s1.length(); i++){
            a.add(s1.charAt(i));
        }
        System.out.println(a);
        // System.out.println(s1.length());
        // System.out.println(reverse(s1, 0));
    }
    
    public static boolean reverse(String s, int i){
        if(i >= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return reverse(s, i+1);
    }
    // public static void newStr(String s, int i){
    //     ArrayList<String> a = new ArrayList<>();
    //     for(int i = 0; i<= s.length(); i++){
    //         a.add(s.charAt(i));
    //     }
    //     if(i >= s.length()/2){
    //         return;
    //     }
    //     else{

    //     }
    // }
}