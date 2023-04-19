package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/implement-stack-using-queues/description/
public class ImplementStackUsingQueues_225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top() + "\n" + // return 2
                myStack.pop() + "\n" + // return 2
                myStack.empty()); // return False
    }
}

class MyStack {
    private int[] stack = new int[0];

    public MyStack() {
    }

    public void push(int x) {
        int oldLength = stack.length;
        int[] newStack = new int[oldLength + 1];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        newStack[oldLength] = x;

        stack = newStack;
    }

    public int pop() {
        int oldLength = stack.length;
        int[] newStack = new int[oldLength - 1];
        for (int i = 0; i < newStack.length; i++) {
            newStack[i] = stack[i];
        }
        int removedElement = stack[oldLength - 1];
        stack = newStack;

        return removedElement;
    }

    public int top() {
        return stack[stack.length - 1];
    }

    public boolean empty() {
        return stack.length == 0;
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
