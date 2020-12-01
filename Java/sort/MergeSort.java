package 백준단계별로풀어보기.정렬;

import java.util.Arrays;

public class MergeSort {

	static int[] sorted;
	
	public static void main(String[] args) {
		
		int[] ia = {9,1,2,5,3,4,6,8,7,10,15,16,19,12,13};
		sorted  = new int[ia.length];
		
		mergeSort(ia, 0, ia.length-1);
		System.out.println(Arrays.toString(ia));
		
	}
	
	public static void mergeSort(int[] ia, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			
			mergeSort(ia, l, mid);
			mergeSort(ia, mid+1, r);
			
			merge(ia, l,mid,r);
			
		}
	}
	
	public static void merge(int[] ia, int l, int m, int r) {
		int i = l;
		int j = m+1;
		int k = l;
		
		while( i<=m && j<=r) {
			if(ia[i] <= ia[j]) {
				sorted[k++] = ia[i++];
			}
			else {
				sorted[k++] = ia[j++];
			}
		}
		
		if(i > m) {
			for(int t=j; t<=r; t++) {
				sorted[k++] = ia[t];
			}
		}
		else {
			for(int t=i; t<=m; t++) {
				sorted[k++] = ia[t];
			}
		}
		
		for(int t=l; t<=r; t++) {
			ia[t] = sorted[t];
		}
	}

}
