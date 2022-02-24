package assignmentStrings;

import java.util.Scanner;

public class Q1String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Part 1 : Creating array
		String[] cityList = { "Guelph", "Toronto", "Brampton", "Cambridge", "kitchener" };

		// Part 2 :Find city name
		System.out.println("Enter the city name that you want to find");
		String findCity = sc.next();
		boolean isfound = false;
		for (int i = 0; i < cityList.length; i++) {
			if (cityList[i].equalsIgnoreCase(findCity)) {
				isfound = true;
				break;
			}
		}
		if (isfound) {
			System.out.println("city found in list is:" + findCity);

		} else {
			System.out.println("city not found in the list");
		}

		// Part3:Replace City name

		System.out.println("City name starting with T is replaced to Mississauga");
		for (int i = 0; i < cityList.length; i++) {
			if (cityList[i].startsWith("T")) {
				cityList[i] = "Mississauga";

			}
		}

	}
}
