package Easy;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(2000000000));
    }
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int lastBit= n & 1;
            count +=lastBit;
            n=n>>>1;
        }
        return count;
    }
}
