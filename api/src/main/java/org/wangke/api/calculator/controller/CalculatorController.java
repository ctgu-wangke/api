package org.wangke.api.calculator.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangke.api.calculator.components.Calculator;
import org.wangke.api.common.dto.RestResponse;
import org.wangke.api.common.utils.ResponseUtil;
import org.wangke.api.exception.WarnException;

@RestController
@Api(value = "计算器")
public class CalculatorController {

    @ApiOperation(value = "简易计算功能")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a",required = true,paramType = "query"),
            @ApiImplicitParam(name = "b",required = true,paramType = "query"),
            @ApiImplicitParam(name = "c",value = "运算符号+-*/",required = true,paramType = "query")
    })
    @GetMapping(value = "/calculator/simple")
    public RestResponse<Number> calculator(String a , String b, String c){
        double result = 0.0;
        switch (c.trim()){
            case Calculator.PLUS : {
                result = Calculator.plus(Calculator.toDouble(a),Calculator.toDouble(b));
                break;
            }
            case Calculator.MINUS : {
                result = Calculator.minus(Calculator.toDouble(a),Calculator.toDouble(b));
                break;
            }
            case Calculator.MULTI : {
                result = Calculator.multi(Calculator.toDouble(a),Calculator.toDouble(b));
                break;
            }
            case Calculator.DIVIDE : {
                result = Calculator.divide(Calculator.toDouble(a),Calculator.toDouble(b));
                break;
            }
            default: {
                throw new WarnException("计算符号输入有误，只有 +-*/ ");
            }
        }
        return ResponseUtil.okResponse("计算完成",result);
    }
}
