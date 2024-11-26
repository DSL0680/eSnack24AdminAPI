package org.esnack24api.esnack24adminapi.member.exception;

import lombok.Data;

@Data
public class MemberTaskException extends RuntimeException {

    private int status;

    private String msg;

    public MemberTaskException(final int status, final String msg) {
        super(status + "_" + msg);
        this.status = status;
        this.msg = msg;
    }
}
