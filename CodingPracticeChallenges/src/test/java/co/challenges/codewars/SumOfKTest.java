package co.challenges.codewars;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SumOfKTest {

	@Test
	public void BasicTests1() {

		 System.out.println("****** Basic Tests bigger numbers******");
	        List<Integer> ts = new ArrayList<>(Arrays.asList(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
	        int n = SumOfK.chooseBestSum(230, 4, ts);
	        assertEquals(230, n);
	        n = SumOfK.chooseBestSum(430, 5, ts);
	        assertEquals(430, n);
	        Integer m = SumOfK.chooseBestSum(430, 8, ts);
	        assertEquals(null, m);
	        n = SumOfK.chooseBestSum(880, 8, ts);
	        assertEquals(876, n);
	        n = SumOfK.chooseBestSum(2430, 15, ts);
	        assertEquals(1287, n);
	        n = SumOfK.chooseBestSum(100, 2, ts);
	        assertEquals(100, n);
	        n = SumOfK.chooseBestSum(276, 3, ts);
	        assertEquals(276, n);
	        n = SumOfK.chooseBestSum(3760, 17, ts);
	        assertEquals(3654, n);
	        m = SumOfK.chooseBestSum(3760, 40, ts);
	        assertEquals(null, m);
	        n = SumOfK.chooseBestSum(50, 1, ts);
	        assertEquals(50, n);
	        m = SumOfK.chooseBestSum(1000, 18, ts);
	        assertEquals(null, m);
	        ts = new ArrayList<>(Arrays.asList(100, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
	        m = SumOfK.chooseBestSum(230, 4, ts);
	        assertEquals(null, m);
	        n = SumOfK.chooseBestSum(230, 2, ts);
	        assertEquals(223, n);
	        n = SumOfK.chooseBestSum(2333, 1, ts);
	        assertEquals(2333, n);        
	        n = SumOfK.chooseBestSum(2333, 8, ts);
	        assertEquals(825, n);       
	        ts = new ArrayList<>(Arrays.asList(1000, 640, 1230, 2333, 1440, 500, 1320, 1230, 340, 890, 732, 1346));
	        n = SumOfK.chooseBestSum(2300, 4, ts);
	        assertEquals(2212, n);
	        m = SumOfK.chooseBestSum(2300, 5, ts);
	        assertEquals(null, m);
	        n = SumOfK.chooseBestSum(2332, 3, ts);
	        assertEquals(2326, n);
	        n = SumOfK.chooseBestSum(23331, 8, ts);
	        assertEquals(10789, n);
	        m = SumOfK.chooseBestSum(331, 2, ts);
	        assertEquals(null, m);
	}
}
