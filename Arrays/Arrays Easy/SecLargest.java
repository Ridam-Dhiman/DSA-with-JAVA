import java.util.Arrays;

class SecLargest{
    public static void main (String args[]){
        int[] a = {56, 87, 12, 32, 87, 87};
        // Arrays.sort(a);
        // for(int i = 0; i < 6; i++){
        //     System.out.println(a[i]);
        // }
        secLar_4(a, 4);        
    }

    // Assumption --> Array donot contains dublicates
    // TC --> O(nlogn)
    public static void secLar(int arr[], int n){
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
    public static void secLar_2(int arr[], int n){
        Arrays.sort(arr);
        int sec = -1;
        int lar = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            if(arr[i] != lar){
                sec = arr[i];
                break;
            }
        }
        System.out.println(sec);
    }

    public static void secLar_3(int arr[], int n){
        int lar = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        int sec = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > sec && arr[i] != lar){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }

    public static void secLar_4(int arr[], int n){
        int lar = arr[0];
        int sec = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] > lar){
                sec = lar;
                lar = arr[i];
            }
            else if(arr[i] < lar && arr[i] > sec){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}