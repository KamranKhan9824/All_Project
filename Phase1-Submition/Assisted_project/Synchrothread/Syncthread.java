package Assistepractise;


class TableofNum {
    synchronized void printTable(int n) 
    {   
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    TableofNum tn;
    MyThread1(TableofNum tn) {
        this.tn = tn;
    }
    public void run() {
        tn.printTable(5);
    }

}
class MyThread2 extends Thread {
    TableofNum tn;
    MyThread2(TableofNum tn) {
        this.tn = tn;
    }
    public void run() {
        tn.printTable(100);
    }
}

public class Syncthread {

	public static void main(String[] args) {
		TableofNum obj = new TableofNum();   
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();

	}

}
