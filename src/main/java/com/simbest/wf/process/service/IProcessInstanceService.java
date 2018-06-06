package com.simbest.wf.process.service;

import java.util.Collection;
import java.util.Map;

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
    long startProcessAndSetRelativeDataNormal( String processDefName, String processInstName, String processInstDesc, boolean transcationSpan, Map<String,Object> param);

    /**
     * 启动流程并设置相关数据
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @param transcationSpan       是否分割事务 true开启，false关闭
     * @param param                 相关数据键值对
     * @return
     */
    Collection<?> startProcessAndSetRelativeData( String processDefName, String processInstName, String processInstDesc, boolean transcationSpan, Map<String,Object> param);


    /**
     * 启动流程不设置相关数据(事务分割标志)
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @param transcationSpan       是否分割事务 true开启，false关闭
     * @return
     */
    long startProcessAndTran (String processDefName, String processInstName, String processInstDesc, boolean transcationSpan);

    /**
     * 启动流程不设置相关数据
     * @param processDefName        流程定义名称
     * @param processInstName       流程实例名称
     * @param processInstDesc       流程实例描述
     * @return
     */
    long startProcess (String processDefName, String processInstName, String processInstDesc);

}
