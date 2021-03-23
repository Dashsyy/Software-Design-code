package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    public String id;
    public String name, tel;
    public  Student(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmssSSS");
        Date date =new Date();
        id = dateFormat.format(date);
    }
}
