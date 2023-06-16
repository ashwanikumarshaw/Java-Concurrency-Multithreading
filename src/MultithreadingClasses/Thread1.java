package MultithreadingClasses;

public class Thread1 extends Thread {
	
	public Thread1(String name) {
		super(name);//set the name of thread 
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++)
			System.out.println(Thread.currentThread()+" running " + i);//Thread[threadName ThreadPriority ,ThreadParent]
	}

}
