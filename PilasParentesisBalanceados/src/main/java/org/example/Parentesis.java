package org.example;
import java.util.Stack;

public class Parentesis {
     public static void main(String[] args) {
        String parentesis1 = "{[()]}";
        String parentesis2 = "{[(])}";
        String parentesis3 = "({](})";
        String parentesis4 = "([{}])";
        String parentesis5 = "[[({})]]";

        System.out.println(parentesis1 + " : " + estaBien(parentesis1));
        System.out.println(parentesis2 + " : " + estaBien(parentesis2));
        System.out.println(parentesis3 + " : " + estaBien(parentesis3));
        System.out.println(parentesis4 + " : " + estaBien(parentesis4));
        System.out.println(parentesis5 + " : " + estaBien(parentesis5));
    }

    public static boolean estaBien(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char pilas : expresion.toCharArray()) {
            if (pilas == '(' || pilas == '{' || pilas == '[') {
                pila.push(pilas);
            } else if (pilas == ')' && !pila.isEmpty() && pila.peek() == '(') {
                pila.pop();
            } else if (pilas == '}' && !pila.isEmpty() && pila.peek() == '{') {
                pila.pop();
            } else if (pilas == ']' && !pila.isEmpty() && pila.peek() == '[') {
                pila.pop();
            } else {
                return false;
            }
        }
        return pila.isEmpty();
    }

}

