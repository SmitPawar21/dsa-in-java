import java.math.BigInteger;
class Solution {
    public String removeDigit(String number, char digit) {
        String answer = "";
        String temp = "";
        BigInteger max = BigInteger.ZERO;

        for(int i=0; i<number.length(); i++) {
            if(number.charAt(i) == digit) {
                for(int j=0; j<number.length(); j++) {
                    if(j == i) {
                        continue;
                    }
                    temp = temp + number.charAt(j);
                }

                BigInteger current = new BigInteger(temp);
                if(current.compareTo(max) > 0) {
                    max = current;
                }

                temp = "";
            }
        }

        return max.toString();
    }
}