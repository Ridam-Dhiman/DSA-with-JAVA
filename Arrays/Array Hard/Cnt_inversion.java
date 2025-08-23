import java.util.*;
class Cnt_inversion{
    public static void main(String args[]){
        int arr[] = {5,3,2,1,4};
        System.out.println(Msort(arr, 0, arr.length - 1));
    }

    // This is for only sorted array
    public static void better(int arr[]){
        Arrays.sort(arr);
        int l = 0, r = 0;
        int n = arr.length;
        int cnt = 0;
        while(l < n){
            if(arr[l] > arr[r]){
                cnt += n-l;
                r++;
            }else{
                l++;
            }
        }
        System.out.println(cnt);
    }

    public static int Msort(int arr[], int l, int h){
        int cnt = 0;
        if(l >= h){
            return cnt;
        }
        int m = (l+h)/2;
        cnt += Msort(arr, l, m);
        cnt += Msort(arr, m+1, h);
        cnt += Merge(arr, l, m, h);
        return cnt;
    }
    public static int Merge(int arr[], int l, int m, int h){
        int i = l;
        int j = m+1;
        int k = 0;
        int cnt = 0;
        int arr2[] = new int[h+1];
        while(i <= m && j <= h){
            if(arr[i] <= arr[j]){
                arr2[k] = arr[i];
                k++;
                i++;
            }else{
                cnt += (m-i+1);
                arr2[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i <= m){
            arr2[k] = arr[i];
            k++;
            i++;
        }
        while(j <= h){
            arr2[k] = arr[j];
            k++;
            j++;
        }
        for(int x = l; x <= h; x++){
            arr[x] = arr2[x-l];
        }
        return cnt;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}