package www.jagan.learning;

public class NonSyncMultithread extends Thread{

			public static void main(String[] args) {
				
				NonSyncMultithread firstThread = new NonSyncMultithread();
				NonSyncMultithread secondThread = new NonSyncMultithread();
				NonSyncMultithread thirdThread = new NonSyncMultithread();
				
				firstThread.setName("Hello");
				secondThread.setName("What's your name?");
				thirdThread.setName("How are you?");
				
				firstThread.start();
				secondThread.start();
				thirdThread.start();

			}
			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName() + " running, i = " + i);
				}
			

		

	}

}
