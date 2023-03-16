package thread;

import java.awt.Toolkit;
// BeefPrintExam_Thread로 수정하고
// 익명이너클래스 활용하여 쓰레드 실행되도록 변경
public class BeefPrintExam_Thread {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		}).start();
	}
}
