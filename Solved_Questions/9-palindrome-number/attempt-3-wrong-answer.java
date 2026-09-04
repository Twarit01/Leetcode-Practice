class Solution {
    public boolean isPalindrome(int x) {
        if(x>0){
            return false;
        }
        int reverse_num=0;
        int org=x;
        int digit1;
        while(x>0){
            digit1=org%10;
            reverse_num=reverse_num*10 + digit1;
            org /=10;
        }
        return x==reverse_num;

        
    }
}