package org.example;

class MyRunnable implements Runnable {
    @Override
    public void run() {

    }

    MyRunnable r = new MyRunnable();	//Инстанциирование потока
    Thread t = new Thread(r.toString());
}

