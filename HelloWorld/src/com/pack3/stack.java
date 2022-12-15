package com.pack3;

import java.util.Stack;
import java.util.stream.StreamSupport;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.search(2));
        stack.add(555);
        System.out.println(stack.peek());
        System.out.println(stack.clone());
    }
}
