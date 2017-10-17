package co.challenges.hakerrank.thirtydaysofcode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String returnedString = scanner.nextLine();
		String expectedString = scanner.nextLine();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d M y");
		LocalDate expectedDate = LocalDate.parse(expectedString, dateTimeFormatter);
        LocalDate returnedDate = LocalDate.parse(returnedString, dateTimeFormatter);

		long fine = 0;
		if (returnedDate.isAfter(expectedDate)) {
			if (expectedDate.getYear() == returnedDate.getYear()) {
				if (expectedDate.getMonth() == returnedDate.getMonth()) {
					long difference = ChronoUnit.DAYS.between(expectedDate, returnedDate);
					fine = 15 * difference;
				} else {
					long difference = ChronoUnit.MONTHS.between(expectedDate, returnedDate);
					fine = 500 * difference;
				}
			} else {
				fine = 10000;
			}
		}
		System.out.println(fine);
		scanner.close();

	}
}