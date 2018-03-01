abstract class StackStandard
{
    protected int[] container = null;
    protected int pointer = 0;

    public StackStandard(int size){
        this.container = new int[size];
    }

    public abstract void push(int data);
    public abstract int pop();
}

class Stack extends StackStandard
{
    public Stack(int size){
        super(size);
    }

    public void push(int data){
        System.out.println("push stack with data " + data);
        this.container[this.pointer] = data;
        this.pointer += 1;
    }

    public int pop(){
        System.out.print("pop stack with data ");
        this.pointer -= 1;
        int topElement = this.container[this.pointer];
        return topElement;
    }
}
