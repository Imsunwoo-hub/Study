package 백준단계별로풀어보기.정렬;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] ia = {9,1,2,5,3,4,6,8,7,10,15,16,19,12,13};
		bubbleSort(ia);
		System.out.println(Arrays.toString(ia));

	}
	
	public static void bubbleSort(int[] ia) {
		for(int i=0; i<ia.length; i++) {
			for(int j=1; j<ia.length; j++) {
				if(ia[j-1] > ia[j]) {
					int temp = ia[j];
					ia[j] = ia[j-1];
					ia[j-1] = temp;
				}
			}
		}
	}

}
