
public class Time {
    private int hour;
    private int minute;
    private int second;
    private boolean valid;
    public Time(int hour, int minute, int second){
        if(hour > 23 || hour < 0 || minute > 59 || second > 59 || minute < 0 || second < 0){
            System.out.println("Invalid time");
            valid = false;
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            valid = true;
        }
    }
    public String toUniversal(){
        String result = "";
        if(!valid){
            return "";
        }
        else{
            if(hour < 10){
                result += "0" + hour + ":";
            }else{
                result += hour + ":";
            }
            if(minute < 10){
                result += "0" + minute + ":";
            }else{
                result += minute + ":";
            }
            if(second < 10){
                result += "0" + second;
            }else{
                result += second;
            }
            return result;
        }
    }
    public String toStandard(){
        String result = "";
        if(!valid) return "";
        if (hour < 12) {
            result = toUniversal();
            result += " AM";
        }
        else {
            int h = hour;
            h -= 12;
            if (h < 10) {
                result += "0" + h + ":";
            } else {
                result += h + ":";
            }
            if (minute < 10) {
                result += "0" + minute + ":";
            } else {
                result += minute + ":";
            }
            if (second < 10) {
                result += "0" + second;
            } else {
                result += second;
            }
            result += " PM";
        }
        return result;

    }
    public void add(Time t){
        if (!valid || !t.valid){
            return;
        }
        int newHour = this.hour + t.hour;
        int newMinute = this.minute + t.minute;
        int newSecond = this.second + t.second;
        if(newSecond >= 60){
            newSecond = newSecond - 60;
            newMinute++;
        }
        if(newMinute >= 60){
            newMinute = newMinute - 60;
            newHour++;
        }
        if(newHour > 23){
            newHour -=24;
        }
        this.hour = newHour;
        this.minute = newMinute;
        this.second = newSecond;
    }
}
