package com.forguta.commons.util;

import org.slf4j.MDC;

import static com.forguta.commons.constant.LogConstant.CORRELATION_ID;
import static com.forguta.commons.constant.LogConstant.REQUEST_ID;

public class MDCContext {

    public static void put(String key, String value) {
        MDC.put(key, value);
    }

    public static void get(String key) {
        MDC.get(key);
    }

    public static void putCorrelationId(String correlationId) {
        MDC.put(CORRELATION_ID, correlationId);
    }

    public static void putRequestId(String requestId) {
        MDC.put(REQUEST_ID, requestId);
    }

    public static String getCorrelationId() {
        return MDC.get(CORRELATION_ID);
    }

    public static String getRequestId() {
        return MDC.get(REQUEST_ID);
    }

    public static void clear() {
        MDC.clear();
    }
}
