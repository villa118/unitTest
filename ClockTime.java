/**
 * Name:  C.R.
 * Course:  CSCI-241 - Computer Science I
 * Section: 002
 * Assignment: 9
 * 
 * Project/Class Description
 * This class consists of constructors, getters, seters, and varios methods 
 * that are made to preform specific tasks in order to simplify the 
 * "TestClockTime"
 * 
 * Known Bugs:  none
 */
public class ClockTime
{
    private int hour; //hour holds the ClockTime hour setting
    private int minute; //minute holds the ClockTime minute setting
    private int second; //second holds the ClockTime second setting

    public ClockTime() {
        hour=0; //sets hour to 0 as default
        minute=0;//sets minute to 0 as default
        second=0;//sets second to 0 as default
    }

    public ClockTime(int hr, int min, int sec){
        hour = hr; //changes hour to new number from parameter
        minute = min;//changes minute to new number from parameter
        second = sec;//changes second to new number from parameter
        if(second > 59){//checks if second is 60 or more than increments minute
            while (second> 59){
                second = second-60;
                minute++;
            }
        }
        if(second<0){
            second=0;
        }

        if(minute > 59){//checks if minute is 60 or more than increments hour
            while (minute> 59){
                minute = minute-60;
                hour++;
            }
        }
        if(minute<0){
            minute=0;
        }

        if(hour>24){//checks if hour is greater than 24 & resets by modulus 24
            hour = hour%24;
        }
        if(hour<0){
            hour=0;
        }
    }

    public int getHour(){//gets the current value of hour
        return hour;
    }

    public void setHour(int newHour){//sets hour to new time from parameter
        hour = newHour;
    }

    public int getMinute(){//gets the current value of minute
        return minute;
    }

    public void setMinute(int newMinute){//sets minute to new time from parameter
        minute = newMinute;
    }

    public int getSecond(){//gets the current value of second
        return second;
    }

    public void setSecond(int newSecond){//sets second to new time from parameter
        second = newSecond;
    }

    public String toString(){//returns time in hour:minute:second format
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString12(){//returns time in hour:minute:second format for 12 hour clock
        if(hour>=12){//checks for P.M. time
            return String.format("%02d:%02d:%02d P.M.", hour-12, minute, second);
        }
        return String.format("%02d:%02d:%02d A.M.", hour, minute, second); 
    }

    public void advance(int adv){//moves the time forward in seconds
        second= second + adv;
        //checks if seconds, minutes, and hours need to be incremented
        if(second > 59){
            while (second> 59){
                second = second-60;
                minute++;
            }
        }
        if(second<0){
            second=0;
        }

        if(minute > 59){
            while (minute> 59){
                minute = minute-60;
                hour++;
            }
        }
        if(minute<0){
            minute=0;
        }

        if(hour>24){
            hour = hour%24;
        }
        if(hour<0){
            hour=0;
        }
    }

    public boolean equals(ClockTime a){//checks if clock1 equals clock2

        return (this.hour==a.getHour() && this.minute==a.getMinute() && this.second==a.getSecond());

    }
}
