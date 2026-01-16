package com.stackqueue.sortstackrecursion;
import java.util.Stack;

public class SortStackUsingReccursion {
	static void sortStack(Stack<Integer> st) {
		if (st.isEmpty())
			return;

		int top = st.pop();
		sortStack(st);
		insertSorted(st, top);
	}

	static void insertSorted(Stack<Integer> st, int value) {
		if (st.isEmpty() || st.peek() <= value) {
			st.push(value);
			return;
		}
		int top = st.pop();
		insertSorted(st, value);
		st.push(top);
	}

}
