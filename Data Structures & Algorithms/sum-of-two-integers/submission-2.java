class Solution {
    public int getSum(int a, int b) {
        String num1=Integer.toBinaryString(a);
        String num2=Integer.toBinaryString(b);
       int sum = Integer.parseUnsignedInt(num1,2)+Integer.parseUnsignedInt(num2,2);
        return sum;
    }
}
