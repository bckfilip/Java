import java.util.Random;

public class Quicksort {

    Random r = new Random();

    public void InsertionSort(int a[], int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int j = i;
            while (j > low && a[j - 1] > (a[j])) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    public void quicksort(int a[], int low, int high) {

        if (low < high) {
                int pivot = this.pivot(a, low, high);
                int p = partition(a, low, high, pivot);
                quicksort(a, low, p);
                quicksort(a, p + 1, high);

            }
        }


    public int partition(int a[], int low, int high, int pivot){
        //variable

        int i = low - 1;
        int j = high + 1;

        while(true){
            do {
                i = i + 1; //since i = low - 1
            }
            while(a[i] < pivot);

            do {
                j = j - 1; //since j = high + 1
            } while(a[j] > pivot);
            if(i >= j){
                return j; //When two converging sides meet
            }
            // swap
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
    public int pivot(int a[], int low, int high){
        return a[low];
    }
}
