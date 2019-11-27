package com.ajstudy.designpatterns.template.dao;

import java.util.List;

/**
 * @ClassName: MemberDaoTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-27  14:08
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
