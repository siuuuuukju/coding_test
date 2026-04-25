class Solution {
    public int solution(int a, int b) {
        int c = Integer.parseInt(""+a+b);
        int d = 2*a*b;
        if(c>=d){
            return c;
        }else{
            return d;
        }
    }
}