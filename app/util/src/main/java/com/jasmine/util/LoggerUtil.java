package com.jasmine.util;

import org.slf4j.Logger;

/**
 * 日志打印工具类
 *
 * @author xieshanghan
 * @version LoggerUtil.java, v 0.1 2023年06月05日 00:02 xieshanghan
 */
public class LoggerUtil {

    public static void info(Logger logger, String message) {
        if (logger.isInfoEnabled()) {
            logger.info(message);
        }
    }

    public static void info(Logger logger, String format, Object... objects) {
        if (logger.isInfoEnabled()) {
            logger.info(format, objects);
        }
    }

    public static void debug(Logger logger, String message) {
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    public static void debug(Logger logger, String format, Object... objects) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, objects);
        }
    }

    public static void warn(Logger logger, String message) {
        if (logger.isWarnEnabled()) {
            logger.warn(message);
        }
    }

    public static void warn(Logger logger, String format, Object... objects) {
        if (logger.isWarnEnabled()) {
            logger.warn(format, objects);
        }
    }

    public static void warn(Logger logger, String message, Throwable throwable) {
        if (logger.isWarnEnabled()) {
            logger.warn(message, throwable);
        }
    }

    public static void error(Logger logger, String message) {
        if (logger.isErrorEnabled()) {
            logger.error(message);
        }
    }

    public static void error(Logger logger, String message, Throwable throwable) {
        if (logger.isErrorEnabled()) {
            logger.error(message, throwable);
        }
    }

}