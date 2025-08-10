class MaxConsecutive{
    public static void main(String args[]){
        int a[] = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        find1(a);
    }
    public static void find1(int a[]){
        int cnt = 0;
        int len = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                len = Math.max(len, cnt);
                cnt = 0;
            }
            else if(a[i] == 1){
                cnt += 1;
            }
            // len = Math.max(len, cnt);
        }
        System.out.println(len);
    }
}