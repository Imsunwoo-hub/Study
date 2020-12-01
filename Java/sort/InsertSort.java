package 백준단계별로풀어보기.정렬;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		
		int[] ia = {9,1,2,5,3,4,6,8,7,10,15,16,19,12,13};
		insertSort(ia);
		System.out.println(Arrays.toString(ia));

	}
	
	public static void insertSort(int[] ia) {
		for(int i=1; i<ia.length; i++) {
			int temp = ia[i];
			for(int j=i-1; j>=0 && temp < ia[j];  j-- ) {
				ia[j+1] = ia[j];
				ia[j] = temp;
			}
		}
	}

}
