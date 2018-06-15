import java.util.Random;

import org.junit.Test;

public class RandomNumber1 {
	public static void random()
	{
		Random ram = new Random();
		String OTP = String.format("%04d", ram.nextInt(10000));
		System.out.println(OTP);
	}



}
