package MultithreadingClasses;

public class threadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Thread t1=new Thread1("thread 1 ");
//		t1.setDaemon(true);//might not allow to run all thread 
		t1.start();
		System.out.println("main end");
		
		
		//order will mixed up & decided by cpu
		System.out.println("main using Runnable start");
		Thread t2=new Thread(new Thread2(),"thread 2 ");
		t2.start();
		System.out.println("main using Runnable end");
		
		
		System.out.println("main using Runnable interface by implementing using lamda start");
		Thread t3=new Thread(()->{
			for(int i=0;i<5;i++)
				System.out.println(Thread.currentThread()+" , "+i);
		},"thread 3 ");
		t3.start();
		System.out.println("main using Runnable end");
		
	}

}
