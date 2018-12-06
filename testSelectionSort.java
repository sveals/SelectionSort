import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	private SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort() {
	}
	public void testPositive() {
		int[]arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int[]Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		SelectionSort temp1 = new SelectionSort();
		int [] values = temp1.basicSelectionSort(arr);
		int maxValue = values[Sortedarr.length-1];
		assertEquals("Positive is false", 10, maxValue);
	}
	public void testNegative() {
		int[]arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[]Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		SelectionSort temp1 = new SelectionSort();
		int [] values = temp1.basicSelectionSort(arr);
		int maxValue = values[Sortedarr.length-1];
		assertEquals("Negative is false", -2, maxValue);
	}
	public void testMixed() {
		int[]arr = new int[5];
		arr[0] = 7;
		arr[1] = 2;
		arr[2] = -5;
		arr[3] = 0;
		arr[4] = -1;
		
		int[]Sortedarr = new int[5];
		Sortedarr[0] = -5;
		Sortedarr[1] = -1;
		Sortedarr[2] = 0;
		Sortedarr[3] = 5;
		Sortedarr[4] = 7;
		SelectionSort temp1 = new SelectionSort();
		int [] values = temp1.basicSelectionSort(arr);
		int maxValue = values[Sortedarr.length-1];
		assertEquals("Mixed is false", 7, maxValue);
	}
	public void testDuplicates() {
		int[]arr = new int[5];
		arr[0] = 8;
		arr[1] = 8;
		arr[2] = -7;
		arr[3] = -7;
		arr[4] = 2;
		
		int[]Sortedarr = new int[5];
		Sortedarr[0] = -7;
		Sortedarr[1] = -7;
		Sortedarr[2] = 2;
		Sortedarr[3] = 8;
		Sortedarr[4] = 8;
		SelectionSort temp1 = new SelectionSort();
		int [] values = temp1.basicSelectionSort(arr);
		int maxValue = values[Sortedarr.length-1];
		assertEquals("Duplicate is false", 8, maxValue);
	}
}