package iterator;

import java.util.*;

public class Client
{
    public static void main(String[] args)
    {
    	/**
    	 * List部分
    	 */
        List<String> list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        
        for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}
        
//        Iterator iter = list.iterator();
//        while (iter.hasNext())
//        {
//            System.out.println(iter.next());
//        }
        
        /**
         * Set部分
         */
        Set<String> set = new HashSet<String>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
        	System.out.println(iterator.next());
        }

        /**
         * Map部分
         */
        Map<String,String> map = new HashMap();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
        	String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
		}
        
//        for (String key : map.keySet()) {
//        	System.out.println("Key = " + key + ", Value = " + map.get(key));
//        }
        
//        Set set2 = map.entrySet();
//        Iterator iterator2 = set2.iterator();
//        while (iterator2.hasNext())
//        {
//            Map.Entry<String,String> entry = (Map.Entry) iterator2.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Key = " + key + ", Value = " + value);
//        }
        
    }
}
