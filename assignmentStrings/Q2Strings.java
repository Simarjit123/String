package assignmentStrings;

public class Q2Strings {
	public static void main(String[] args) {

//part a.
		String address = "100 queen street,Toronto,M5V 3E3 ";
		String streetAddress = address.substring(address.indexOf("1"), address.indexOf("T"));
		System.out.println("address is :" + streetAddress);

		// part b.
		String cityName = address.substring(address.indexOf("T"), address.indexOf("M"));
		System.out.println("City name is: " + cityName);

		// partc.
		String postalCode = address.substring(address.indexOf("M"), address.indexOf("3"));
		System.out.println("postal code is : " + postalCode);

	}
}
