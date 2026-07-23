class LRUCache {
    
    // doubly linked list node
    private class Node {
        int key, val;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }

    private Map<Integer, Node> map;    // key → node
    private Node head, tail;           // dummy head and tail
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);         // dummy head (most recent end)
        tail = new Node(0, 0);         // dummy tail (least recent end)
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);                  // take it out of its current position
        insertFront(node);             // put it at the front (most recent)
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));      // remove old version
        }
        Node node = new Node(key, value);
        insertFront(node);             // add to front
        map.put(key, node);

        if (map.size() > capacity) {
            Node lru = tail.prev;      // least recently used = just before dummy tail
            remove(lru);
            map.remove(lru.key);       // also remove from map
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
