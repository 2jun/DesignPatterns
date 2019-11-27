package com.ajstudy.designpatterns.template.dao;

import com.ajstudy.designpatterns.template.RowMapper;
import com.ajstudy.designpatterns.template.domain.Member;
import com.ajstudy.designpatterns.template.jdbc.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @ClassName: MemberDao
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-27  14:00
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, (RowMapper<Member>) (rs, rowNum) -> {
            Member member = new Member();
            //字段过多，原型模式
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            member.setAddr(rs.getString("addr"));
            return member;
        }, null);
    }


}
