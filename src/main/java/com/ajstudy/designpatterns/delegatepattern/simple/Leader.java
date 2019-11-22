package com.ajstudy.designpatterns.delegatepattern.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Leader
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  14:49
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> targets = new HashMap<>();

    Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    @Override
    //项目经理自己不干活
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
