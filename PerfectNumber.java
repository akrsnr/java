class CodingChallenge3 {

    public static void main(String[] args) throws UnsupportedEncodingException {

        
        long sum = 0;
        long firstNum = 137438691328L;
        long endNum = 137438691328L;

        System.out.println("Range is inclusively: " + firstNum + " - " + endNum);

        while (firstNum <= endNum) {
            sum = 0;
            for (int i = 2; i <= Math.sqrt(firstNum); i++) {
                if (firstNum % i == 0) {
                    sum = sum + i + (firstNum / i);
                }
            }

            sum += 1;

            if (sum == firstNum && firstNum != 0) {
                System.out.println(firstNum + " is perfect");
            }

            firstNum++;
        }
   }
}   
