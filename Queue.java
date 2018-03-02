abstract class QueueStandard
{
    protected int size = 0;
    protected int[] container = null;
    protected int front = -1;
    protected int rear = -1;

    public QueueStandard(int size){
        this.container = new int[size];
        this.size = size;
    }

    abstract public void enQueue(int arg);
    abstract public int deQueue();
    abstract public boolean isFull();
    abstract public boolean isEmpty();
    abstract public void getQueue();
}

class Queue extends QueueStandard
{
    public Queue(int size){
        super(size);
    }

    @Override
    public void enQueue(int data){
        this.rear += 1;
        this.container[this.rear] = data;
    }

    @Override
    public int deQueue(){
        this.front += 1;
        return this.container[t:his.front];
    }

    @Override
    public boolean isFull(){
        return this.rear < this.size - 1 ? false : true;
    }

    @Override
    public boolean isEmpty(){
        if(this.front == this.rear){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void getQueue(){
        while(!(isEmpty())){
            System.out.println(deQueue());
        }
    }
}
