// 1) Divide and conquer
// 2) Walking one-by-one

class SortedRecursive {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(Arrays.asList(9, 9, 9));
        List<Integer> test2 = new ArrayList<>(Arrays.asList(9, 10, 11));
        List<Integer> test3 = new ArrayList<>(Arrays.asList(5, 5, 3, 7));
        List<Integer> test4 = new ArrayList<>(Arrays.asList(1,2,2,3,3,4));


        System.out.println("test(nlogn) -> " + isSorted(test));
        System.out.println("test(n) -> " + isSortedAnotherVersion(test, 0));
        System.out.println("test2(nlogn) -> " + isSorted(test2));
        System.out.println("test2(n) -> " + isSortedAnotherVersion(test2, 0));
        System.out.println("input(nlogn) -> " + isSorted(test3));
        System.out.println("input(n) -> " + isSortedAnotherVersion(test3, 0));
        System.out.println("output(nlogn) -> " + isSorted(test4));
        System.out.println("output(n) -> " + isSortedAnotherVersion(test4, 0));
    }

    public static boolean isSorted(List<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return false;
        }

        if (arr.size() == 1) {
            return true;
        }


        int middleIndex = arr.size() / 2 ;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < middleIndex; i++) {
            left.add(arr.get(i));
        }

        for (int i = middleIndex; i < arr.size(); i++) {
            right.add(arr.get(i));
        }

        //System.out.println("left -> " + left + " right -> " + right);

        boolean result = left.get(middleIndex - 1) <= right.get(0);

        return result && isSorted(left) && isSorted(right);

    }

    public static boolean isSortedAnotherVersion(List<Integer> arr, int index) {
        if (arr == null || arr.size() == 0)
            return false;
        if (arr.size() == 1 || index == arr.size() - 1)
            return true;
        if (arr.get(index) > arr.get(index + 1)) 
            return false;
        
        return isSortedAnotherVersion(arr, index + 1);
    }

}
