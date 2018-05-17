class MyQuickSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 5, 3, 7));
        List<Integer> out;

        out = quickSort(arr);
        System.out.println("input -> " + arr + " output: -> " + out);
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>();
        quickSortHelper(arr, sorted);
        return sorted;
    }

    private static void quickSortHelper(List<Integer> arr, List<Integer> out) {
        if (arr.size() < 1) return;

        if (arr.size() < 2) {
            out.add(arr.get(0));
            return;
        }

        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> samePivot = new ArrayList<>();


        int pivot = arr.get(0);

        for (int i : arr) {
            if (i > pivot) {
                greater.add(i);
            }
            else if (i < pivot ){
                less.add(i);
            }
            else
                samePivot.add(i);
        }

        quickSortHelper(less, out);
        out.addAll(samePivot);
        quickSortHelper(greater, out);
    }
}
