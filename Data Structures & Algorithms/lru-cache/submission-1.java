class LRUCache {
    class Node {
        int key, val;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }

    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(0, 0);   // dummy: newest side
    Node tail = new Node(0, 0);   // dummy: oldest side
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    private void addFront(Node n) {
        n.next = head.next;
        n.prev = head;
        head.next.prev = n;
        head.next = n;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node n = map.get(key);
        remove(n);
        addFront(n);          // just used → now most recent
        return n.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));   // drop the old version
        }
        Node n = new Node(key, value);
        addFront(n);
        map.put(key, n);

        if (map.size() > cap) {
            Node lru = tail.prev;   // least recently used
            remove(lru);
            map.remove(lru.key);
        }
    }
}