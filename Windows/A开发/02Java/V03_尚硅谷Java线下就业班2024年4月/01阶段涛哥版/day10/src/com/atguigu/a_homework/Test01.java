package com.atguigu.a_homework;

public class Test01 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();

        noteBook.start();

        Mouse mouse = new Mouse();
        noteBook.useUSB(mouse);

        System.out.println("==================");

        KeyBoard keyBoard = new KeyBoard();
        noteBook.useUSB(keyBoard);

        noteBook.stop();
    }
}
