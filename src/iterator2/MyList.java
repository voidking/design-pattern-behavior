package iterator2;

public interface MyList {

    public void add(Object obj);  
    public Object get(int index);
    public MyIterator iterator();  
    public int getSize();
}
