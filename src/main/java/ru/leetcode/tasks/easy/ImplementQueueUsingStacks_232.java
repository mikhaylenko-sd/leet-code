package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/implement-queue-using-stacks/
public class ImplementQueueUsingStacks_232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek() + "\n" + // return 1
                myQueue.pop() + "\n" + // return 1, queue is [2]
                myQueue.empty()); // return false
    }

}

class MyQueue {
    private int[] queue = new int[0];

    public MyQueue() {
    }

    public void push(int x) {
        int oldLength = queue.length;
        int[] newQueue = new int[oldLength + 1];
        for (int i = 0; i < oldLength; i++) {
            newQueue[i] = queue[i];
        }
        newQueue[oldLength] = x;
        queue = newQueue;
    }

    public int pop() {
        int oldLength = queue.length;
        if (oldLength != 0) {
            int[] newQueue = new int[oldLength - 1];
            for (int i = 0; i < oldLength - 1; i++) {
                newQueue[i] = queue[i + 1];
            }
            int firstElement = queue[0];
            queue = newQueue;
            return firstElement;
        }
        throw new RuntimeException();

    }

    public int peek() {
        if (queue.length != 0) {
            return queue[0];
        }
        throw new RuntimeException();
    }

    public boolean empty() {
        return queue.length == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */