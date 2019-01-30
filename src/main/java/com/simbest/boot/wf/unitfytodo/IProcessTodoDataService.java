package com.simbest.boot.wf.unitfytodo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <strong>Title : IProcessTodoDataInfo</strong><br>
 * <strong>Description : 流程待办、已办接口</strong><br>
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
public interface IProcessTodoDataService {

    /**
     * 获取所有待办数据
     * @param todoParam   查询待办参数
     * @return
     */
    Collection<?> getAllTodo ( Map<? extends Object, ? extends Object> todoParam );

    /**
     * 分页获取所有待办数据
     * @param todoParam   查询待办参数
     * @return
     */
    Page<Map<String,Object>> getAllTodoPage ( Map<? extends Object, ? extends Object> todoParam, Pageable pageable );

    /**
     * 获取所有已办数据
     * @param doneParam    查询已办参数
     * @return
     */
    Collection<?> getAllReadyDone ( Map<? extends Object, ? extends Object> doneParam );

    /**
     * 获取指定 userName 下面所有的待办数据
     * @param todoUserParam        查询待办参数
     * @return
     */
    Collection<?> getTodoByUserName ( Map<? extends Object, ? extends Object> todoUserParam );

    /**
     * 获取指定 userName 下面所有的已办数据
     * @param doneUserParam         查询已办参数
     * @return
     */
    Collection<?> getAreadyDoneByUserId ( Map<? extends Object, ? extends Object> doneUserParam );

    /**
     * 获取指定 userName 下面所有的待办数据
     * @param todoUserParam        查询待办参数
     * @return
     */
    Page<?> getTodoByUserNamePage ( Map<? extends Object, ? extends Object> todoUserParam, Pageable pageable );

    /**
     * 获取指定 userName 下面所有的已办数据
     * @param doneUserParam         查询已办参数
     * @return
     */
    Page<?> getAreadyDoneByUserIdPage ( Map<? extends Object, ? extends Object> doneUserParam, Pageable pageable );

    /**
     * 获取指定 userName 下面所有的已办数据 存在子流程
     * @param doneUserParam         查询已办参数
     * @return
     */
    Page<?> getAreadyDoneByUserIdSubFlowPage ( Map<? extends Object, ? extends Object> doneUserParam, Pageable pageable );

    /**
     * 获取指定 userName 下面所有的已办数据 存在子流程(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    Page<Map<String,Object>> getAreadyDoneByUserIdPageMap ( Map<? extends Object, ? extends Object> doneUserParam, Pageable pageable );

    /**
     * 获取所有待办的状态
     * @param todoStateParam        查询待办参数
     * @return
     */
    Collection<?> getAllTodoState ( Map<? extends Object, ? extends Object> todoStateParam );

    /**
     *  获取所有已办的状态
     * @param doneStateParam        查询已办参数
     * @return
     */
    Collection<?> getAllDoneState ( Map<? extends Object, ? extends Object> doneStateParam );

    /**
     * 获取指定 userName 下面所有的创建的工单数据
     * @param userParam         userId
     * @return
     */
    Page<?> getMyCreateDataPage ( Map<? extends Object, ? extends Object> userParam, Pageable pageable );

    /**
     * 获取指定userName下面待阅数据
     * @param paramMap          查询待阅参数
     * @param pageable          分页参数
     * @return
     */
    Page<?> getMyTodoReadByUserNamePage(Map<? extends Object, ? extends Object> paramMap,Pageable pageable);

    /**
     * 获取指定userName下面待阅数据
     * @param paramMap          查询待阅参数
     * @param pageable          分页参数
     * @return
     */
    Page<Map<String,Object>> getMyTodoReadByUserNamePageMap(Map<? extends Object, ? extends Object> paramMap,Pageable pageable);

    /**
     * 获取指定userName下面已阅数据
     * @param paramMap          查询已阅参数
     * @param pageable          分页参数
     * @return
     */
    Page<?> getMyAreadyReadByUserNamePage(Map<? extends Object, ? extends Object> paramMap,Pageable pageable);

    /**
     * 获取指定userName下面已阅数据
     * @param paramMap          查询已阅参数
     * @param pageable          分页参数
     * @return
     */
    Page<Map<String,Object>> getMyAreadyReadByUserNamePageMap(Map<? extends Object, ? extends Object> paramMap,Pageable pageable);

    /**
     * 查询业务系统中所有正在办理的工单数据   综合流程管理平台调用接口
     * @param paramMap          查询参数
     * @param pageable          分页参数
     * @return
     */
    Page<Map<String,Object>> getAllTodoByManagerPage(Map<? extends Object, ? extends Object> paramMap,Pageable pageable);

    /**
     * 根据主单据中的pmInstId查询流程业务操作数据
     * @param pmInsId       主单据中的pmInstId
     * @return
     */
     Object queryActBusinessStatusByPmInstId ( String pmInsId )throws Exception;

    /**
     * 根据流程实例ID查询流程业务操作数据，可以会出现多条数据挂载一个businessKey（目前网络割接在用）
     * @param processInstId    流程实例ID
     * @return
     */
    List<?> queryActBusinessStatusByProInsId( Long processInstId)throws Exception;
}
