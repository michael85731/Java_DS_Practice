abstract class SingleLinkingListStandard{
    abstract public void add();
    abstract public void delete();
    abstract public void append();
    abstract public void prepend();
    abstract public void travel();
    abstract public void find();
}

class SingleLinkingList extends SingleLinkingListStandard{
    public SingleLinkingList(){
        System.out.println("List create");
    }

    @Override
    public void add(){
    }

    @Override
    public void delete(){
    }

    @Override
    public void append(){
    }

    @Override
    public void prepend(){
    }

    @Override
    public void travel(){
    }

    @Override
    public void find(){
    }
}
