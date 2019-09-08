package task;

import java.awt.EventQueue;

public class task {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("界面运行失败");
				}
			}
		});
	}
}
