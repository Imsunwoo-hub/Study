package 자료구조;

import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTree{

	class Node{
		int data;
		Node left, right;
		
		Node (int data) {
			this.data = data;
		}
	}
	Node root;
	
	public void makeBinarySearchTree(int[] ia) {
		root = makeBinarySearchTree(ia, 0, ia.length-1);
	}
	
	public Node makeBinarySearchTree(int[] ia, int l, int r) {
		if(l > r) return null;
		int mid = (l+r)/2;
		
		Node node = new Node(ia[mid]);
		node.left = makeBinarySearchTree(ia, l, mid-1);
		node.right = makeBinarySearchTree(ia, mid+1, r);
		
		return node;
	}
	
	public Node search(Node root, int key) {
		if(root==null || root.data==key) return root;
		if(root.data < key) return search(root.right, key);
		return search(root.left, key);
	}
	
	public void insert(int data) {
		root = insert(root, data);
		
	}
	
	public Node insert(Node root, int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else if(data > root.data) {
			root.right=  insert(root.right, data);
		}
		return root;
	}
	
	public void delete(int data) {
		root = delete(root, data);
	}
	
	public Node delete(Node root, int data) {
		if(root==null) return root;
		if(data < root.data) {
			root.left = delete(root.left, data);
		}
		else if(data > root.data) {
			root.right = delete(root.right, data);
		}
		else {
			if(root.left==null && root.right==null) return null;
			if(root.left==null) return root.right;
			if(root.right==null) return root.left;
			else {
				root.data = findMin(root.right);
				root.right = delete(root.right, root.data);
			}
		}
		return root;
	}
	
	public int findMin(Node root) {
		int min = root.data;
		while(root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	public void print() {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
			
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(node != null) {
				System.out.print(node.data+" ");
				
				q.offer(node.left);
				q.offer(node.right);
				
			}
		}
		
		System.out.println();
	}
	
	
	
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	
}

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		int[] ia = {1,2,3,5,6,7};
		
		tree.makeBinarySearchTree(ia);
		
		tree.print(); 
		tree.insert(8);
		tree.insert(0);
		tree.insert(4);
		
		tree.print();
		tree.inorder();
		tree.delete(3);
		tree.inorder();
		
	}

}
