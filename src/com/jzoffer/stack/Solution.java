package com.jzoffer.stack;

import java.util.Stack;

/**
 * @author  xxwy
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * 压入
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 弹出
     * @return
     */
    public int pop() {
        Integer result = null;
        if(!stack2.empty()){
            result = stack2.pop();
        }else{
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            if(!stack2.empty()){
                result = stack2.pop();
            }
        }
        return result;
    }
}
