package sec02.exam03;

public class Car {

	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	

	TireLoc run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return TireLoc.FrontLeftTire; };
		if(frontRightTire.roll()==false) { stop(); return TireLoc.FrontRightTire; };
		if(backLeftTire.roll()==false) { stop(); return TireLoc.BackLeftTire; };
		if(backRightTire.roll()==false) { stop(); return TireLoc.BackRightTire; };
		return TireLoc.NoProblem;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
