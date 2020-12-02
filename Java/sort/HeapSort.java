package 백준단계별로풀어보기.정렬;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {

		int[] ia = {9,1,2,5,3,4,6,8,7,10,15,16,19,12,13};
		heapSort(ia);
		System.out.println(Arrays.toString(ia));

	}
	
	public static void heapSort(int[] ia) {
		
		int length = ia.length;
	
		heap(ia, length);
		
		for(int i=length-1; i>0; i--) {
			swap(ia, i, 0);
			heap(ia, i);
		}
		
	}
	
	public static void heap(int[] ia, int length) {
		for(int i=1; i<length; i++) {
			int c = i;
			while(c > 0) {
				int p = (c-1)/2;
				if(ia[c] > ia[p]) {
					swap(ia, c, p);
				}
				c = p;
			}
		}
	}
	
	public static void swap(int[] ia, int i, int j) {
		int temp = ia[i];
		ia[i] = ia[j];
		ia[j] = temp;
	}

}
