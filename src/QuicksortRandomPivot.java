public class QuicksortRandomPivot extends Quicksort implements IntSorter {


    @Override
    public void sort(int[] v) {
        this.quicksort(v, 0, v.length - 1);
    }

    @Override
    public int pivot(int[] v, int low, int high) {
        int rand = low + r.nextInt(high - low);
        int temp = v[high];
        v[high] = v[rand];
        v[rand] = temp;
        return v[high];
    }
}
