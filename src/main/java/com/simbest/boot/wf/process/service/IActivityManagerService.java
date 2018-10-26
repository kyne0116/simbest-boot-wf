package com.simbest.boot.wf.process.service;

/**
 * <strong>Title : IActivityService </strong><br>
 * <strong>Description : 流程活动控制操作接口<br>
 *         用户流程活动回退等操作
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
public interface IActivityManagerService {

    /**
     * 根据回退策略和当前工作项进行流程回退
     * @param currWorkItemID         当前环节工作项ID
     * @param destWorkItemID              回退到的目标活动定义ID，将根据此活动定义ID查找最新的活动实例进行回退
     * @param rollBackStrategy          回退策略 回退策略类型(目前BPS引擎需要)
     *                                      time 基于两点间的时间回退
     *                                      path 基于两点间的路径回退
     *                                      recent_manual 回退到最近的人工活动
     *                                      one_step 单步回退
     *                                      simple 简单回退
     */
    boolean backProcessActivityByWorkItemId ( Long currWorkItemID, Long destWorkItemID, String rollBackStrategy );
}
