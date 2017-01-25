package threads;

public class Teste {
	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		
		Thread t2 = new Thread(p2);
		t2.start();
		
		//Usando classe anônima
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {
					System.out.println("Programa 3 "+ i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	
		
		
	}
}
