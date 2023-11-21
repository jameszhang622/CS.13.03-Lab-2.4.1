import java.util.LinkedList;

public class CISStack {

    // Linked list property.
    private LinkedList<Integer> stack;

    // Size property.
    private int size;

    // Constructor.
    public CISStack(){
        this.stack = new LinkedList();
        this.size = 0;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(int x){
        stack.addLast(x);
        size++;
    }

    // Pop. This method pops a value from the top of the stack.
    public int pop(){
        int x = stack.getLast();
        stack.removeLast();
        size--;
        return x;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        } else{
            return false;
        }
    }
    // size. Returns the size of the queue.
    public int size(){
        return size;
    }
    // toString. Returns a description of the queue in, for example, the following format:
    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + stack +
                ", size=" + size +
                '}';
    }
    // CISStack{stack=[7, 11], size=2}

}
