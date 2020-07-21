package com.liao.spike;

public class MyTask implements Runnable {

    private static Integer id = 10;

    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        /*System.out.println(name + "----->" + Thread.currentThread().getName());*/
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (MyTask.class){
            if (id > 0){
                System.out.println(name + "----->" + id);
                id--;
            }else {
                System.out.println(name + "----->" + id+"--失败");
            }
        }
    }
}