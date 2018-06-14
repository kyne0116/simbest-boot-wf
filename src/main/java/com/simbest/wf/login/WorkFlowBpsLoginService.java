package com.simbest.wf.login;

import java.util.Map;

/**
 * <strong>Title : WorkFlowLoginService</strong><br>
 * <strong>Description : 流程登录操作<br>
 *          目前暂时处理BPS流程引擎登录<br>
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
public interface WorkFlowBpsLoginService {

    /**
     * BPS流程引擎登录操作
     * @param param
     */
    void bpsLogin( Map<? extends Object,? extends Object> param);
}
