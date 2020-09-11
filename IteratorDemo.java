
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
    public static void main(final String args[]) {
        ArrayList arr = new ArrayList();
        for(int i=0;i<10;i++)
        {
            arr.add(i);
        }
        System.out.println(arr);

        Iterator it = arr.iterator();

        while(it.hasNext())
        {
            int j =(Integer)it.next();
            System.out.print(j+" ");
        }
    }
}