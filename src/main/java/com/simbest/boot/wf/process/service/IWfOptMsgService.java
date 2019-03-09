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
     * 根据流程实例ID查询流程审批意见信息（包含主流程和当前参与的所有子流程数据）   供流程审批意见查询使用
     * @param paramMap    参数
     * @return
     */
    List<Map<String, Object>> queryProcessOptMsgDataMap ( Map<String, Object> paramMap );

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

    /**
     * 根据流程实例ID和目标工作项ID把目标工作项之后所有的审批意见修改无效状态，wfmg回退功能使用
     * @param processInstId     流程实例ID
     * @param workItemId        目标工作项ID
     * @return
     */
     int updateOptMsgByProInsIdWorkItemId ( Long processInstId, Long workItemId );

    /**
     * 根据任务ID添加任务审批意见
     * @param workItemMsg       参数
     * @return
     */
     int submitApprovalMsg(Map<String,Object> workItemMsg);

    /**
     * 查询流程审批意见
     * @param queryParam       查询参数
     * @return
     */
     List<?> queryComments(Map<String,Object> queryParam);
}
