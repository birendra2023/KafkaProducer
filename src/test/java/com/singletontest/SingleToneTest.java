package com.singletontest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleToneTest {
    @Test
    public void testSingletonInstance() throws InterruptedException {
//        // Create multiple threads to access the singleton instance concurrently
//        Thread thread1 = new Thread(() -> {
//            SingleTone instance1 = SingleTone.getInstances();
//            try {
//                Thread.sleep(100); // Simulate some work in the thread
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            SingleTone instance2 = SingleTone.getInstances();
//
//            // Assert that both instances obtained in the same thread are the same
//            assertEquals(instance1, instance2);
//        });
//
//        Thread thread2 = new Thread(() -> {
//            SingleTone instance3 = SingleTone.getInstances();
//            try {
//                Thread.sleep(100); // Simulate some work in the thread
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            SingleTone instance4 = SingleTone.getInstances();
//
//            // Assert that both instances obtained in the same thread are the same
//            assertEquals(instance3, instance4);
//        });
//
//        // Start the threads
//        thread1.start();
//        thread2.start();
//
//        // Wait for threads to finish
//        thread1.join();
//        thread2.join();
        SingleTone instance1 = SingleTone.getInstances();
        SingleTone instance2 = SingleTone.getInstances();
        SingleTone instance3 = SingleTone.getInstances();
        SingleTone instance4 = SingleTone.getInstances();
        assertEquals(instance1,instance2);



    }

    public static void main(String[] args) {
        // Run the JUnit test
        //("SingletonTest");
    }
}