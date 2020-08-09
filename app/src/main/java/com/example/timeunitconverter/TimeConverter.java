package com.example.timeunitconverter;

public class TimeConverter {

    public static double sectTomilli(double sec){
        return sec*1000;
    }

    public static double milliTosec(double milli){
        return milli/1000;
    }

    public static double micTonano(double mic){
        return mic*1000;
    }
    public static double nanoTomic(double nano){
        return nano/1000;
    }
    public static double milliTomint(double milli){
        return milli*60000;
    }
    public static double mintTomilli(double mint){
        return mint/60000;
    }
    public static double secTomint(double sec){
        return sec/60;
    }
    public static double minTosec(double min){
        return min*60;
    }

    public static double dayTohour(double day){
        return day*24;
    }
    public static double dayTomonth(double day){
        return day/30;
    }

    public static double dayToyear(double day){
        return day/365;
    }
    public static double monthToday(double month){
        return month*30;
    }
    public static double monthTohour(double month){
        return month*730.0008;
    }
    public static double yearTohour(double year){
        return year*8760;
    }
    public static double yearToday(double year){
        return year*365;
    }
    public static double hourTosec(double hour){
        return hour*3600;
    }
    public static double secTohour(double sec){
        return sec/60;
    }
    public static double cenToyear(double cen){
        return cen*100;
    }
    public static double yearTocen(double year){
        return year/100;
    }
}
