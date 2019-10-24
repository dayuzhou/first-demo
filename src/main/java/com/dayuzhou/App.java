package com.dayuzhou;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        test();
    }

    private static void test() {
        int index = 0;
        do {
            Person person = new Person();
            person.setName("测试" + index);
            person.setAge(20 + index * 2);
            index++;
            System.out.println(person.toString());

        } while (index < 10);
    }
}
