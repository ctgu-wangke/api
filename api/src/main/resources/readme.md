## 待办事项：
1.spring security

> * security 源码解析 
> > * 通过对userNameAuthoriztiaonFilter的代码进行分析，已经基本弄清楚重写的步骤
> * 安全集成oauth2
> * jwt 来实现rest接口验证
> * 自定义认证


2.数据库
> * mybatis 基础使用，使用mybatis generate 生成单表crud sql
> * mybatis 实现支持多数据库 oracle 和 mysql
> * 数据源使用druid；
> * 事务处理原理及探索;  

3.tomcat 日志管理，将应用的日志单独输出到对应的文件里面；
> * 首先需要将整个spring的应用log 使用slf4j ，排除掉其他组件里面使用的log
> * tomcat的catalina.out会打印tomcat的运行日志以及slf4j里面输出到console的日志
> * 为了让dev测试console正常打印，prod环境打印到特定的日志文件里面，可以使用logback-spring.xml来配置日志文件，
> 使用springprofile 标签来指定在不同的profile输出到不同的目录里面
> ```xml
>     <!-- 日志输出级别 -->
>     <springProfile name = "dev">
>         <root level="INFO">
>             <appender-ref ref="STDOUT" />
>             <appender-ref ref="FILE" />
>         </root>
>     </springProfile>
>
>     <!-- 日志输出级别 -->
>   <springProfile name = "prod">
>         <root level="INFO">
>             <appender-ref ref="FILE" />
>         </root>
>     </springProfile>
> ```

4.接口监控
> - 通过intercept 拦截器来实现接口监控
> >    目前可以通过日志里面打印接口调用花费的时间了
> - 通过aop 环绕通知来实现接口监控