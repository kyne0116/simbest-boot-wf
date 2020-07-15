package com.simbest.boot.wf.unitfytodo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * <strong>Title : IProcessTodoDataInfo</strong><br>
 * <strong>
 *     Description : 流程待办、已办接口、我的草稿、我的申请、我的待阅、我的已阅
 * </strong><br>
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
     * 分页获取所有待办数据(带分页)
     * @param todoParam   查询待办参数
     * @return
     */
    Page<Map<String,Object>> getAllTodoPage ( Map<? extends Object, ? extends Object> todoParam, Pageable pageable );

    /**
     * 查询应用中所有指定人申请的待办数据
     * @param todoParam
     * @param pageable
     * @return
     */
    Page<Map<String, Object>> getMyCreateAllTodoPage ( Map<? extends Object, ? extends Object> todoParam, Pageable pageable );

    /**
     * 查询应用中所有指定人申请的数据(草稿)
     * @param todoParam
     * @param pageable
     * @return
     */
    Page<Map<String, Object>> getMyApplyPage ( Map<? extends Object, ? extends Object> todoParam, Pageable pageable );

    /**
     * 分页获取所有待办数据(无分页)
     * @param todoParam   查询待办参数
     * @return
     */
    List<Map<String,Object>> getAllTodoNoPage ( Map<? extends Object, ? extends Object> todoParam);

    /**
     * 获取指定 userName 下面所有的待办数据
     * @param todoUserParam        查询待办参数
     * @return
     */
    Page<?> getTodoByUserNamePage ( Map<? extends Object, ? extends Object> todoUserParam, Pageable pageable );

    /**
     * 获取指定 userName 下面所有的待办数据  无分页
     * @param todoUserParam        查询待办参数
     * @return
     */
    List<?> getTodoByUserNameNoPage ( Map<? extends Object, ? extends Object> todoUserParam );

    /**
     * 获取指定 userName 下面所有的待办办数据(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    Page<Map<String,Object>> getTodoByUserIdPageMap ( Map<? extends Object, ? extends Object> doneUserParam, Pageable pageable );

    /**
     * 获取指定 userName 下面所有的待办办数据无分页(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    List<Map<String,Object>> getTodoByUserIdNoPageMap ( Map<? extends Object, ? extends Object> doneUserParam );

    /**
     * 获取指定 userName 下面涉及的所有文种(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    List<Map<String,Object>> getTodoByUserIdGroupMap ( Map<? extends Object, ? extends Object> doneUserParam );

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
     * 获取指定 userName 下面所有的已办数据,无分页 存在子流程
     * @param doneUserParam         查询已办参数
     * @return
     */
    List<?> getAreadyDoneByUserIdSubFlowNoPage ( Map<? extends Object, ? extends Object> doneUserParam );

    /**
     * 获取指定 userName 下面所有的已办数据(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    Page<Map<String,Object>> getAreadyDoneByUserIdPageMap ( Map<? extends Object, ? extends Object> doneUserParam, Pageable pageable );

    /**
     * 获取指定 userName 已办下面所有的待办数据无分页(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    List<Map<String,Object>> getAreadyDoneByUserIdNoPageMap ( Map<? extends Object, ? extends Object> doneUserParam );


    /**
     * 获取指定 userName 已办下面涉及的所有文种(返回为Map类型)
     * @param doneUserParam         查询已办参数
     * @return
     */
    List<Map<String,Object>> getAreadyDoneByUserIdGroupMap ( Map<? extends Object, ? extends Object> doneUserParam );

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

    /**
     * 查询业务系统中所有正在办理的工单数据-无分页 供统一待办对账查询使用
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> getAllTodoByManagerNoPage() throws Exception;

    /**
     * 功能描述: 根据流程实例ID更新更新标题信息
     *
     * @param
     * @return
     * @date 2020/2/20 11:51
     * @auther ljw
     */
    int updateTitleByProcessInstById(Map<? extends Object, ? extends Object> paramMap);

    /**
     * 根据业务流程定义id获取该流程所有的待办信息并分页
     * @param page  页码
     * @param rows  行数
     * @param boProcessDefId   业务流程实例id
     * @param userName        当前办理人
     * @param businessTitle   标题
     * @return
     */
    Page<Map<String , Object>> getAllByBoProcessDefId(int page , int rows , String boProcessDefId , String userName , String businessTitle);

}
