package KKK;

public class Tire {
	public void run() {
		System.out.println("일반타이어가 굴러갑니다.");
	}
	
public class SnowTire extends Tire{
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}

public class SnowTireExample {
	public void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run();
		tire.run();
}


	}

}
