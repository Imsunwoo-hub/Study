package 백준단계별로풀어보기.정렬;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] ia = {9,1,2,5,3,4,6,8,7,10,15,16,19,12,13};
		
		selectSort(ia);
		
		System.out.println(Arrays.toString(ia));

	}
	
	public static void selectSort(int[] ia) {
		for(int i=0; i<ia.length; i++) {
			int min = ia[i];
			int idx = i;
			for(int j=i+1; j<ia.length; j++) {
				if(ia[j] < min) {
					min = ia[j];
					idx = j;
				}
			}
			ia[idx] = ia[i];
			ia[i] = min;
		}
	}
}
