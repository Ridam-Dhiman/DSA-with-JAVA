import java.util.HashMap;
class LongSubArrayLen{
    public static void main(String args[]){
        int a[] = {1,2,3,1,1,1,1,4,2,2};
        len3(a, 3);
    }
    public static void len1(int a[], int k){
        int n = a.length;
        int maxlen = 0;
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = i; j < n; j++){
                sum += a[j];
                if(sum == k){
                    maxlen = Math.max(maxlen, j-i+1);
                }
            }
        }
        System.out.print(maxlen);
    }
    public static void len2(int a[], int k){
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int sum = 0;
        int maxi = 0;
        int n = a.length;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(sum == k){
                maxi = Math.max(maxi, i+1);
            }

            int rem = sum - k;
            if(preSum.containsKey(rem)){
                int len = i-preSum.get(rem);
                maxi = Math.max(maxi, len);
            }

            // Adding to the map if it doesnot present
            if(!preSum.containsKey(sum)){
                preSum.put(sum, i);
            }
        }
        System.out.print(maxi);
    }

    public static void len3(int a[], int k){
        int n = a.length;
        int left = 0;
        int right = 0;
        int sum = a[0];
        int maxi = 0 ;
        while(right < n){
            while(left <= right && sum > k){
                sum -= a[left];
                left++;
            }
            if(sum == k){
                maxi = Math.max(maxi, right-left+1);
            }
            right++;
            if(right < n){
                sum += a[right];
            }
        }
        System.out.print(maxi);
    }
}