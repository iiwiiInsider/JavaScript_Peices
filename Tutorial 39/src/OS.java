
public class OS {

	private String id;

	private class Compatibility {
		public void appstore() {
			System.out.println("OS " + id + " has a compatible app store to download android and IOS apps.");
		}
	}

	public static class Device {
		public void battery() {
			System.out.println("Device battery lasts est. 36 hours before needing a recharge.");
		}
	}

	public OS(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void start() {
		System.out.println("Starting Operating System: " + id + ".");

		Compatibility compatibility = new Compatibility();
		compatibility.appstore();
	}
}
