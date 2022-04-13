

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AddAllExample51 {
    public static void main(String[] args) {
      
        ArrayList<Integer> integers = new ArrayList<>();
       
        integers.add(20);
        Integer obj = Integer.valueOf(40);
        integers.add(obj);
        integers.add(60);
        integers.add(70);
        integers.add(50);
        integers.add(30);
        integers.add(250);
        integers.add(3);
        integers.add(2);
        integers.add(10);
        System.out.println("printing list");
        System.out.println(integers);

        System.out.println("printing list using enhanced for loop");
        for (Integer integer : integers) {
            int no = integer.intValue();
            System.out.println(no);
        }
        System.out.println("printing list using  for loop");
        for (int i = 0; i < integers.size(); i++) {
           
            int no  = integers.get(i);
            System.out.println(no);

        }

       
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(40);
        integerHashSet.add(1000);
        integerHashSet.add(350);
        integerHashSet.add(150);
        integerHashSet.add(1050);
        integerHashSet.add(3500);
        integerHashSet.add(1010);
        integerHashSet.add(10010);
        integerHashSet.add(3150);
        integerHashSet.add(1001);

       
        System.out.println("printing set");
        System.out.println(integerHashSet);
        System.out.println("printing list using enhanced for loop");
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }

  
        integers.addAll(integerHashSet);
        System.out.println("list with added set");
        System.out.println(integers);

        

        integerHashSet.addAll(integers);

        System.out.println("set with added list");
        System.out.println(integerHashSet);

        Iterator<Integer> itr = integerHashSet.iterator();
        System.out.println(itr.next().getClass());









    }
}