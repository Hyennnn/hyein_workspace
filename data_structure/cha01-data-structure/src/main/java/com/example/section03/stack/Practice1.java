package com.example.section03.stack;

import java.util.Stack;

public class Practice1 {
  public String solution(String input) {
      Stack<Character> stack = new Stack<>(); // stack이 비었는지 안 비었느지

      for(char c : input.toCharArray()) {
          if (c == '(') {
              // 여는 괄호일 경우 스택에 push 해서 보관

          } else {
              // 스택이 비어서 괄호를 꺼낼 수 없다면
              if(stack.isEmpty()) {
                  return "NO";
              }
              // 닫는 괄호일 경우 스태에서 pop 해서 괄호와 짝을 맞춤
              stack.pop();
          }
      }

      // 모든 문자열에 대해 처리, 스택에 여는 괄호가 남아있는 경우
      // 닫는 괄호가 부족, 짝이 안 맞는 겨우
      if(!stack.isEmpty()) {
          return "NO";
      }

      return "YES";
  }


}
