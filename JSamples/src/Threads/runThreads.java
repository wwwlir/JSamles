package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class runThreads {

	public static void run1() {
		// TODO ������ ��������� ����� ���������� �����
		implRunnable t = new implRunnable("t1");
		testFor.tFor();
		t.t.interrupt();//�������������� ���� ���������� ������, ����������� � ������ � ���� ������
		
		try {
			t.t.join();//���� ��������� �����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ ���������");
	}
	public static void run2(){
		// TODO ������ ���� ������
		int cores = Runtime.getRuntime().availableProcessors(); //�������� ���������� ���� ����������. ����������
		System.out.println("Processor cores = "+cores);
		ExecutorService service = Executors.newFixedThreadPool(2);//���������� ������ � ����. �����(cores ��� �������)
		for (int i = 0; i < 4; i++) {
			service.submit(new implRunnable("Thread "+i));//��� ���������� ������� � ���� ���� ����� ������������ ����� ��� ������� ����� ������
		}
	}

}
