package com.example.jwt.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DateUtils {

    @Value("${jms.jwt.timezone}")
    private String TIMEZONE;

    private SimpleDateFormat simpleDateFormat(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone(TIMEZONE));
        return sdf;
    }

    public String getDateString(){
        Date now= new Date();
        return simpleDateFormat().format(now);
    }

    public long getDateMillis(){
        
    }
}
