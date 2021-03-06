abstract class StackStandard
{
    protected int[] container = null;
    protected int pointer = -1;
    protected int size = 0;

    public StackStandard(int size){
        this.container = new int[size];
        this.size = size;
    }

    abstract public void push(int data);
    abstract public int pop();
    abstract public boolean isEmpty();
    abstract public boolean isFull();
    abstract public void getStack();
}

class Stack extends StackStandard
{
    public Stack(int size){
        super(size);
    }

    @Override
    public boolean isFull(){
        return this.pointer < this.size - 1 ? false : true;
    }

    @Override
    public void push(int data){
        this.pointer += 1;
        this.container[this.pointer] = data;
    }

    @Override
    public int pop(){
        int topElement = this.container[this.pointer];
        this.pointer -= 1;
        return topElement;
    }

    @Override
    public boolean isEmpty(){
        return this.pointer < 0 ? true : false;
    }

    @Override
    public void getStack(){
        while(!(isEmpty())){
            System.out.println(this.pop());
        }
    }
}
