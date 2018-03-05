import java.util.Scanner;

public class temp
{
    private static boolean flag = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //runQueue();
        //runStack();
        //runCircularQueue();
        runSingleLinkingList();
    }

    public static void runSingleLinkingList(){
        SingleListNode node = new SingleListNode();
    }

    public static void runCircularQueue(){
        System.out.print("Define circularQueue size: ");
        CircularQueue circularQueue = new CircularQueue(scanner.nextInt());

        System.out.println("Operation code: 1) enqueue data, 2) dequeue data, 3) check is empty, 4) get queue, exit) termiante the program.");

        while(flag){
            System.out.print("Please type the operation you want to do: ");
            circularQueue = manipulateCircularQueue(scanner.next(), circularQueue);
        }
    }

    public static CircularQueue manipulateCircularQueue(String instruction, CircularQueue circularQueue){
        switch(instruction){
            case "1":
                if(circularQueue.isFull()){
                    System.out.println("Queue is full now.");
                }else{
                    System.out.print("Input data to queue: ");
                    circularQueue.enQueue(scanner.nextInt());
                }
                break;
            case "2":
                if(circularQueue.isEmpty()){
                    System.out.println("Queue is empty now.");
                }else{
                    System.out.println("deQueue with data: " + circularQueue.deQueue());
                }
                break;
            case "3":
                String result = circularQueue.isEmpty() ? "queue is empty" : "queue is not empty";
                System.out.println(result);
                break;
            case "4":
                if(circularQueue.isEmpty()){
                    System.out.println("queue is empty now.");
                    break;
                }else{
                    circularQueue.getQueue();
                }
                break;
            case "exit":
                flag = false;
                break;
            default:
                System.out.println("not valid instruction.");
        }

        return circularQueue;
    }

    public static void runQueue(){
        System.out.print("Define queue size: ");
        Queue queue = new Queue(scanner.nextInt());

        System.out.println("Operation code: 1) enqueue data, 2) dequeue data, 3) check is empty, 4) get queue, exit) termiante the program.");

        while(flag){
            System.out.print("Please type the operation you want to do: ");
            queue = manipulateQueue(scanner.next(), queue);
        }
    }

    public static Queue manipulateQueue(String instruction, Queue queue){
        switch(instruction){
            case "1":
                if(queue.isFull()){
                    System.out.println("Queue is full now.");
                }else{
                    System.out.print("Input data to queue: ");
                    queue.enQueue(scanner.nextInt());
                }
                break;
            case "2":
                if(queue.isEmpty()){
                    System.out.println("Queue is empty now.");
                }else{
                    System.out.println("deQueue with data: " + queue.deQueue());
                }
                break;
            case "3":
                String result = queue.isEmpty() ? "queue is empty" : "queue is not empty";
                System.out.println(result);
                break;
            case "4":
                if(queue.isEmpty()){
                    System.out.println("queue is empty now.");
                    break;
                }else{
                    queue.getQueue();
                }
                break;
            case "exit":
                flag = false;
                break;
            default:
                System.out.println("not valid instruction.");
        }

        return queue;
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
                String result = stack.isEmpty() ? "stack is empty" : "stack is not empty";
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
                System.out.println("not valid instruction.");
        }
        return stack;
    }
}
