public class QuicksortFixedPivotInsertion extends Quicksort implements IntSorter {


    @Override
    public void sort(int[] v) {
        this.quicksort(v, 0, v.length - 1);
    }

    @Override
    public void quicksort(int[] v, int low, int high) {
        if (low < high) {
            if (high - low <= 9) {
                InsertionSort(v, low, high );
                return;
                }
            int pivot = this.pivot(v, low, high);
            int p = partition(v, low, high, pivot);
            quicksort(v, low, p);
            quicksort(v, p + 1, high);
            }
    }
    @Override
    public int pivot(int[] a, int low, int high){
        int rand = low + r.nextInt(high - low);
        return a[rand];
    }

}
