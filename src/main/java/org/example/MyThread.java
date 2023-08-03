package org.example;

public class MyThread extends Thread {
    @Override
    public void run() { }
    MyThread t = new MyThread();	//Инстанциирование потока

    public MyThread getT() {
        return t;
    }
    //Запуск потока
}
