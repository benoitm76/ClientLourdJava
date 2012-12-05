/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Benoît
 */
public class Utils {
    static public int computeAge(Date birthday, Date today) {
        Calendar cBirthday = new GregorianCalendar();
        Calendar cToday = new GregorianCalendar();
        cBirthday.setTime(birthday);
        cToday.setTime(today);

        int yearDiff = cToday.get(Calendar.YEAR) - cBirthday.get(Calendar.YEAR);
        cBirthday.set(Calendar.YEAR, cToday.get(Calendar.YEAR));
        if (!cBirthday.after(cToday)) {
            return yearDiff; //Birthday already celebrated this year 
        } else {
            return Math.max(0, yearDiff - 1); //Need a max to avoid -1 for baby 
        }
    }
}
