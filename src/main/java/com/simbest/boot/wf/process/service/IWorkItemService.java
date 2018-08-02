package com.simbest.boot.wf.process.service;

import java.util.List;
import java.util.Map;

/**
 * <strong>Title : IWorkItemService</strong><br>
 * <strong>Description : 流程工作项操作接口<br>
 *          用户流程提交下一步操作等
 * </strong>
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
public interface IWorkItemService {

    /**
     * 完成指定工作项并携带流程相关数据（提交下一步）
     * @param workItemId            工作项ID
     * @param param                 流程相关数据
     * @param transactionSpan       是否启用分割事务 true:启用 false:不启用
     */
    int finishWorkItemWithRelativeData ( long workItemId, Map<String, Object> param, boolean transactionSpan );

    /**
     * 提交流程审批意见
     * @param workItemId            工作项ID
     * @param approvalMsg           审批意见信息
     */
    int submitApprovalMsg ( long workItemId, String approvalMsg );

    /**
     * 根据流程实例ID，流程活动实例ID，查询流程工作项信息
     * @param processInstID     流程实例ID
     * @param activityDefID    流程活动定义ID
     * @return
     */
    Object getByProInstIdAAndAInstId ( Long processInstID, String activityDefID );

    /**
     * 根据流程实例ID查询工作项信息  流程跟踪
     * @param processInsId        流程实例ID
     * @return
     */
    List<?> queryWorkTtemDataByProInsId ( long processInsId );

    /**
     * 根据流程实例ID查询工作项信息 存在子流程  流程跟踪
     * @param parentProcessInsId        父流程实例ID
     * @return
     */
    List<?> queryWorkTtemDataByProInsIdSubFlow ( long parentProcessInsId );
    /**
     * 根据流程实例ID 删除工作项信息
     * @param processInstID  流程实例ID
     * @return
     */
    int deleteByProInsId ( Long processInstID );

    /**
     * 根据流程实例ID和环节定义ID更新工作项状态信息
     * @param processInstId             流程实例ID
     * @param activityDefId             环节定义ID
     * @return
     */
    int updateEnabledByProInsIdAndActivityDefId(Long processInstId,String activityDefId);


    void finishWorkItem(long workItemID, boolean transactionSpan);

    /**
     * 根据工作项Id查询工作项信息
     * @param workItemId    工作项Id
     * @return
     */
    Object getWorkItemByWorkItemId(long workItemId);
}
