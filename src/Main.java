import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        //Java is popular for apps.
        stack1.push("Java");
        stack1.push("is");
        stack1.push("object-oriented");
        stack1.push("language");
        Stack<String> stack2 = new Stack<>();
        stack2.push("Java");
        stack2.push("is");
        stack2.push("popular");
        stack2.push("for");
        stack2.push("apps");
        System.out.println("Изначальные данные:\n" + "stack1 = " + stack1 + "\nstack2 = " + stack2);
        Stack<String> tempstack1 = new Stack<>();
        Stack<String> tempstack2 = new Stack<>();
        while(!stack1.isEmpty()){
            tempstack1.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
            tempstack2.push(stack2.pop());
        }
        while(!tempstack1.isEmpty()){
            stack1.push(tempstack1.pop());
        }
        while(!tempstack2.isEmpty()){
            stack2.push(tempstack2.pop());
        }
        System.out.println("Данные после обмена:\n" + "stack1 = " + stack1 + "\nstack2 = " + stack2);

    }


}