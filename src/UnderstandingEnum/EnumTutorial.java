package UnderstandingEnum;

import java.sql.SQLOutput;

public class EnumTutorial {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        DaysOfTheWeek day2 = DaysOfTheWeek.FRIDAY;

        if (day == DaysOfTheWeek.THURSDAY){
            System.out.println("it is almost friday!");
        }
//        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
//            System.out.println(myDay);
//        }
        System.out.println(day2);
    }
}
