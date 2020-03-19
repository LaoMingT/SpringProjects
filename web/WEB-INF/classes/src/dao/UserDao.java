package dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao  extends JdbcDaoSupport {
    @SuppressWarnings("rawtypes")
    public  void getUserName(){
        String sql="select * from userinfo";
        List<Map> result = super.getJdbcTemplate().query(sql, new RowMapper<Map>() {
            @Override
            public Map<String,String> mapRow(ResultSet rs, int rowNum) throws SQLException {
                Map<String,String> row = new HashMap<String, String>();
                row.put("rowguid", rs.getString("rowguid"));
                return row;
            }});
        System.out.println(result.toString());
    }
    public UserDao() {
        super();
    }

}
