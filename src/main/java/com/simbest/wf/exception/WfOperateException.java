package com.simbest.wf.exception;

/**
 * <strong>Title : WfOperateException</strong><br>
 * <strong>Description : 流程操作业务触发异常封装</strong><br>
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
public class WfOperateException extends Exception{

    public WfOperateException ( String message ) {
        super( message );
    }

    public WfOperateException ( String message, Throwable cause ) {
        super( message, cause );
    }

    public WfOperateException ( Throwable cause ) {
        super( cause );
    }

    public WfOperateException ( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
