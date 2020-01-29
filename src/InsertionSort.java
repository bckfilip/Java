public class InsertionSort extends Quicksort implements IntSorter{

    @Override
    public void sort(int[] v) { this.InsertionSort(v, 0, v.length - 1);

    }
}
