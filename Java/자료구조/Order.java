package 자료구조;

import java.util.LinkedList;
import java.util.Queue;

class Tree{
	class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	static int pIndex = 0;
	
	public void buildTreePre(int[] inorder, int[] preorder) {
		pIndex = 0;
		root = buildTreePre(inorder, preorder, 0, inorder.length-1);
	}
	
	public Node buildTreePre(int[] inorder, int[] preorder, int l, int r) {
		if(l>r) return null;
		Node node = new Node(preorder[pIndex++]);
		if(l==r) return node;
		int mid = search(inorder, l, r, node.data);
		node.left = buildTreePre(inorder, preorder, l, mid-1);
		node.right = buildTreePre(inorder, preorder, mid+1, r);
		
		return node;
	}
	
	public void buildTreePost(int[] inorder, int[] postorder) {
		pIndex = postorder.length-1;
		root = buildTreePost(inorder, postorder, 0, inorder.length-1);
	}
	
	public Node buildTreePost(int[] inorder, int[] postorder, int l, int r) {
		if(l>r) return null;
		
		Node node = new Node(postorder[pIndex--]);
		if(l==r) return node;
		
		int mid = search(inorder, l,r, node.data);
		node.right = buildTreePost(inorder, postorder, mid+1, r);
		node.left = buildTreePost(inorder, postorder, l, mid-1);
		
		return node;
	}
	
	public int search(int[] inorder, int l, int r, int data) {
		int mid = 0;
		for(int i=l; i<=r; i++) {
			if(inorder[i]==data) return i;
		}
		return mid;
	}
	
	public void print() {
		if(root==null) return;
		Queue<Node> queue = new LinkedList<>();	
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			
			if(curr != null) {
				System.out.print(curr.data+" ");
				queue.offer(curr.left);
				queue.offer(curr.right);
			}
		}
		
		System.out.println();
	}
	
}

public class Order {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		int[] pre = {4,2,1,3,6,5,7};
		int[] in = {1,2,3,4,5,6,7};
		int[] post = {1,3,2,5,7,6,4};
		
		tree.buildTreePre(in, pre);
		System.out.println(pre);
		tree.print();
		
		tree.buildTreePost(in, post);
		System.out.println(post);
		tree.print();
	}

}
