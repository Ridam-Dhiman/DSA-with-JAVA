import java.util.Arrays;

class SecSmallest{
    public static void main(String args[]){
        int a[] = {45, 34, 12, 4, 5};
        small_2(a, 5);
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
        int smal = arr[0];
        int secsmal = -1;
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