package mr223_assign1;

public class StackMain {
    public static void main(String[] args) {
        Stack programTest = new Stack();
        programTest.push("one");
        programTest.push("two");
        System.out.println(programTest.toString());
        System.out.println("peek: "+programTest.peek());
        String popResult = programTest.pop();
        System.out.println("pop: "+popResult);
        System.out.println("peek: "+programTest.peek());

        System.out.println(programTest.toString());
    }
}
