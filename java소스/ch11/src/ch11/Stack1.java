package ch11;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		String[] nations = {"미국","중국","한국","영국","종국","떡국"};
		Stack<String> stack = new Stack<>();
		for(String nation:nations) {
			stack.push(nation);
		}
		while(!stack.empty()) { //empty는 비어 있다
			System.out.println(stack.pop());
		}
	}
}
