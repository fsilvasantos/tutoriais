package javaadvanced._07_multithreading;

class Chat {

    boolean flag = false;
 
    public synchronized void Question(String msg) {

       if (flag) {
          try {
             wait();
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }

       System.out.println("Q: " + msg);
       //System.out.println(msg);
       flag = true;
       notify();
    }
 
    public synchronized void Answer(String msg) {

       if (!flag) {
          try {
             wait();
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }
 
       System.out.println("A: " + msg);
       //System.out.println(msg);
       flag = false;
       notify();
    }
 }
 
 class T1 implements Runnable {

    Chat m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };
 
    public T1(Chat m1) {
       this.m = m1;
       new Thread(this, "Question").start();
    }
 
    public void run() {
       
       try {
            for (int i = 0; i < s1.length; i++) {
                Thread.sleep(1000);
                m.Question(s1[i]);                      
            }        
       } catch (InterruptedException e) {
            System.out.println("Thread Question interrompida!");
       }

       /*
       for (int i = 0; i < s1.length; i++) {
        m.Question(s1[i]);                
       }
       */
    }
 }
 
 class T2 implements Runnable {
    Chat m;
    String[] s2 = { "Hi", "I am good, what about you?", "Great!" };
 
    public T2(Chat m2) {
       this.m = m2;
       new Thread(this, "Answer").start();
    }
 
    public void run() {

        try {
            for (int i = 0; i < s2.length; i++) {
                Thread.sleep(1000);
                m.Answer(s2[i]);                
            }        
       } catch (InterruptedException e) {
            System.out.println("Thread Answer interrompida!");
       }

       /*
       for (int i = 0; i < s2.length; i++) {
          m.Answer(s2[i]);
       }
       */
    }
 }

 public class TestThread {
    public static void main(String[] args) {

       Chat m = new Chat();
       
       new T1(m);
       new T2(m);

    }
 }
