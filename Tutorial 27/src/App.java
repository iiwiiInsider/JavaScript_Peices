
public class App {

	public static void main(String[] args) {

		byte byteValue = 20;

		short shortvalue = 55;

		int intvalue = shortvalue;

		long longvalue = 23355;

		float floatvalue = 8834.3f;

		double doubleValue = 32.4;

		System.out.println(Byte.MAX_VALUE);

		intvalue = (int) longvalue;

		System.out.println(intvalue);

		doubleValue = intvalue;
		System.out.println(doubleValue);

		intvalue = (int) floatvalue;
		System.out.println(intvalue);

		// this will not output as expected, because the value of byte is too big!
		// Reason: 128 is too big for a byte.
		byteValue = (byte) 128;
		System.out.println(byteValue);

	}
}
