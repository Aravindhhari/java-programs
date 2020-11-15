package com.cg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String []args){
        System.out.println("Hello World");
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println(timeStamp);
     }
}
