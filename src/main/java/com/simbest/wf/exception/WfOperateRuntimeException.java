package com.simbest.wf.exception;

/**
 * <strong>Title : WfOperateRuntimeException</strong><br>
 * <strong>Description : 流程操作运行时异常</strong><br>
 * <strong>Create on : $date$</strong><br>
 * <strong>Modify on : $date$</strong><br>
 * <strong>Copyright (C) Ltd.</strong><br>
 *
 * @author LJW lijianwu@simbest.com.cn
 * @version <strong>V1.0.0</strong><br>
 * <strong>修改历史:</strong><br>
 * 修改人 修改日期 修改描述<br>
 * -------------------------------------------<br>
 */
public class WfOperateRuntimeException extends RuntimeException{

    public WfOperateRuntimeException ( String message ) {
        super( message );
    }

    public WfOperateRuntimeException ( String message, Throwable cause ) {
        super( message, cause );
    }

    public WfOperateRuntimeException ( Throwable cause ) {
        super( cause );
    }

    public WfOperateRuntimeException ( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
