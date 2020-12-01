package 백준단계별로풀어보기.정렬;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] ia = {9,1,2,5,3,4,6,8,7,10,15,16,19,12,13};
		
		
		quickSort(ia, 0, ia.length-1);
		System.out.println(Arrays.toString(ia));

	}
	
	public static void quickSort(int[] ia, int l, int r) {
		if(l<r) {
			int p = getPivot(ia, l, r);
			
			quickSort(ia, l, p-1);
			quickSort(ia, p+1, r);
			
		}
	}
	
	public static int getPivot(int[] ia, int l, int r) {
		int p = ia[r];
		int i = l-1;
		
		for(int j=l; j<r; j++) {
			if(ia[j] <= p) {
				i++;
				swap(ia, i, j);
			}
		}
		swap(ia, i+1, r);
		return i+1;
	}
	
	public static void swap(int[] ia, int i, int j) {
		int temp = ia[i];
		ia[i] = ia[j];
		ia[j] = temp;
	}

}
