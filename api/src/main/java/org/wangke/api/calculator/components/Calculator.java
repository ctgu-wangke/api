package org.wangke.api.calculator.components;

import org.springframework.stereotype.Component;
import org.wangke.api.exception.WarnException;

/**
 * 简易计算器功能
 */
@Component
public class Calculator {

    public  static final  String PLUS = "+";

    public  static final String MINUS = "-";

    public  static final String MULTI = "*";

    public  static final String DIVIDE = "/";

    public static double plus(double a , double b){
        return a+b;
    }

    public  static double minus (double a, double b){
        return  a-b;
    }

    public  static double multi (double a, double b){
        return  a*b;
    }

    public  static double divide (double a, double b){
        if(b == 0 )
            throw new WarnException("被除数不能为0");
        return  a/b;
    }

    /**
     *
     * @param expression 要计算的表达式 1+2*3+(2+3/5)
     * @return
     */
    public static double calculate(String expression){
        //todo
        return 0.0;
    }

    public  static double toDouble(String s){
        double result = 0.0;
        try{
            result = Double.valueOf(s);
        }catch (Exception e){
            throw new WarnException("输入有误:" + s);
        }
        return result;
    }
}
