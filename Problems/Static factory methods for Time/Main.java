import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here
        Time noon = new Time();
        noon.hour = 12;
        noon.minute = 0;
        noon.second = 0;
        return noon;
    }

    public static Time midnight() {
        // write your code here
        Time midnight = new Time();
        midnight.hour = 0;
        midnight.minute = 0;
        midnight.second = 0;
        return midnight;
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
        Time timeOfSeconds = new Time();
        timeOfSeconds.hour = (int) (seconds % 86_400) / 3600;
        timeOfSeconds.minute = (int) (seconds % 3600) / 60;
        timeOfSeconds.second = (int) seconds % 60;
        return timeOfSeconds;
    }

    public static Time of(int hour, int minute, int second) {
        // write your code here
        boolean checkHour = hour < 0 || hour > 23;
        boolean checkMinute = minute < 0 || minute > 59;
        boolean checkSecond = second < 0 || second > 59;
        
        if (checkHour || checkMinute || checkSecond) {
            return null;
        } else {
            Time timeOf = new Time();
            timeOf.hour = hour;
            timeOf.minute = minute;
            timeOf.second = second;
            return timeOf;
        }

    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}
