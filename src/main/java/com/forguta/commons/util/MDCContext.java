package com.forguta.commons.util;

import org.slf4j.MDC;

import static com.forguta.commons.constant.LogConstant.*;

public class MDCContext {

    public static void put(String key, String value) {
        MDC.put(key, value);
    }

    public static void get(String key) {
        MDC.get(key);
    }

    public static String getCorrelationId() {
        return MDC.get(CORRELATION_ID);
    }

    public static void putCorrelationId(String correlationId) {
        MDC.put(CORRELATION_ID, correlationId);
    }

    public static String getRequestId() {
        return MDC.get(REQUEST_ID);
    }

    public static void putRequestId(String requestId) {
        MDC.put(REQUEST_ID, requestId);
    }

    public static String getEventId() {
        return MDC.get(EVENT_ID);
    }

    public static void putEventId(String requestId) {
        MDC.put(REQUEST_ID, requestId);
    }

    public static void remove(String key) {
        MDC.remove(key);
    }

    public static void clear() {
        MDC.clear();
    }
}
