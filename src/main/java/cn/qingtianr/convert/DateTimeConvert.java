package main.java.cn.qingtianr.convert;

import ognl.DefaultTypeConverter;
import ognl.ParseException;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Objects;

/**
 * Created by jack on 16-4-25.
 */
public class DateTimeConvert extends DefaultTypeConverter {
    //日期格式转化器
    private DateFormat[] dateFormat={
            new SimpleDateFormat("yyyy-MM-dd"),//格式如2008-08-08
            new SimpleDateFormat("yyyy/MM/dd"),//格式如2008/08/08
            new SimpleDateFormat("yy-MM-dd"),//格式如08-08-08
    };
    //时间格式转化器
    private DateFormat[] timeFormat={
            new SimpleDateFormat("HH:mm:ssss"),//格式如13:00:1100
            new SimpleDateFormat("HH:mm"),//格式如13:00
    };
    //重写转化方法
    public Object convertValue(Map context,Object value,Class toType){

        if(toType.equals(java.sql.Date.class)){//如果是java.sql.Date类型

            String[] parameterValues=(String[])value;//原始字符串数据
            for (DateFormat format:dateFormat) {//使用三种格式化其转化日期
                try {
                    long n=format.parse(parameterValues[0]).getTime();
                    java.sql.Date date=new java.sql.Date(n);
                    return date;
                } catch (Exception e) {}
            }

        }else if (toType.equals(java.sql.Time.class)) {//如果是java.sql.Time类型

            String[] parameterValues=(String[])value;//原始字符串数据
            for (DateFormat format:timeFormat) {//使用2种格式化其转化时间
                try {
                    long n=format.parse(parameterValues[0]).getTime();
                    java.sql.Time time=new java.sql.Time(n);
                    return time;
                } catch (Exception e) {}
            }

        }else if(toType.equals(java.util.Date.class)){//如果是java.util.Date类型

            String[] parameterValues=(String[])value;//原始字符串数据
            for (DateFormat format:dateFormat) {//使用三种格式化其转化日期
                try {
                    java.util.Date date=format.parse(parameterValues[0]);
                    return date;
                } catch (Exception e) {}
            }

        }else if (toType.equals(String.class)) {//如果是字符串

            if(value instanceof java.sql.Date){
            }else if(value instanceof java.sql.Time){
            }else if(value instanceof java.util.Date){
                String str=dateFormat[0].format((java.util.Date)value);//将Date转换成字符串
                return str;
            }
        }

        return super.convertValue(context, value, toType);//否则调用父类方法
    }
}

