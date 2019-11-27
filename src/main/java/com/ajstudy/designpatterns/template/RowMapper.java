package com.ajstudy.designpatterns.template;

import java.sql.ResultSet;

/**
 * @ClassName: RowMapper
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-27  13:50
 * <p>
 * 创建一个模板类JdbcTemplate，封装所有的JDBC 操作。以查询为例，每次查询的表不
 * 同，返回的数据结构也就不一样。我们针对不同的数据，都要封装成不同的实体对象。
 * 而每个实体封装的逻辑都是不一样的，但封装前和封装后的处理流程是不变的，因此，
 * 我们可以使用模板方法模式来设计这样的业务场景。先创建约束ORM 逻辑的接口
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
