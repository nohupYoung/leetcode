import java.util.Stack;

public class ImplementQueueUsingStacks {
	
	Stack<Integer> value=new Stack<>();
	Stack<Integer> tmp=new Stack<>();
	// Push element x to the back of queue.
    public void push(int x) {
    	if(value==null){
    		value.push(x);
    	} else {
    		while(!value.isEmpty()) {
    			tmp.push(value.pop());
    		}
    		value.push(x);
    		while(!tmp.isEmpty()) {
    			value.push(tmp.pop());
    		}
    	}
    }

    // Removes the element from in front of queue.
    public void pop() {
    	value.pop();        
    }

    // Get the front element.
    public int peek() {
    	return value.peek();       
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return value.isEmpty();      
    }
}