package com.jasmine.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

/**
 * 日志打印工具类
 *
 * @author xieshanghan
 * @version LoggerUtil.java, v 0.1 2023年06月05日 00:02 xieshanghan
 */
public class LoggerUtil {

    private static final String COMMA = ",";

    public static void info(Logger logger, Object... objs) {
        if (logger.isInfoEnabled()) {
            logger.info(getDefaultPatternLogString(objs));
        }
    }

    public static void info(Logger logger, String format, Object... objs) {
        if (logger.isInfoEnabled()) {
            logger.info(format, objs);
        }
    }

    public static void debug(Logger logger, Object... objs) {
        if (logger.isDebugEnabled()) {
            logger.debug(getDefaultPatternLogString(objs));
        }
    }

    public static void debug(Logger logger, String format, Object... objs) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, objs);
        }
    }

    public static void warn(Logger logger, Object... objs) {
        if (logger.isWarnEnabled()) {
            logger.warn(getDefaultPatternLogString(objs));
        }
    }

    public static void warn(Logger logger, String format, Object... objs) {
        if (logger.isWarnEnabled()) {
            logger.warn(format, objs);
        }
    }

    public static void warn(Logger logger, Throwable throwable, String format, Object... objs) {
        if (logger.isWarnEnabled()) {
            logger.warn(String.format(format, objs), throwable);
        }
    }

    public static void error(Logger logger, Object... objs) {
        if (logger.isErrorEnabled()) {
            logger.error(getDefaultPatternLogString(objs));
        }
    }

    public static void error(Logger logger, Throwable th, Object... objs) {
        if (logger.isErrorEnabled()) {
            logger.error(getDefaultPatternLogString(objs), th);
        }
    }

    public static void error(Logger logger, String format, Object... objs) {
        if (logger.isErrorEnabled()) {
            logger.error(format, objs);
        }
    }

    public static void error(Logger logger, Throwable throwable, String format, Object... objs) {
        if (logger.isErrorEnabled()) {
            logger.error(String.format(format, objs), throwable);
        }
    }

    private static String getDefaultPatternLogString(Object... objs) {
        if (objs == null) {
            return StringUtils.EMPTY;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objs) {
            sb.append(obj);
        }
        String logString = sb.toString().join(COMMA);
        return logString;
    }

}