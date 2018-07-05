package com.simbest.boot.wf.unitfytodo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
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
    Page<?> getTodoByUserNamePage ( Map<? extends Object, ? extends Object> todoUserParam,Pageable pageable );

    /**
     * 获取指定 userName 下面所有的已办数据
     * @param doneUserParam         查询已办参数
     * @return
     */
    Page<?> getAreadyDoneByUserIdPage ( Map<? extends Object, ? extends Object> doneUserParam,Pageable pageable );

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
}
