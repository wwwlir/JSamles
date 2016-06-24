package Threads;

public class implRunnable implements Runnable {
	private String name;
	public Thread t;
	
	public implRunnable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		while (!Thread.currentThread().isInterrupted()) {//Работает в цикле пока не будет выставлен флаг завершения потока
//			System.out.println(Thread.currentThread().toString()+" ok");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				System.out.println("Exception interrupt!");
//				Thread.currentThread().interrupt();//Если во время выставления флага завершения поток находился в ожидании
//													//сработает исключение, и нужно выставить флаг повторно
//			}
//			Thread.currentThread().interrupt();
//		}
		testFor.tFor();
		//Обработка выхода
		System.out.println("Exiting");
	}

}
