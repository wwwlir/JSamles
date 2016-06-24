package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class runThreads {

	public static void run1() {
		// TODO Пример установки флага завершения птока
		implRunnable t = new implRunnable("t1");
		testFor.tFor();
		t.t.interrupt();//Выстанавливает флаг завершения потока, проверяется в ручную в теле потока
		
		try {
			t.t.join();//Ждем звершения птока
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Потоки завершены");
	}
	public static void run2(){
		// TODO Пример пула птоков
		int cores = Runtime.getRuntime().availableProcessors(); //Получаем количество ядер процессора. пционально
		System.out.println("Processor cores = "+cores);
		ExecutorService service = Executors.newFixedThreadPool(2);//Количество птоков в пуле. Любое(cores для примера)
		for (int i = 0; i < 4; i++) {
			service.submit(new implRunnable("Thread "+i));//При превышении потоков в пуле ждет когда освободиться место для запуска новго потока
		}
	}

}
