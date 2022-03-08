package Assistepractise;

class NewTable {
    void printTable(int n) { //method not synchronized  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class NewMyThread1 extends Thread {
	NewTable tn;
    NewMyThread1(NewTable tn) {
        this.tn = tn;
    }
    public void run() {
        tn.printTable(5);
    }

}
class NewMyThread2 extends Thread {
	NewTable tn;
    NewMyThread2(NewTable tn) {
        this.tn = tn;
    }
    public void run() {
        tn.printTable(100);
    }
}

public class WithoutSync {

	public static void main(String[] args) {
		NewTable obj = new NewTable();  
        NewMyThread1 t1 = new NewMyThread1(obj);
        NewMyThread2 t2 = new NewMyThread2(obj);
        t1.start();
        t2.start();

	}

}
