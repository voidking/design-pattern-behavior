package iterator2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list=new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        MyIterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
	}

}
