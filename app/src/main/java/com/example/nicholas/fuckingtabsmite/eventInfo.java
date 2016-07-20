package com.example.nicholas.fuckingtabsmite;

import java.sql.ClientInfoStatus;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Nicholas on 7/15/2016.
 */
public class eventInfo {

    private String eventTitle;
    private int turnPlayers;
    private int totalPlayers;
    private GregorianCalendar time_date;

    public eventInfo (String eventTitle, int totalPlayers, int turnPlayers, GregorianCalendar time_date){
        this.eventTitle = eventTitle;
        this.totalPlayers = totalPlayers;
        this.turnPlayers = turnPlayers;
        this.time_date = time_date;
    }

    public String getEventTitle(){
        return eventTitle;
    }

    public String getTurnUps(){
        return turnPlayers+"/"+totalPlayers;
    }

    public String getDate(){
        return time_date.get(GregorianCalendar.DATE)+"/"+time_date.get(GregorianCalendar.MONTH)+"/"+time_date.get(GregorianCalendar.YEAR);
    }

    public String getTime(){
        return time_date.get(GregorianCalendar.HOUR_OF_DAY)+":"+time_date.get(GregorianCalendar.MINUTE);
    }
}
