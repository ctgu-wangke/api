package org.wangke.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ApiInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);
    private NamedThreadLocal<Long> threadLocal = new NamedThreadLocal("StopWatch_StartTime");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        threadLocal.set(startTime);
        //response.setHeader("ttt",String.valueOf(startTime));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        long endtime = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long timing = endtime - threadLocal.get();
        //response.setHeader("ttt",String.valueOf(timing));
        logger.info("耗时: "+timing);
        //response.flushBuffer();
        //HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
