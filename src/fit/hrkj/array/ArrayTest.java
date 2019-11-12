package fit.hrkj.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { -10, 0, 10 };
		int low = 0;
		int high = a.length - 1;
		int b = -1;
		int index = binarySearch(a,low ,a.length,b);
		System.out.println(b + "的索引是" + index);
	}

	private static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}
}
