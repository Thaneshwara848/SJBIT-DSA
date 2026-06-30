package p1;


import java.util.Stack;

public class ValidateBracketSequence {

public static boolean isValid(String str) {

Stack<Character> stack = new Stack<>();

for (int i = 0; i < str.length(); i++) {

char ch = str.charAt(i);

if (ch == '(' || ch == '{' || ch == '[') {
stack.push(ch);
}
else if (ch == ')' || ch == '}' || ch == ']') {

if (stack.isEmpty()) {
return false;
}

char top = stack.pop();

if (ch == ')' && top != '(') return false;
if (ch == '}' && top != '{') return false;
if (ch == ']' && top != '[') return false;
}
}

return stack.isEmpty();
}

public static void main(String[] args) {

String input = "{[()]}";

if (isValid(input)) {
System.out.println("Valid Bracket Sequence");
} else {
System.out.println("Invalid Bracket Sequence");
}
}
}
