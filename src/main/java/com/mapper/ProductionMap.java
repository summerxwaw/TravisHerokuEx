package com.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Production;
import org.springframework.jdbc.core.RowMapper;

public class ProductionMap implements RowMapper<Production> {
    public static final String BASE_SQL = //
            "Select pd.prod_id,pd.prod_name,pd.prod_des,pd.prod_number "//
                    + " from Production pd ";
    @Override
    public Production mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer prod_id = rs.getInt("prod_id");
        String prod_name = rs.getString("prod_name");
        String prod_des = rs.getString("prod_des");
        Integer prod_number = rs.getInt("prod_number");

        return new Production(prod_id, prod_name, prod_des, prod_number);
    }
}
