public class QuicksortFixedPivot extends Quicksort implements IntSorter {


    @Override
    public void sort(int[] v) {
        this.quicksort(v, 0, v.length - 1);
    }
}
