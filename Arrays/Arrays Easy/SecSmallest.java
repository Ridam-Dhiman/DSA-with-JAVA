import java.util.Arrays;

class SecSmallest{
    public static void main(String args[]){
        int a[] = {1, 8, 5, 4, 3, 2};
        small_2(a, 6);
    }

    public static void small(int arr[], int n){
        Arrays.sort(arr);
        int smal = arr[1];
        int secSmal = -1;
        for(int i = 1; i<n; i++){
            if(arr[i] != smal){
                secSmal = arr[i];
                break;
            }
        }
        System.out.println(secSmal);
    }

    public static void small_2(int arr[], int n){
        int smal = Integer.MAX_VALUE;
        int secsmal = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < smal){
                secsmal = smal;
                smal = arr[i];
            }
            else if(arr[i] > smal && arr[i] < secsmal){
                secsmal = arr[i];
            }
        }
        if(secsmal == -1){
            System.out.println(arr[1]);
        }
        else{
            System.out.println(secsmal);
        }
        
    }
}