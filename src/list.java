import static java.lang.System.out;
public class list  {
    node head;
    node tail;
    public void addNode(int val) {
        if (this.tail == null) {
            var node = new node(val, null, null);
            this.tail = node;
            this.head = node;
        } else {
            var node = new node(val,null, this.tail);
            this.tail.next = node;
            this.tail = node;
        }
    }
    public void printList(list list) {

        while (head != null) {
            out.println(head.val);
            head = head.next;
        }
    }
    public void ReversePrintList(list list) {

        while (tail != null) {
            out.println(tail.val);
            tail = tail.preview;
        }
    }
}
