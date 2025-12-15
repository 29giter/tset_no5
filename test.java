package test;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestJava {
	
	
	public static void main(String[] args) {
        
		Calendar calendar = Calendar.getInstance(); //当前时间
		calendar.add(Calendar.DAY_OF_WEEK, 6); //当前时间增加--x天后时间
		int year =calendar.get(Calendar.YEAR); 
		int month=calendar.get(Calendar.MONTH)+1; 
		int day =calendar.get(Calendar.DAY_OF_MONTH);
		//获取0点
		String z1=year+"-"+month+"-"+day+" 00:00:00";
		
		
		System.out.println(z1);
		
		System.out.println(year+"-"+month+"-"+day+" 23:59:59");
		
		
	}

}
