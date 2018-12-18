package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediatorDemo {
	
	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Mediator m = new Mediator();
		threads.add(new Thread(new Producer(m)));
		threads.add(new Thread(new Producer(m)));
		threads.add(new Thread(new Consumer(m)));
		threads.add(new Thread(new Consumer(m)));
		threads.add(new Thread(new Consumer(m)));
		threads.add(new Thread(new Consumer(m)));
		
		for(Thread t : threads) {
			t.start();
		}
		
		boolean stop = false;
		String end = scanner.nextLine();
		
		while(!stop) {
			if(end.equals("")) {
				stop = true;
				for(Thread t : threads) {
					t.stop();
				}
			}
		}
	}

}
