package com.company;

import company2.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello");
//        int a =3;
//        Human h1 = new Human(2, 2);
//        Human.increaseEyesCount();
//
//        Human h2 = new Human(2,2);
//
//
//        Male m1 = new Male();
//        m1.changeHandCount(1);
//        m1.showHumanHandCount();


//        ------------------------------------------------------------
        int i1 = 3;
        double d1 = i1; //upcasting
        int i2 = (int)d1;   //downcasting


        Integer int1 = 2;
        float f1 = int1.floatValue();
        String s2 = int1.toString();
        System.out.println(f1);
        System.out.println(s2);
        ArrayList<Integer> arlist1 = new ArrayList<Integer>();

        String s1 = "Hello";
        String s3 = s1 + " Hi";
        StringBuilder s4 = new StringBuilder("hello");
        s4.append(" Hi");

        //Switch, break, continue, ifelse, function overloading

//        ------------------------------------------------------------

        Male m1 = new Male();
        Male m2 = new Male();
        m1.changeHandCount(2);
        m1.showHumanHandCount();
        m1.changeHandCount(21);

      AbstractClass class1 = new AbstractClass() {
          @Override
          public void showHumanHandCount() {

          }
      };

        SingletonExample sg1 = SingletonExample.createSingleTonObject();
        SingletonExample sg2 = SingletonExample.createSingleTonObject();
        SingletonExample sg3 = SingletonExample.createSingleTonObject();

        System.out.println(sg1.s1);
        System.out.println(sg2.s1);
        System.out.println(sg3.s1);

        D d = new D();
//        d.showCount();

//        ------------------------------------------------------------
//        Human h1 = new Human();
        Male m11 = new Male();

        Human h11 = new Male();

        h11.showHumanHandCount();

        Interface1 int11 = new ImplementInterface();
        int11.getOne();

        int11 = new ImplementInterface2();
        int11.getOne();

        ImplementInterface int111 = new ImplementInterface();
        int11 = int111;
        int11.getOne();

        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);
        arrList1.remove(1);
        arrList1.get(1);

        int i;
        for(i =0; i< arrList1.size(); i++) {
            System.out.println(arrList1.get(i));
        }

        for(Integer eachArrayElement: arrList1) {
            System.out.println(eachArrayElement);
        }

        arrList1.forEach(eachElement -> {
            System.out.println(eachElement);
        });

        Iterator<Integer> iterate1 = arlist1.iterator();

        while(iterate1.hasNext()) {
            System.out.println(iterate1.next());
        }


        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.remove(1);
        linkedList1.get(1);


        Map<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("hi", "hello");
        hashMap1.put("hello", "hi");
        hashMap1.put("hi", "there");

        for(Map.Entry<String, String> eachMapElement: hashMap1.entrySet()) {
            System.out.println(eachMapElement.getKey());
            System.out.println(eachMapElement.getValue());
        }

        for(String keys: hashMap1.keySet()) {
            System.out.println(keys);
        }

        hashMap1.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        HashSet<String> hasSet = new HashSet<>();
        hasSet.add("hi");
        hasSet.add("hello");
        hasSet.add("hi");

//        System.out.println(hasSet);
//        int[] a1 = new int[2];
//        Male m122 = new Human();


//      -----------------------------------------------------------------

        // 1. What is the difference between Procedural programming and OOPS?
        //        2. Understanding the following terms
        //        Abstraction
        //        Encapsulation
        //        Polymorphism
        //        Inheritance
//        3. What are this and super keywords

        Human h1 = new Male();
        Human.showEyesCount();
        Human.showEyesCount();
//        4. does child class inherit base class private variables
//        5. Difference between interface and abstract class
//        7. What is Cohesion in OOP?
//        6. What are virtual functions in java
//        8. Is it possible to overload a constructor?
//        9. Can we prevent overriding a method without using the final modifier? => private/static methods
        // 10. Anything wrong with a sample class?

        PracticeClass1 practiceClass1 = new PracticeClass1(1, 4);
//        11. What are static blocks
        Human.eyes = 14;
        Human h2 = new Male();
//        h2.changeEyesCount();
        h2.changeHandCount(75);
        h2.showHumanHandCount();

        Human h3 = new Male();
//        h3.showEyesCount();
        h3.showHumanHandCount();
//        h2.showEyesCount();


//        12.Can we make constructors static?
//        13. Constructor chaining

        ConstructorChainingSuperClass claas12 = new ConstructorChainingSuperClass(14);
        claas12.getHandCount();

        // program to find duplicate element in a given array
        ArrayList<Integer> newArray = new ArrayList<>(Arrays.asList(1,3,3,4,5));
















    }
}



