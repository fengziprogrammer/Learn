package com.atguigu.b_interface;

public class Test01 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 100);
        students[1] = new Student("李四", 60);
        students[2] = new Student("王五", 80);

        for (int j = 0; j < students.length-1; j++) {
            for (int i = 0; i < students.length-1-j; i++) {
                if (students[i].compareTo(students[i+1])>0){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }

        /*for (int j = 0; j < students.length-1; j++) {
            for (int i = 0; i < students.length-1-j; i++) {
                if (students[i].getScore()>students[i+1].getScore()){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }*/

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
