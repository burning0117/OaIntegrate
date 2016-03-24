package test;

import java.util.*;

/**
 * Created by burning on 2016/3/22.
 */
public class TestMap {
    public static void main(String[] args) {
        Set set=new HashSet();
        String s1=new String("hello");
        String s2=s1;
        String s3=new String("world") ;
        set.add(s1);
        set.add(s2);
        set.add(s3);
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            String set1=iterator.next();
            System.out.println(set1);
        }

//        Map<Object, Object> map = new HashMap<Object, Object>();
//        map.put("test", "test");
//        map.put("test1","test1");
//        map.put("test2","test2");
//        map.put("test3", "test3");
//
//        Iterator entries=map.entrySet().iterator();
//        while (entries.hasNext()){
//            Map.Entry entry=(Map.Entry)entries.next();
//            String key= (String) entry.getKey();
//            String value= (String) entry.getValue();
//            System.out.println(value);
//        }
//        Set<Object> set=map.keySet();
//        for (Object set1:set){
//            String str= (String) map.get(set1);
//            System.out.println(str);
//        }
    }
}
