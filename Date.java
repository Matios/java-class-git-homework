import java.time.*;

public class Date{
public static void main(String[] args){

LocalTime t = LocalTime.now();
LocalDate d = LocalDate.now();
LocalDateTime dt = LocalDateTime.now();
//LocalTime m= LocalTime.of();
LocalDate yd= LocalDate.of(2018,1,26);
LocalDateTime dtof= LocalDateTime.of(2018,1,23,23,54,59);
LocalDateTime l2 = LocalDateTime.of(2018,1,27,12,00);
//LocalDate first =LocalDate.of(2018,Month.January,27);
//LocalDate last = LocalDate.of(2018,Month.Januwary,31);
    LocalDate nextYear = d.plusYears(1);
    //LocalTime nextHours = d.min(1);

System.out.println(d);
//System.out.println(nextHours);
//System.out.println(dt);
//System.out.println(l2);
  //  System.out.println(dtof);

}
}