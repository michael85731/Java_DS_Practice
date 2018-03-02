import java.util.Scanner;

public class temp
{
    private static boolean flag = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        runStack();
    }

    public static void runStack(){
        System.out.print("Define stack size: ");
        Stack stack = new Stack(scanner.nextInt());

        System.out.println("Operation code: 1) push data, 2) pop data, 3) check is empty, 4) get stack, exit) termiante the program.");

        while(flag){
            System.out.print("Please type the operation you want to do: ");
            stack = manipulateStack(scanner.next(), stack);
        }
    }

    public static Stack manipulateStack(String operator, Stack stack){
        String result = "";

        switch(operator){
            case "1":
                if(stack.isFull()){
                    System.out.println("stack is full now.");
                }else{
                    System.out.print("Input the data you want to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    System.out.println("push stack with data " + data);
                }
                break;
            case "2":
                if(stack.isEmpty()){
                    System.out.println("stack is empty now.");
                }else{
                    System.out.print("pop stack with data ");
                    System.out.println(stack.pop());
                }
                break;
            case "3":
                result = stack.isEmpty() ? "stack is empty" : "stack is not empty";
                System.out.println(result);
                break;
            case "4":
                if(stack.isEmpty()){
                    System.out.println("stack is empty now.");
                    break;
                }else{
                    stack.getStack();
                }
                break;
            case "exit":
                flag = false;
                break;
            default:
                System.out.println("not valid input");
        }
        return stack;
    }
}
