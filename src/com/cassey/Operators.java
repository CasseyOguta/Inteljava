package com.cassey;

public class Operators {

    public static void main(String[] args) {
//        - + * /
//        comparison >  <   >=   <=
//        and or
        System.out.println(10 + 20);
        String fname = "Cassey";
        String sname = "Moses";
        int age = 19;
        String full_name = fname + " " + sname + "," + age;
        System.out.println(full_name);
        System.out.println(10 / 3.0);

//        casting
        int z = 10;
        System.out.println((double) z);

        int k = (int) 10.99;

        System.out.println(k);
        System.out.println(10 <= 20);
        System.out.println(10 > 20);
        System.out.println(10 == 10.0);
        int j = 10;
        double h = 10.0;
        System.out.println(j == h);
        String name ="Mary";
        String jina ="mary";
        System.out.println(name == jina);//        wrong way
        System.out.println( name.equals(jina));//        correct way
        System.out.println(name.equalsIgnoreCase(jina));

        System.out.println(1000 % 44);//modulus
//and
        System.out.println(100 >20 && "jina".equals("Jina"));
        System.out.println(100 >20 && "jina".equals("jina"));
//        or
        System.out.println(100 >20 || "jina".equals("jina"));
//        not equal
        System.out.println( 10 !=20);
        System.out.println( ! "Kenya".equals("kenya") );










    }


}
