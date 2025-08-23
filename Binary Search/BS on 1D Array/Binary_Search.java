class Binary_Search{
    public static void main(String args[]){
        int arr[] = {3, 5, 8, 12, 15, 30};
        System.out.println(bs_recursive(arr, 0, arr.length-1, 15));
    }
    public static void bs_iterative(int arr[], int t){
        int n = arr.length;
        int l = 0; 
        int h = n-1;
        int index = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] == t){
                index = m;
                break;
            }else if(arr[m] < t){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        System.out.println("Index :" +index);
    }
    
    public static int bs_recursive(int arr[], int l, int h, int t){
        if(l > h){
            return -1;
        }
        int n = arr.length;
        int m = (l+h)/2;
        if(arr[m] == t) return m;
        else if(arr[m] < t){
            return bs_recursive(arr, m+1, h, t);
        }else{
            return bs_recursive(arr, l, m-1, t);
        }
    }
}