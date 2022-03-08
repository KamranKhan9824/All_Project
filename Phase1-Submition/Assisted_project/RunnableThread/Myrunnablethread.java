package Assistepractise;

public class Myrunnablethread implements Runnable{
		public static int myCount = 0;
	    public Myrunnablethread(){
	         
	    }
	    public void run() {
	        while(Myrunnablethread.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++Myrunnablethread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	    	System.out.println("Starting Main Thread...");
	        Myrunnablethread mrt = new Myrunnablethread();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(Myrunnablethread.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++Myrunnablethread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }


		

	

}
