import java.util.Random;

public class RandomNumber {
	
	public static void random()
	{
		Random ram = new Random();
		String OTP = String.format("%04d", ram.nextInt(10000));
		System.out.println(OTP);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           RandomNumber.random();
	}

}
