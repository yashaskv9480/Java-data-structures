package Enums_Java;

public class Enum_Demo {
    public static void main(String[] args) {
        enum Week{
            Monday,Tuesday,Wednesday;
        }
        for(Week week: Week.values()){
            System.out.println(week);
        }
        }
}
