package com.simbest.boot.wf.process.service;

import org.apache.poi.ss.formula.functions.T;

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
    long finishWorkItemWithRelativeData ( long workItemId, Map<String, Object> param, boolean transactionSpan );

    /**
     * 完成指定工作项并携带流程相关数据（提交下一步）
     * @param param                 流程相关数据
     */
    int finishWorkTaskWithRelativeData ( Map<String, Object> param);

    /**
     * 功能描述:  根据环节配置的属性进行流转下一步
     *
     * @param
     * @return
     * @date 2020/2/29 11:43
     * @auther ljw
     */
    int finshTaskWithComplete(Map<String,Object> nextParam);

    /**
     * 提交流程审批意见
     * @param workItemId            工作项ID
     * @param approvalMsg           审批意见信息
     */
    int submitApprovalMsg ( long workItemId, String approvalMsg );

    /**
     * 将工作项改派给指定的参与者，可以改派给多个个人
     * @param workItemId            工作项ID
     * @param reassignUsers         改派的人
     * @return
     */
    int reassignWorkItem(long workItemId,List<Object> reassignUsers);


    /**
     * 将工作项改派给置顶的参与者，可以改派给多个人（activity）
     * @param map
     * @return
     */
    int reassignWorkByActivity(Map<String , Object> map);

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
     * 根据流程实例ID查询工作项信息  流程跟踪  Flowable使用
     * @param processInsId        流程实例ID
     * @return
     */
    List<?> queryWorkTtemDataByProInsId ( Object processInsId );

    /**
     * 根据流程实例ID查询流程跟踪(wfmg在用)
     * @param processInstId     流程实例ID
     * @param workItemId        工作项ID
     * @return
     */
    List<?> queryWorkItems( long processInstId,long workItemId );

    /**
     * 根据流程实例ID查询工作项信息  流程跟踪
     * @param paramMap      参数
     * @return
     */
    List<Map<String,Object>> queryWorkITtemDataMap ( Map<String,Object> paramMap);

    /**
     * 根据流程实例ID查询工作项信息  流程跟踪
     * @param paramMap      参数
     * @return
     */
    Object queryTaskDataMap ( Map<String,Object> paramMap);

    /**
     * 根据流程实例ID查询工作项信息(包含主流程和所有子流程数据)  流程跟踪
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
     * @param processInsId      流程实例ID
     * @param workItemId        工作项Id
     * @return
     */
    Object getWorkItemByWorkItemId(Long processInsId,Long workItemId);

    /**
     * 根据工作项Id查询工作项信息
     * @param workItemId        工作项Id
     * @return
     */
    Object getWorkItemByWorkItemId(Long workItemId);

    /**
     * 根据工作项状态和有效状态查询所有处于运行状态的工作项信息
     * @return
     */
    List<?> queryAllByCurrentStateAndeAndEnabledNative ();

    /**
     * 更新流程跟踪信息
     * @param workItem          流程工作项参数
     * @return
     */
    Object updateWorkItemInfo(Map<String,Object> workItem);

    /**
     * 根据当前操作人查询工作任务
     * @param queryParam        流程任务查询
     * @return
     */
    List<?> queryPorcessWorkTask(Map<String,Object> queryParam);

    /**
     * 根据工作任务ID结束流程
     * @param processParam      参数
     */
    void endProcess(Map<String,Object> processParam);

    /**
     * 根据流程实例ID和目标工作项ID把目标工作项之后所有的流程跟踪修改无效状态，wfmg回退功能使用
     * @param processInstId     流程实例ID
     * @param workItemId        目标工作项ID
     * @return
     */
    int updateOptMsgByProInsIdWorkItemId ( Long processInstId, Long workItemId );

    /**
     * 领取任务  （Activity6）
     * @param taskId        任务ID
     * @param userId        领取人
     * @return
     */
    int claim(String taskId,String userId);

    /**
     * 功能描述:查询正在运行中的任务实例
     *
     * @param 
     * @return 
     * @date 2020/4/3 11:58
     * @auther Administrator
     */
    List<?> queryRunningTaskInstModelByProcessInstId(Map<String,Object> processParam);

    /**
     * 结束工作项（activity，仅仅只限于多实例）
     * @param processParam
     */
    void endTask(Map<String , Object> processParam);

    /**
     * 补发 : 从唯一环节补发到其他环节（activity使用）
     * @param paramMap
     * @return
     */
    Map<String , Object> reissueProcess(Map<String, Object> paramMap);


    /**
     * 回滚：回滚该环节及其以下所有环节至该环节的上一环节 （activity使用）
     * @param paramMap
     * @return
     */
    Map<String , Object> processGoBack(Map<String , Object> paramMap);

    /**
     * 获取当前环节出去的连线
     * @param taskId    任务ID
     * @return
     */
    List<Map<String,Object>> getNextFlowNodes(String taskId);

    /**
     * 根据流程环节定义ID查询运行状态下的工作项信息
     * @param activityDefId     环节定义ID
     * @return
     */
    List<?> queryWorkItemByProInstIdAndAcdefId(String activityDefId);
}
