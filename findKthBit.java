class Solution {
    public char findKthBit(int n, int k) {
        if(n == 1)return '0';

        int len = (1 << n) - 1;
        int mid = (len+1)/2;

        if(mid == k)return '1';
        if(mid > k)return findKthBit(n-1, k);

        char c = findKthBit(n-1, len-k+1);
        return (c == '1') ? '0' : '1';
    }
}
