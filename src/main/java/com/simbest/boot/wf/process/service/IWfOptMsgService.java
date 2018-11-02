package com.simbest.boot.wf.process.service;

import java.util.List;
import java.util.Map;

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
     * 根据流程实例ID查询流程审批意见信息  流程审批意见
     * @param processInId       流程实例ID
     * @return
     */
    List<?> getByProInsIdOptMsgs( Long processInId );

    /**
     * 根据流程实例ID查询流程审批意见信息 存在子流程   流程审批意见
     * @param parentProcessInId       父流程实例ID
     * @return
     */
    List<?> getByProInsIdOptMsgsSubFlow( Long parentProcessInId );

    /**
     * 根据流程实例ID删除本地流程实例信息
     * @param processInstID         流程实例ID
     * @return
     */
    int deleteLocalDataByProInsId(long processInstID);

     /**
     * 根据流程实例ID和工作项ID 查询审批意见数据
     * @param processInId           流程实例ID
     * @param workItemId            工作项ID
     * @return
     */
     Object getOneData(Long processInId, Long workItemId);

    /**
     * 更新流程审批意见
     * @param workItemMsg       要修改的数据
     * @return
     */
     Object updateWorkOptMstInfo( Map<String,Object> workItemMsg );
}
