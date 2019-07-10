package com.umbra.mvn.slf4j.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * slf4j 日志的用法；
 * 控制台输出：一般为 System.out
 * 输出到日志 需要用到 slf4j 输出
 * 需要注意的是:
 * 1. Maven 里面引入 slf4j-api 和 slf4j-log4j12;
 * 2. resources 里面的 log4j.properties 配置文件;
 * 3. 下文的 private static Logger log = LoggerFactory.getLogger(App.class);
 * 4. 输出内容中的 变量 用 {} 括号引入;
 * 5. 以及 log4j.properties 配置文件的玩法;
 */

public class App {

    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        String msgSucc = "APP0000";
        String msgError = "APP0004";
        String msgInfo = "APP0005";

        //控制台输出
        System.out.println("输出方式1：msg = " + msgSucc);

        System.out.format("输出方式2：msg = %s \r\n", msgSucc);

        // 记录debug级别的信息
        log.debug("msg = {} , msge1={}", msgSucc, msgSucc);
        log.debug("这是一个BEBUG日志");

        // 记录info级别的信息
        log.info("msg = {} , msge1={}", msgInfo, msgInfo);
        log.info("this is a info log..");

        // 记录error级别的信息
        log.error("msg = {} , msge1={}", msgError, msgError);
        log.debug("this error log..");

    }

}
