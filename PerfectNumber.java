class Perfectcimisiniz {

    public static void main(String[] args) {

        
        long sum = 0;
        long firstNum = 1;
        long endNum = 8128;

        System.out.println("Range is inclusively: " + firstNum + " - " + endNum);

        while (firstNum <= endNum) {
            sum = 0;
            /*
                Optimization is here;
                for(int i = 2; i <= Math.sqrt(firstNum); i++) ...
                Since square root is still complex process..
            */
            for (int i = 2; i*i <= firstNum; i += 2) {
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
