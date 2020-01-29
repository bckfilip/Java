import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

/**
 * Abstract test class for  implementations.
 *
 * Implementing test classes must override the getIntSorter method.
 *
 * @author Simon Larsén
 * @version 2018-01-16
 */
public abstract class IntSorterTest {
    /**
     * Returns an implementation of the IntSorter interface. Extending classes
     * must override this method.
     *
     * @return An implementation of Set.
     */
    protected abstract IntSorter getIntSorter();
    private int[] ascendingEven;
    private int[] ascendingOdd;
    private int[] descendingEven;
    private int[] descendingOdd;
    private int[] oddLengthArray;
    private int[] evenLengthArray;
    private int[] randomEven;
    private int[] randomOdd;
    private int[] allElementsEqualEven;
    private int[] allElementsEqualOdd;
    private int[] largeEven;
    private int[] largeOdd;

    @Before
    public void setUp() {
     oddLengthArray = new int[]{1, 5, 23, -23, 3, 4, 1, -2, 3};
     evenLengthArray = new int[]{3, 123, 4, -2, -512, -3, 8, 20};
     allElementsEqualEven = new int[]{3, 3, 3, 3, 3, 3};
     allElementsEqualOdd = new int[]{3, 3, 3, 3, 3, 3, 3};
     ascendingEven = new Data(99, 50, Data.Order.ASCENDING).get();
     ascendingOdd = new Data(100, 50, Data.Order.ASCENDING).get();
     descendingEven = new Data(99, 50, Data.Order.DESCENDING).get();
     descendingOdd = new Data(100, 50, Data.Order.DESCENDING).get();
     randomEven = new Data(99, 50, Data.Order.RANDOM).get();
     randomOdd = new Data(100, 50, Data.Order.RANDOM).get();
     largeOdd = new Data(1234, 100, Data.Order.RANDOM).get();
     largeEven = new Data(1235, 100, Data.Order.RANDOM).get();
    }


    public boolean compareSort(int[] arr) {
        int[] a = arr.clone();
        int[] b = arr.clone();

        Arrays.sort(a);
        getIntSorter().sort(b);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("NEW");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(b[i]);
        }


        return Arrays.equals(a, b);
    }

    @Test
    public void oddLengthTest(){
        compareSort(oddLengthArray);

        assertEquals(compareSort(oddLengthArray), true);
    }

    @Test
    public void evenLengthTest() {
        compareSort(evenLengthArray);

        assertEquals(compareSort(evenLengthArray), true);
    }

    @Test
    public void ascEvenTest() {
        compareSort(ascendingEven);

        assertEquals(compareSort(ascendingEven), true);
    }
    @Test
    public void ascOddTest() {
        compareSort(ascendingOdd);

        assertEquals(compareSort(ascendingOdd), true);
    }

    @Test
    public void desEvenTest() {
        compareSort(descendingEven);

        assertEquals(compareSort(descendingEven), true);
    }

    @Test
    public void desOddTest() {
        compareSort(descendingOdd);

        assertEquals(compareSort(descendingOdd), true);
    }

    @Test
    public void randomEvenTest() {
        compareSort(randomEven);

        assertEquals(compareSort(randomEven), true);
    }

    @Test
    public void randomOddTest() {
        compareSort(randomOdd);

        assertEquals(compareSort(randomOdd), true);
    }

    @Test
    public void allEqualEvenTest() {
        compareSort(allElementsEqualEven);

        assertEquals(compareSort(allElementsEqualEven), true);

    }

    @Test
    public void allEqualOddTest() {
        compareSort(allElementsEqualOdd);

        assertEquals(compareSort(allElementsEqualOdd), true);

    }

    @Test
    public void largeArrEvenTest() {
        compareSort(largeEven);

        assertEquals(compareSort(largeEven), true);

    }

    @Test
    public void largeArrOddTest() {
        compareSort(largeOdd);

        assertEquals(compareSort(largeOdd), true);

    }
}