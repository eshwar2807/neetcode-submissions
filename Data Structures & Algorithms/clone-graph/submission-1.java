/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Node[] clones = new Node[101];            // clones[val] = the copy of that node
        clones[node.val] = new Node(node.val);

        Queue<Node> q = new ArrayDeque<>();
        q.offer(node);                             // queue holds ORIGINAL nodes

        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (Node nei : cur.neighbors) {
                if (clones[nei.val] == null) {     // first time seeing this node
                    clones[nei.val] = new Node(nei.val);
                    q.offer(nei);
                }
                clones[cur.val].neighbors.add(clones[nei.val]);   // wire clone → clone
            }
        }
        return clones[node.val];
    }
}