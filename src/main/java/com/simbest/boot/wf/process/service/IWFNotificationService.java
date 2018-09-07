package com.simbest.boot.wf.process.service;

import java.util.List;

/**
 * <strong>Title : IWFNotificationService</strong><br>
 * <strong>Description : 流程通知接口(我的待阅/我的已阅)</strong><br>
 * <strong>Create on : 2018/8/28</strong><br>
 * <strong>Modify on : 2018/8/28</strong><br>
 * <strong>Copyright (C) Ltd.</strong><br>
 *
 * @author LJW lijianwu@simbest.com.cn
 * @version <strong>V1.0.0</strong><br>
 * <strong>修改历史:</strong><br>
 * 修改人 修改日期 修改描述<br>
 * -------------------------------------------<br>
 */
public interface IWFNotificationService {

    /**
     * 给指定的参与者发送流程实例通知
     * @param senderID                  通知者
     * @param recipients                通知接收者
     * @param title                     通知标题
     * @param content                   通知内容
     * @param processInstId             流程实例ID
     * @return
     */
    int sendProcessInstNotification(String senderID, String[] recipients, String title, String content, Long processInstId);

    /**
     * 给指定的参与者发送活动实例通知
     * @param senderID                  通知者
     * @param recipients                通知接收者
     * @param title                     通知标题
     * @param content                   通知内容
     * @param activityInstId            活动实例ID
     * @return
     */
    int sendActivityInstNotification(String senderID, String[] recipients, String title, String content, Long activityInstId);

    /**
     * 给指定的人发送任务通知
     * @param senderID                  通知者
     * @param recipients                通知接收者
     * @param title                     通知标题
     * @param content                   通知内容
     * @param workItemId                工作项实例ID
     * @return
     */
    int sendTaskNotificationToPerson(String senderID, String[] recipients, String title, String content, Long workItemId);

    /**
     *   查询未确认的流程实例通知
     * @param recipientID               通知接收者ID
     * @param timeoutFlag               超时标志(RunTimeConst.TIMEOUT_FALSE, RunTimeConst.TIMEOUT_TRUE, null所有)
     * @return
     */
    List<?> queryUnViewedProcessInstNotifications( String recipientID, String timeoutFlag);

    /**
     *  查询未确认的活动实例通知
     * @param recipientID               通知接收者ID
     * @param timeoutFlag               超时标志(RunTimeConst.TIMEOUT_FALSE, RunTimeConst.TIMEOUT_TRUE, null所有)
     * @return
     */
    List<?> queryUnViewedActivityInstNotifications(String recipientID, String timeoutFlag);

    /**
     * 确认(阅读)通知
     * @param notificationID             通知ID
     * @return
     */
    int confirmNotification(Long notificationID);


    /**
     * 保存数据到本地数据库
     * @param notification          通知具体实体对象
     * @return
     */
    Object saveLocalNotification(Object notification);

    /**
     * 根据ID更新待阅/已阅状态
     * @param notificationId        通知实体ID
     * @param status                通知状态
     * @return
     */
    int updateNotificationStatus(String notificationId,String status);

    /**
     * 根据ID删除通知数据
     * @param notificationId        通知实体ID
     * @return
     */
    int deleteNotification(String notificationId);

    /**
     * 根据流程实例ID查询通知数据
     * @param processInstId         流程实例ID
     * @return
     */
    List<?> getWFNotificationInstListByProcessInstId(Long processInstId);

    /**
     * 根据主单据ID、抄送人和状态查询通知数据
     * @param pmInstId              主单据ID
     * @param recipient             抄送人
     * @return
     */
    Object getNotificationByPmInsIdAndRecipient ( String pmInstId, String recipient );

    /**
     * 根据ID根据最后环节已阅的的意见
     * @param notificationId       通知ID
     * @param content              意见
     */
    int updateNotifiContentEndActivity ( String notificationId, String content );

    /**
     * 根据主键Id查询通知实体
     * @param notificationId                   主键ID
     * @return
     */
    Object getWFNotificationById(String notificationId);
}
