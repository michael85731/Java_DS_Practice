class CircularQueue extends QueueStandard
{
    protected boolean fullFlag = false;

    public CircularQueue(int size){
        super(size);
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public void enQueue(int data){
        this.container[this.rear] = data;
        this.rear = (this.rear + 1) % this.size;
        if(this.rear == this.front){
            this.fullFlag = true;
        }else{
            this.fullFlag = false;
        }
    }

    @Override
    public int deQueue(){
        int element = this.container[this.front];
        this.front = (this.front + 1) % this.size;
        this.fullFlag = false;
        return element;
    }

    @Override
    public boolean isFull(){
        if(this.rear == this.front && this.fullFlag == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isEmpty(){
        if(this.front == this.rear && this.fullFlag == false){
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
