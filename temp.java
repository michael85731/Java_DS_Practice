import java.util.Scanner;

public class temp
{
    private static boolean flag = true;
    private static Scanner scanner = new Scanner(System.in);
    private static Stack stack = null;

    public static void main(String args[]){
        System.out.print("Define stack size: ");
        stack = new Stack(scanner.nextInt());

        System.out.println("Operation code: 1) push data, 2) pop data, 3) check is empty, 4) get stack, exit) termiante the program.");

        while(flag){
            System.out.print("Please type the operation you want to do: ");
            manipulate(scanner.next());
        }
    }

    public static void manipulate(String operator){
        String result = "";

        switch(operator){
            case "1":
                System.out.print("Input the data you want to push: ");
                int data = scanner.nextInt();
                result = stack.push(data) ? "push stack with data " + data : "stack is full";
                System.out.println(result);
                break;
            case "2":
                System.out.print("pop stack with data ");
                System.out.println(stack.pop());
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
    }
}
