public class ThreadJoin {
	static Thread importantThread=new Thread(new Runnable(){
		public void run(){
//do something
			System.out.println("importantThread Thread   printed");
	}});
	
    static  Thread currentThread = new Thread(
          new Runnable() {
              public void run () {
//do something
            	  System.out.println("currentThread Thread  printed");
            }
       });
    
    public static void main(String[] args) {
    	importantThread.start(); // Line 1
    	try {
			importantThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Line 2
    	currentThread.start(); // Line 3
    }
   
}
