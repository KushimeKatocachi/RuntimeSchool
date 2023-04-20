package DSandA;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("CSGO");
        stack.push("DOOM");
        stack.push("Mario Party");

        String myFavGame = stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));
    }
}
