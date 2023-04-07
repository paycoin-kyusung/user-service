package com.kyusung.userservice.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultException extends RuntimeException {
    private static final String MSG = "Unknown exception";

    public DefaultException() {
        super(MSG);
        log.error(MSG, this);
    }

    public DefaultException(String msg) {
        super(msg);
        log.error(msg, this);
    }

    public DefaultException(Throwable cause) {
        super(cause);
        log.error(MSG, this);
    }

    public DefaultException(String msg, Throwable cause) {
        super(msg, cause);
        log.error(msg, this);
    }
}
