public class Clock {
    public String getHours() {
        String hours = java.time.LocalTime.now().toString().substring(0,2);
        return hours;
    }
    public String getMinutes() {
        String min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }
    public String getTime() {
        String time = getHours() + ":" + getMinutes();
        return time;
    }
}
class WorldClock extends Clock {
    int timeZone = 0;
    public WorldClock(int timeZone) {
        super();
        this.timeZone = timeZone;
    }
    public String getHours() {
        String hours = String.valueOf(Integer.parseInt(super.getHours()) + 3);
        return hours;
    }
    public String getTime() {
        String time = getHours() + ":" + super.getMinutes();
        return time;
    }
}
class Test {
    public static void main(final String[] args) {
        Clock myClock = new Clock();
        System.out.println("My Time: " + myClock.getTime());
        WorldClock worldClock = new WorldClock(3);
        System.out.println("My Time + 3: " + worldClock.getTime());
    }
}