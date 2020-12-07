package 자료구조;

import java.util.ArrayList;

class MinHeap{
	ArrayList<Integer> heap;
	
	MinHeap(){
		heap = new ArrayList<>();
		heap.add(0);
	}
	
	public void offer(int data) {
		heap.add(data);
		
		int idx = heap.size()-1;
		
		while(idx > 1 && heap.get(idx/2) > heap.get(idx)) {
			
			int temp = heap.get(idx/2);
			heap.set(idx/2, heap.get(idx));
			heap.set(idx, temp);
			
			idx /= 2;
		}
	}
	
	public int poll() {
		if(heap.size()==1) return 0;
		
		int data = heap.get(1);
		
		heap.set(1, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int idx = 1;
		
		while(idx*2 < heap.size()) {
			
			int min = heap.get(idx*2);
			int minIdx = idx*2;
			
			if(idx*2+1 < heap.size() && heap.get(idx*2+1) < min) {
				min = heap.get(idx*2+1);
				minIdx = idx*2+1;
			}
			
			if(heap.get(idx) < min) {
				break;
			}
			
			int temp = heap.get(idx);
			heap.set(idx, min);
			heap.set(minIdx, temp);
			
			idx = minIdx;
		}
		
		return data;
	}
	
	public boolean isEmpty() {
		if(heap.size() > 1) return false;
		return true;
	}
	
}

public class HeapTest {

	public static void main(String[] args) {
		
		MinHeap minHeap = new MinHeap();
		
		minHeap.offer(3);
		minHeap.offer(1);
		minHeap.offer(2);
		minHeap.offer(13);
		minHeap.offer(7);
		minHeap.offer(6);
		
		while(!minHeap.isEmpty()) {
			
			System.out.println(minHeap.poll());
			
		}
		
	}

}
