package com.atguigu.b_interface;

public class Test02 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("张三",40);
        people[1] = new Person("李四",30);
        people[2] = new Person("王五",70);

        PersonComparator pc = new PersonComparator();

        for (int j = 0; j < people.length-1; j++) {
            for (int i = 0; i < people.length-1-j; i++) {
                if (pc.compare(people[i],people[i+1])>0){
                    Person temp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
