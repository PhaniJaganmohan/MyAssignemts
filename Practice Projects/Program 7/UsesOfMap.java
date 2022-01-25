package www.jagan.learning;

import java.util.*;

public class UsesOfMap 
{
	public static void main(String[] args) {
	//Hashmap
	HashMap ref = new HashMap();
	
    ref.put("1","1");
    ref.put("2","Two");
    ref.put("3","Three");
	ref.put("4",null);
	ref.put(1,16);
	ref.put(null,"Five");
	
    System.out.println("Hashmap is "+ ref);
    System.out.println("Value of 3 is: "+ ref.get("3"));
    System.out.println("Is HashMap empty? "+ref.isEmpty());
    
    ref.remove("3");
    System.out.println("After removal the hashmap is "+ref);
    System.out.println("Size of the HashMap: "+ref.size());
    
    System.out.println(ref.containsValue("Five"));
 
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    
    linkedHashMap.put(1, new String("Hi"));
    linkedHashMap.put(2, new String("what"));
    linkedHashMap.put(3, new String("is"));
    linkedHashMap.put(4, new String("your"));
    linkedHashMap.put(5, new String("name?"));
    
    
    System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
    System.out.println("\nValues of map after iterating over it : ");
    
    for (Integer key : linkedHashMap.keySet()) {
        System.out.println(key + ":\t" + linkedHashMap.get(key));
    }
    
    System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
    System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
    System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
    System.out.println("LinkedHashMap contains HCL as value? : " + linkedHashMap.containsValue("HCL"));
    System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
    System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
   
    linkedHashMap.clear();
    System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
    
    
    //Treemap
    TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
    marks.put("Student1", 120);
    marks.put("Student5", 99);
    marks.put("Student6", 130);
    marks.put("Student2", 190);
    marks.put("Student3", 89);
    marks.put("Student4", 142);
    
    for(String key: marks.keySet()){
		System.out.println(key  +" : "+ marks.get(key));
    }
}
}
