import java.time.*;

public class Days{

	public static void main(String [] args) {

		LocalDate startDate= LocalDate.of(2018, 12, 10);
		LocalDate endDate = LocalDate.of(2028, 12, 10);

		System.out.println("My next 10 birthdays:");

		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusYears(1)) {

			System.out.println(date.getYear()+": "+ date.getDayOfWeek());
		}
	}
}