package com.company;

       public class Main {

            public static void main(String[] args) {
                new Thread(()->{
                    for (int i =0; i< 10; i++) {
                        System.out.println("a");
                        try{
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }).start();
                //thread 1

                //thread2
                for (int i =0; i< 10; i++) {
                    System.out.println("b");
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }