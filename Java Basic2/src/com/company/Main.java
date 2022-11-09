package com.company;

import company2.*;
import company3.ExceptionClassSelf;
import company3.StaticClass;

import javax.sound.midi.SysexMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        h1 = new Female();
//        Human.showEyesCount();
//        Human.showEyesCount();
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




//        ------------------------------------------------------------


        StaticClass class11 = new StaticClass();

        StaticClass.showEyesCount();

        try {
            int a = 1/0;
        } catch(ArithmeticException arex) {
            System.out.println("exception handling done here");
        } finally {
            System.out.println("finally block always called");
        }

        try {
            FileInputStream fil1 = new FileInputStream("pathToFile");
        } catch (FileNotFoundException ex) {

        }


        try {
            int a = 1/0;
            Human h1412 = null;
            h1412.changeHandCount(1, 5);
            String a1234 = null;
            a1234 = a1234 + "Hello";
        } catch(ArithmeticException arex) {
            System.out.println("arthimatic exception handling done here. Please review mathematic operation");
        } catch(Exception arex) {
            System.out.println("exception handling done here. General other exception captured here.");
        } finally {
            System.out.println("finally block always called");
        }


        System.out.println("exception handling needs here");

//        resursiuve();
        try {
            countData();
        } catch (ExceptionClassSelf exzt) {
//            throw exzt;
            System.out.println("custom exception encountered");
        }catch(ArithmeticException | FileNotFoundException ex) {
            System.out.println("arthematic exception captured through throws clause" + ex.toString());
        }

        // final, finally, finalize
        ArrayList<Integer> newArray1 = new ArrayList<>(Arrays.asList(1,3,3,4,5));

        Map<Integer, Integer> newMap = new HashMap<>();

        for(Integer eachElement: newArray1) {
            if(newMap.containsKey(eachElement)) {
                System.out.println("duplicate element is " + eachElement);
            }
            else {
                newMap.put(eachElement, eachElement);
            }
        }

        Map<Integer, Integer> loopMap = new HashMap<>();

        for(Integer eachElement: newArray1) {
            if(loopMap.get(eachElement)!=null) {
                loopMap.put(eachElement, loopMap.get(eachElement) + 1);
            }
            else {
                loopMap.put(eachElement, 1);
            }
        }

        for(Map.Entry<Integer, Integer> eachMap: loopMap.entrySet()) {
            if(eachMap.getValue() > 1) {
                System.out.println("duplicate element is " + eachMap.getKey());
            }
        }

//        ------------------------------------------------------------

        // process vs thread
        // deadlock

//        ------------------------------------------------------------

        // consumer, predicate, supplier, function
        // consumer takes an argument and doesnt return anything
        Consumer<Integer> cons = (x) -> System.out.println(x);
        cons.accept(10);

        // takes an argument and returns a boolean
        Predicate<Integer> pred = (x1) -> x1 < 10;
        System.out.println(pred.test(8));
        System.out.println(pred.test(12));

        // takes an argument and returns a value
        Function<Integer, Double> fiuc1 = data -> data/2.0;
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        add.apply(1,2);
        System.out.println(fiuc1.apply(12));

        // doesnt take any argument but returns a value
        Supplier<Double> supp = () -> 2.0;
        System.out.println(supp.get());

        //1. What is Re-throwing an exception in Java?
//       2. class level lock vs object level lock
//       3. What is the start() and run() method of Thread class?
//       4. volatile variables in java
//       5. What is thread starvation?
//       6. can we start a thread twice
//       7. blocking queue
        BlockingQueue<String> bqueue = new ArrayBlockingQueue<>(5);
        // 8. producer consumer program in Java multithreading => google
        // 9. Optional Class in java
        // 10. sumToNumber problem
        ArrayList<Integer> newArraySumToNumber = new ArrayList<>(Arrays.asList(1,3,3,4,5));
//      6
//        O(n^2)
        for(int i11=0;i11 <newArraySumToNumber.size(); i11++) {
            for(int j=i+1; j < newArray.size(); j++ ) {
                if (newArraySumToNumber.get(i11) + newArraySumToNumber.get(j) == 6) {

                }
            }
        }

        ArrayList<Integer> newArraySumToNumberNew = new ArrayList<>(Arrays.asList(1,3,3,4,5));

//        0(n) => time
//        O(n) => space
        // loop through the array
        // check if the (sum - newElement) == present in hashmap
        // hashmap -> store each element in the hashmap from the array 1

//        1,3,3,4
//
//        (6-5) = 1



//       --------------------------------------------
        // Stream API
        // Intermediate Operations
        // map
        ArrayList<Integer> mapList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        for (i=0;i<mapList.size();i++) {
//            mapList.set(i,mapList.get(i) * mapList.get(i));
//        }
//        System.out.println(mapList.get(1));

        List<Integer> resultMap = mapList.stream().map(x->x *x).collect(Collectors.toList());
        System.out.println(resultMap);

        // filter
        ArrayList<String> filterList = new ArrayList<>(Arrays.asList("Hello", "Hi", "Stream"));
//        for (i=0;i<filterList.size();i++) {
//            if(filterList.get(i).startsWith("S")){
//                filterList.remove(i);
//            }
//        }
//        System.out.println(filterList.size());

        List resultFilter = filterList.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(resultFilter);

        //sorted
        ArrayList<String> sortedList = new ArrayList<>(Arrays.asList( "Stream", "Hello", "Hi"));
        List newSortedList = sortedList.stream().sorted().collect(Collectors.toList());
        System.out.println(newSortedList);

        // Terminal Operations

        //collect
        ArrayList<String> collectList = new ArrayList<>(Arrays.asList( "Stream", "Hello", "Hi"));
        List collectListExample = sortedList.stream().sorted().collect(Collectors.toList());
        System.out.println(collectListExample);

        // foreach
        ArrayList<String> forEachList = new ArrayList<>(Arrays.asList( "Stream", "Hello", "Hi"));
        forEachList.stream().filter(s -> s.startsWith("S")).forEach(s -> System.out.println(s));

        Person p1 = new Person("Shailesh", 18);
        Person p2 = new Person("Amit", 15);
        Person p3 = new Person("Raghav", 14);
        Person p4 = new Person("Ram", 13);
        Person p5 = new Person("Shailesh", 14);

        ArrayList<Person> personsList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

        // remove all person from personslist who have age greater than 14
//        personsList.removeIf(p -> p.getAge() >14);


        List<Person> removedAgeFilterPersonsList = personsList.stream().filter(eachPerson -> eachPerson.getAge() <=14).collect(Collectors.toList());
        removedAgeFilterPersonsList.forEach(eachElement -> System.out.println(eachElement.getName()));

        // sort personList based on name and if name is same then sort based on age
        ArrayList<Person> personsListSorting = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

        personsListSorting.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println(personsListSorting);
        personsListSorting.forEach(eachElement -> System.out.println(eachElement.getName() + "" + eachElement.getAge()));

//        ------------------------------------------------------

        // Comparator
        ArrayList<Person> personsListComparatorClass = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
//        Collections.sort(personsListComparatorClass, new PersonComparator());

        Collections.sort(personsListComparatorClass, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        personsListComparatorClass.forEach(p -> System.out.println("name: " + p.getName() + " age: " + p.getAge()));

        Collections.sort(personsList);

        // stream and convert all to caps and print the result
        List<String> nameList = new ArrayList<>(Arrays.asList("Shailesh","Ram"));
        nameList.stream().map(st -> st.toUpperCase()).forEach(nl -> System.out.println(nl));

        nameList.stream().map(String::toUpperCase).forEach(System.out::println);


        ArrayList<Person> personsListSortingComparableChain = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

//        personsListSortingComparableChain.sort(Comparator.comparing((Person p)-> p.getName()).thenComparing((Person p) -> p.getAge()));
        personsListSortingComparableChain.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        System.out.println(personsListSortingComparableChain);
        personsListSortingComparableChain.forEach(eachElement -> System.out.println(eachElement.getName() + "" + eachElement.getAge()));

        // peek
        nameList.stream().map(String::toLowerCase).peek(System.out::println).filter(p -> p.startsWith("r")).forEach(nl -> System.out.println("final value" + nl));

        // min age of person
        ArrayList<Person> minAgePersonsList = new ArrayList<>();
        Optional<Person> minAge = minAgePersonsList.stream().min(Comparator.comparing(Person::getAge));
        if (!minAge.isPresent()) {
            minAge.orElse(new Person());
        }
        else {
            System.out.println(minAge.get().getName());
        }

        // count number of people having age greater then a value
        ArrayList<Person> minAgePersonsListCount = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        long peopleCount = minAgePersonsListCount.stream().filter(p -> p.getAge() > 14).count();
        System.out.println(peopleCount);

        // findFirst, findAny
        ArrayList<Person> minAgePersonsListCountFindFirst = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        Optional<Person> personFindFirst = minAgePersonsListCountFindFirst.stream().filter(p -> p.getAge() == 14).findFirst();
        System.out.println(personFindFirst.get().getName());
        Optional<Person> personFindAny = minAgePersonsListCountFindFirst.stream().filter(p -> p.getAge() == 14).findAny();
        System.out.println(personFindAny.get().getName());

//        ------------------------------------------------------
        // i have a list of string. Convert that list of string to a single comma separated string using streams.
        List<String> singleString = new ArrayList<>(Arrays.asList("Desk", "Table", "Chair"));
        String concatenatedString = singleString.stream().map(sstring -> sstring.toLowerCase()).collect(Collectors.joining(","));
        System.out.println(concatenatedString);

        // groupBy
        List<Person> groupByPerson = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        Map<String, List<Person>> listPersonGroupBy = groupByPerson.stream().collect(Collectors.groupingBy(Person::getName));
        listPersonGroupBy.forEach((key, value) -> {
            System.out.println("person name: " + key);
            value.forEach(eachAge -> {
                System.out.println("eachAges of people present: " + eachAge.getAge());
            });
        });

        // groupBy and then average the ages
        List<Person> groupByAndAverage = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
//        Collectors.minBy()
        Map<String, Double> averageAgesOfPeople = groupByAndAverage.stream().collect(Collectors.groupingBy(Person::getName, Collectors.averagingInt(Person::getAge)));
        averageAgesOfPeople.forEach((key, value) -> {
            System.out.println("person name: " + key + " person age " + value);
        });

        // group by and then summing all the grouped ages
        List<Person> groupByAndSumm = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        Map<String, Integer> sumAgesOfPeople = groupByAndSumm.stream().collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));
        sumAgesOfPeople.forEach((key, value) -> {
            System.out.println("person name: " + key + " person age " + value);
        });

        // flatmap
        List<String> countries = Stream.of(Arrays.asList("a1", "a2"), Arrays.asList("a3", "a4")).flatMap(List::stream).collect(Collectors.toList());
        countries.forEach((key) -> {
            System.out.println("list value name: " + key);
        });

//        ------------------------------------------------------

        // parallelstream
        List<Person> parallelStreamList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        parallelStreamList.parallelStream().forEach(ps -> System.out.println(ps.getName()));

        // i have 2 arrays, i want to find if one array is overlapping the other array
//      a1[] = {11, 1, 13, 21, 3, 7}

//      a2[] = {11, 3, 7, 1}

        List<Integer> a1 = new ArrayList<>(Arrays.asList(11,1,11,21,3,7, 3));
        List<Integer> a2 = new ArrayList<>(Arrays.asList(11,3,7,166));
        // isOverlapping = true
        // loop through a2 array
        // subloop loop through a1 array
        // if element in a2 is not found in any element in a1 until we reach the end of index in a1, then make isOveralapping as false.Then Break;
//        o(n^2)
        for(int t1 =0; t1 < a2.size();t1++) {
            for(int t2=0; t2< a1.size();t2++) {

            }
        }


        // HashMap
        // loop through a1, put all elements on a1 in a hashmap as (key, value)
        // loop through a2 if a2 element not found in hashmap, isOverlapping is false. Then break;
//        O(n)
        Map<Integer, Integer> hashMap = new HashMap<>();
        Boolean isOverlapping = true;
        for(int t1 =0; t1 < a1.size();t1++) {
            hashMap.put(a1.get(t1), a1.get(t1));
        }

        for(int t2 =0; t2 < a2.size();t2++) {
            if(!hashMap.containsKey(a2.get(t2))) {
                isOverlapping = false;
                break;
            }
        }
        System.out.println(isOverlapping);

//      first repeating element in the list of elements in an array
//      arr[] = {1, 5, 3, 4, 3, 5, 6}
//        o(n) * o(n-1)
        Map<Integer, Integer> hashMapFirstRepeating = new HashMap<>();
        for(int t1 =0; t1 < a1.size();t1++) {
            if (hashMapFirstRepeating.containsKey(a1.get(t1))) {
                System.out.println("first repeating element is: " + a1.get(t1));
                break;
            }
            hashMapFirstRepeating.put(a1.get(t1), a1.get(t1));
        }
//      O(n), o(n)

        // collect array with just distinct elements from the below array
        ArrayList<Integer> arr12 = new ArrayList<>(Arrays.asList(1,3,5,3,2,4,5));
        List<Integer> finalDistinctList = arr12.stream().distinct().collect(Collectors.toList());
//        finalDistinctList.forEach(System.out::println);

        // collect top 3 elements only from this list
        ArrayList<Integer> arr122 = new ArrayList<>(Arrays.asList(1,5,3,2,4));
//        output => 5,4,3
        List<Integer> finalTrimmedList = arr122.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        finalTrimmedList.forEach(System.out::println);

        // group person with the same name as map "key" and a single object as "value" containing the least age from the group.
        List<Person> personsListNew = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        Map<String, Optional<Person>> finalListNew = personsListNew.stream().collect(Collectors.groupingBy(Person::getName, Collectors.minBy(Comparator.comparing(Person::getAge))));
        finalListNew.forEach((key, value) -> {
            System.out.println("person name: " + key);
            System.out.println(value.get().getAge());
        });
    }

    public static void resursiuve() {
        resursiuve();
    }

    public static void countData() throws ArithmeticException, FileNotFoundException, ExceptionClassSelf {
        int aa = 1/1;
//        FileInputStream fil1 = new FileInputStream("pathToFile");
        throw new ExceptionClassSelf("custom exveption thrown");
    }








}


class Person implements Comparable<Person>{
    int age;
    String name;

    public Person() {

    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.getAge();
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}



