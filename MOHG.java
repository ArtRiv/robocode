package MOHG;
import robocode.*;
import java.awt.Color;

public class MOHG extends Robot
{
	public void run() {

		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}


	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
