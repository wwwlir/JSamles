package Threads;

public class testFor {
	public static void tFor(){//Цикл заглушка
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().toString()+" Iterator: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
