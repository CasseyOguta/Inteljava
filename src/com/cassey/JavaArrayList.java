package com.cassey;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        names.add("Cassey");
        names.add("Jessie");
        names.add("Tracy");
        names.add("Stacy");
        names.add("Macy");

        System.out.println(names.get(1));

        names.remove(2);

        System.out.println( names.size() ); //        counts items in the array

      names.clear(); //        wipes out everything from the array

        System.out.println( names.size() );


Functions.areaCircle(69);





    }
}
