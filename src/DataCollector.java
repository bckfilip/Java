import java.util.Arrays;

public class DataCollector {
    public static void main(String[] args) {
        int[] data1 = new Data(100, 10000, Data.Order.DESCENDING).get();
        int[] data2 = new Data(1000, 10000, Data.Order.DESCENDING).get();
        int[] data3 = new Data(10000, 10000, Data.Order.DESCENDING).get();
        int[] data4 = new Data(100000, 10000, Data.Order.DESCENDING).get();
        int[] data5 = new Data(1000000, 10000, Data.Order.DESCENDING).get();
        Stopwatch s = new Stopwatch();
        //QuicksortFixedPivot bira = new QuicksortFixedPivot();
        //QuicksortRandomPivot bira = new QuicksortRandomPivot();
        QuicksortFixedPivotInsertion bira = new QuicksortFixedPivotInsertion();
        //QuicksortRandomPivotInsertion bira = new QuicksortRandomPivotInsertion();
        //InsertionSort bira = new InsertionSort();



        s.start();
        //Arrays.sort(data1);
        bira.sort(data1);
        System.out.println("n = 100 ---> Time: " + s.nanoseconds() / 1000000.0 + " milliSec");
        s.stop(); s.reset();

        s.start();
        //Arrays.sort(data2);
        bira.sort(data2);
        System.out.println("n = 1000 ---> Time: " + s.nanoseconds() / 1000000.0 + " milliSec");
        s.stop(); s.reset();

        s.start();
        //Arrays.sort(data3);
        bira.sort(data3);
        System.out.println("n = 10000 ---> Time: " + s.nanoseconds() / 1000000.0 + " milliSec");
        s.stop(); s.reset();

        s.start();
        //Arrays.sort(data4);
        bira.sort(data4);
        System.out.println("n = 100000 ---> Time: " + s.nanoseconds() / 1000000.0 + " milliSec");
        s.stop(); s.reset();

        s.start();
        //Arrays.sort(data5);
        bira.sort(data5);
        System.out.println("n = 1000000 ---> Time: " + s.nanoseconds() / 1000000.0 + " milliSec");
        s.stop(); s.reset();
    }
}
