public class ArrtoLL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrtoLL list = new ArrtoLL();
        Node head = list.new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = list.new Node(arr[i]);
            current.next = newNode;
            current = newNode;
        }

        printLinkedList(head);
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("null");
        System.out.println(count);
    }
}
