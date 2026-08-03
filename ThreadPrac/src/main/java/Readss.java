import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Readss {
	int count;
	public static void main(String[] args) {
//		Counter c = new Counter();
		Readss obj = new Readss();
		Thread t1= new Thread (()-> {
			for(int i=0;i<=1000;i++) {
				obj.count(i);
			}
		});
		Thread t2= new Thread (()-> {
			for(int i=0;i<=1000;i++) {
				obj.count(i);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.count);
	}
	
	void count(int i){
     count++;
	}
}
