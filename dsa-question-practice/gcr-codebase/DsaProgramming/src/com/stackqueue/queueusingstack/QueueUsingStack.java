package com.stackqueue.queueusingstack;
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    void enqueue(int x) {
        inStack.push(x);
    }

    int dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        if (outStack.isEmpty()) {
            System.out.println("Queue is empty");
        }

        return outStack.pop();
    }
}
