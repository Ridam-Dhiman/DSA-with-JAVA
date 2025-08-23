import java.util.*;
class Merge_Arr{
    public static void main(String args[]){
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        brute(arr1, arr2, n, m);
        print(arr1, n);
        System.out.println();
        print(arr2, m);
    }
    public static void print(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void brute(int a[], int b[], int n, int m){
        int l = 0, r = 0;
        int i = 0;
        int arr[] = new int[n+m];
        while(l < n && r < m){
            if(a[l] <= b[r]){
                arr[i] = a[l];
                i++;
                l++;
            }else{
                arr[i] = b[r];
                i++;
                r++;
            }
        }
        while(l < n){
            arr[i] = a[l];
            i++;
            l++;
        }
        while(r < m){
            arr[i] = a[r];
            i++;
            r++;
        }
        for (int x = 0; x < n; x++) {
            a[i] = arr[i];
        }
        for(int x = n; x < m; x++){
            b[x-n] = arr[x];
        }
    }

    public static void optimal1(int a[], int b[], int n, int m){
        int l = n-1;
        int r = 0;
        while(r < m && l >= 0){
            if(b[r] < a[l]){
                int temp = a[l];
                a[l] = b[r];
                b[r] = temp;
            }
            l--;
            r++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void optimal2(int a[], int b[], int n, int m){
        int len = n + m;
        int g = (len/2) + (len%2);
        while(g > 0){
            int l = 0;
            int r = l + g;
            while(r < len){// arr1 and arr2
                if(l < n && r >= n){
                    swap(a, b, l, r-n);                            
                }// arr2 and arr2
                else if(l >= n){
                    swap(b, b, l-n, r-n);
                }// arr1 and arr1
                else{
                    swap(a, a, l, r);
                }
                l++;
                r++;
            }
            if(g == 1) break;
            g = (g/2) + (g%2);
        }
    }
    public static void swap(int arr1[], int arr2[], int l, int r){
        if(arr1[l] > arr2[r]){
            int temp = arr1[l];
            arr1[l] = arr2[r];
            arr2[r] = temp;
        }
    }
}