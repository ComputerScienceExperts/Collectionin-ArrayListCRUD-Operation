import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Chandan");
        list.add("Ravi");
        list.add("Pankaj");
        list.add("Manoj");
        list.add("ravi");
        System.out.println(list); // [Chandan, Ravi, Pankaj, Manoj]


        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());




      /*  System.out.println(   list.getFirst());

        System.out.println(  list.getLast());*/


        /*list.add("null");
        System.out.println(list);
        list.add("null");
        System.out.println(list);*/


       /* list.addLast("Chandan");
        System.out.println(list);*/


        /*list.addFirst("Puja");
        System.out.println(list);*/



        /*list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());*/



       // System.out.println(list.contains("geeta"));  // false


        /*list.clear();
        System.out.println(list);*/





       // System.out.println(list.remove(0)); // Chandan

       /* list.remove("Chandan");
        System.out.println(list);*/


        //System.out.println(list.size());//4





       /* list.add(1,"Kundan");
        System.out.println(list);*/

       // System.out.println(  list.get(1));  // Kundan





    }
}
