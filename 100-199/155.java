/**155. Min Stack
 * 
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Example 1:-
Input:
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output:
[null,null,null,null,-3,null,0,-2]

Explanation:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

 */

 //Using arrayList
class MinStack {
    
    List<Integer> list;
    int y;
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
        
    }
    
    public void push(int x) {
        list.add(x);
    }
    public void pop() {
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        int t = Collections.min(list);
        return t;
    }
}

// Using one stack
class MinStack {
    
    Stack<Integer> stack;
    int min ;
    /** initialize your data structure here. */
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if(x <= min){
            stack.push(min);
            min =x;
        }
        stack.push(x);
    }
    public void pop() {
        int x = stack.pop();
        if(x == min){
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
