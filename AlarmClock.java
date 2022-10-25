import java.util.Scanner;

class AlarmClock extends Clock{
    String AlarmHour;
    String AlarmMinute;
    public void setAlarm(String alarmHour, String alarmMinute){
        this.AlarmHour = alarmHour;
        this.AlarmMinute = alarmMinute;
    }
    public void getAlarm(){
        if(AlarmHour == getHours() && AlarmMinute == getMinutes())
            System.out.println("Weak Up!!!!!!!");
        else System.out.println("Keep Sleeping !!!");
    }

    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock();
        Scanner read = new Scanner(System.in);
        System.out.println("Please input Alarm hour : ");
        String AlarmHour = read.nextLine();
        System.out.println("Please input Alarm minute : ");
        String AlarmMinute = read.nextLine();
        alarmClock.setAlarm(AlarmHour,AlarmHour);
        alarmClock.getAlarm();
    }
}