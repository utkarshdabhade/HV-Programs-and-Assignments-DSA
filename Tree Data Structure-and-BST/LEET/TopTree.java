import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
      if (root == null)
            return;

        Queue<QueueItem> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        // Enqueue the root node with horizontal distance 0
        queue.add(new QueueItem(root, 0));

        while (!queue.isEmpty()) {
            QueueItem item = queue.poll();
            Node node = item.node;
            int hd = item.horizontalDistance;

            // Insert the node's value in the map if it doesn't exist
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            // Enqueue the left and right child of the current node
            // with updated horizontal distance
            if (node.left != null)
                queue.add(new QueueItem(node.left, hd - 1));
            if (node.right != null)
                queue.add(new QueueItem(node.right, hd + 1));
        }

        // Print the top view nodes from the map
        for (int value : map.values()) {
            System.out.print(value + " ");
        }
    }

    // Class to represent an item in the queue
    static class QueueItem {
        Node node;
        int horizontalDistance;

        QueueItem(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }
      
    

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}
