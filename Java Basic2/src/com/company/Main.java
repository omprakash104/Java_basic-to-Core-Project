package com.company;

import company2.AbstractClass;
import company2.D;
import company2.Male;
import company2.SingletonExample;

import java.util.ArrayList;

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



    }
}



