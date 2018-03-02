class CircularQueue extends QueueStandard
{
    public CircularQueue(int size){
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
        return this.container[this.front];
    }

    @Override
    public boolean isFull(){
        return this.rear < this.size - 1 ? false : true;
    }

    @Override
    public boolean isEmpty(){
        if(this.front == this.rear){
            this.resetPointer();
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

    private void resetPointer(){
        this.front = -1;
        this.rear = -1;
    }
}
