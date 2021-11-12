package com.company;

public class Stack {
        private long[] stackArray;
        private int top;

        public Stack(int s) {
                stackArray = new long[s];
                top = 0;
        }

        public void push(int element) {
                stackArray[top++] = element;

        }

        public long pop() {
                return stackArray[--top];
        }

        public boolean isEmpty() {
                return top == 0;

        }


}
