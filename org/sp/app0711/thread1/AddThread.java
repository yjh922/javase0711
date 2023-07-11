package org.sp.app0711.thread1;

//숫자 증가용 쓰레드
public class AddThread extends Thread{
	//개발자는 독립수행하고 싶은 코드가 있을 때 반드시 run메서드에 코드를 작성해야 한다.
	//jvm이 호출하는 메서드이기 때문에..
	int n;
	ThreadTest tt;//라벨을 보유하고 있는 객체
	
	public AddThread(ThreadTest tt) {
		this.tt=tt;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("증가쓰레드 run() 호출");
			
			n++;
			//첫번째 라벨에 n을 출력
			tt.la1.setText(Integer.toString(n));
			
		}
	}
}
