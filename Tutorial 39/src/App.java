public class App {

	public static void main(String[] args) {

		OS os = new OS("Merge");
		os.start();

		// Would only work if public:

		// OS.Compatibility compatibility = os.new Compatibility();
		// compatibility.appstore();

		OS.Device device = new OS.Device();
		device.battery();

		final String deviceName = "Portacombine Pro AKA PCB Pro";

		class Merge {
			public void custom() {
				System.out.println("OS defined and identified as: " + os.getId());
				System.out.println("Device Name is " + deviceName);
			}
		}

		new Merge().custom();
	}
}
