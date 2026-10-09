class LRUCache {
    class Node {
        int key, val;
        Node prev, next;
        Node (int key, int val){
            this.key = key;
            this.val = val;
                }
        }
        HashMap<Integer,Node> map = new HashMap<>();
        Node head = new Node(0,0);
        Node tail = new Node(0,0);
        int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next = tail;
        tail.prev=head;
    }
    void deleteNode(Node node){
    Node prevnode = node.prev;
    Node afternode = node.next;
    prevnode.next = afternode;
    afternode.prev = prevnode;
    }
    void insert(Node node){
        Node currhead = head.next;
        head.next=node;
        node.next = currhead;
        node.prev = head;
        currhead.prev=node;

    
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        deleteNode(node);
        insert(node);


        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            deleteNode(old);
            map.remove(key);
        }
        Node node = new Node(key,value);
        map.put(key,node);
        insert(node);
        if(map.size()>capacity){
            Node lru=tail.prev;
            deleteNode(lru);
            map.remove(lru.key);    
        
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */