package com.simbest.boot.wf.process.service;

import java.util.List;

/**
 * <strong>Title : IWfOptMsgService</strong><br>
 * <strong>Description : 流程审批意见接口</strong><br>
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
public interface IWfOptMsgService {

    /**
     * 根据流程实例ID查询流程审批意见信息
     * @param processInId       流程实例ID
     * @return
     */
    List<?> getByProInsIdOptMsgs( Long processInId );

}
