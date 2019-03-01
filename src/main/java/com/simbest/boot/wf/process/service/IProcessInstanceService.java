package com.simbest.boot.wf.process.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <strong>Title : IProcessInstanceService</strong><br>
 * <strong>Description : 流程实例控制接口<br>
 *      用于流程启动、终止、查询流程数据信息等操作<br>
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
public interface IProcessInstanceService {

    /**
     * 启动流程并设置相关数据
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @param transcationSpan       是否分割事务 true开启，false关闭
     * @param param                 相关数据键值对
     * @return
     */
    long startProcessAndSetRelativeDataNormal ( String processDefName, String processInstName, String processInstDesc, boolean transcationSpan, Map<String, Object> param );

    /**
     * 启动流程并设置相关数据
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @param transcationSpan       是否分割事务 true开启，false关闭
     * @param param                 相关数据键值对
     * @return
     */
    long startProcessAndSetRelativeData ( String processDefName, String processInstName, String processInstDesc, boolean transcationSpan, Map<String, Object> param );


    /**
     * 启动流程不设置相关数据(事务分割标志)
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @param transcationSpan       是否分割事务 true开启，false关闭
     * @return
     */
    long startProcessAndTran ( String processDefName, String processInstName, String processInstDesc, boolean transcationSpan );

    /**
     * 启动流程不设置相关数据
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @return
     */
    long startProcess ( String processDefName, String processInstName, String processInstDesc );

    /**
     * 启动流程并进行流程部署
     * @param startParam            流程参数
     * @return
     */
    Map<String,Object> startProcessAndDeployProcessAndNoSetRelativeData(Map<String,Object> startParam);

    /**
     * 启动流程并进行流程部署和根据流程参数进行启动流程实例
     * @param startParam            流程参数
     * @return
     */
    Map<String,Object> startProcessAndDeployProcessAndSetRelativeData(Map<String,Object> startParam);

    /**
     * 根据流程实例ID删除BPS流程引擎流程实例信息
     * @param processInstID         流程实例ID
     * @return
     */
    int deleteProcessInstance(long processInstID);

    /**
     * 根据流程实例ID删除本地流程实例信息
     * @param processInstID         流程实例ID
     * @return
     */
    int deleteLocalDataByProInsId(long processInstID);

    /**
     * 根据流程实例ID删除流程
     * @param delParam      参数
     * @return
     */
    int deleteProcessInstance(Map<String,Object> delParam);

    /**
     * 根据父流程实例ID查询业务流程状态数据
     * @param parentProcessInstID  父流程实例ID
     * @return
     */
    List<? extends Object> getByParentProcId ( Long parentProcessInstID );

    /**
     * 根据业务主键更新流程状态表中的工单标题
     * @param businessKey           业务主键
     * @param title                 工单标题
     * @return
     */
    int updateTitleByBusinessKey ( String businessKey, String title );

    /**
     *  根据流程实例ID查询流程跟踪信息
     *
     * @param processInstId         流程实例ID
     */
    List<Map<String, Object>> getProInstDataByProInstIdLocal(Long processInstId);

    /**
     * 注销流程 逻辑删除,注销后的流程不能恢复
     * @param processInstId          流程实例ID
     * @return
     */
    int cancelProcessInst(Long processInstId);

    /**
     * 注销流程 逻辑删除,注销后的流程不能恢复
     * @param proParam          参数
     * @return
     */
    int cancelProcessInst(Map<String,Object> proParam);

    /**
     * 终止流程
     *     实际是把当前正在运行的工作项状态变为终止状态（13），在已办中可以正常查询到
     * @param processInstId         流程实例ID
     * @return
     */
    int terminateProcessInst(Long processInstId);

    /**
     * 根据流程ID查询流程图片，并返回页面
     * @param processInstanceId     流程实例ID
     * @return
     */
    InputStream getDiagram( String processInstanceId);

    /**
     * 根据流程实例ID查询流程实例信息  多个
     * @param processInstIds    流程实例ID
     * @return
     */
    List<? extends Object> queryProcessInstacesDataByProInsIdApi( Set<String> processInstIds );

    /**
     * 根据流程定义KEY查询流程实例信息  多个
     * @param processDefKey    流程实例ID
     * @return
     */
    List<? extends Object> queryProcessInstacesDataByProDefKeyApi( String processDefKey );

    /**
     * 根据流程活动状态查询流程实例信息  多个
     * @return
     */
    List<? extends Object> queryProcessInstacesDataByActiveApi();

    /**
     * 根据流程活动状态查询流程实例信息  多个
     * @param proBusinessKey       流程业务主键key
     * @return
     */
    List<? extends Object> queryProcessInstacesDataByActiveApi(String proBusinessKey);

    /**
     * 根据流程实例ID查询流程是否结束
     * @param processInstanceId     流程实例ID
     * @return
     */
    boolean queryProcessInstaceEndStateByProInsIdApi(String processInstanceId);
}
