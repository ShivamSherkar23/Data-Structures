import java.util.HashMap;

public class HashMapDemo 
{
    public static void main(String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("amar", 10); 
        hm.put("bhavesh", 30); 
        hm.put("chandu", 20);
        hm.put("dev", 40);
    
        System.out.println("Size of map is:- " + hm.size()); 
        System.out.println(hm);
        
        //traversal
        for (HashMap.Entry<String, Integer> e : hm.entrySet())
        { 
            System.out.println(e.getKey() + " " + e.getValue());
        }    
    }

    
}
