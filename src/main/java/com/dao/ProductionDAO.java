package com.dao;
import java.util.List;
import javax.sql.DataSource;

import com.mapper.ProductionMap;
import com.model.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductionDAO extends JdbcDaoSupport {

    @Autowired
    public ProductionDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    private int getMaxProdId() {
        String sql = "Select max(prod_id) from PRODUCTION pd";

        Integer value = this.getJdbcTemplate().queryForObject(sql, Integer.class);
        if (value == null) {
            return 0;
        }
        return value;
    }


    public List<Production> listProduction() {
        String sql = ProductionMap.BASE_SQL;

        Object[] params = new Object[] {};
        ProductionMap mapper = new ProductionMap();

        List<Production> list = this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }

    public void insertProduction(String prod_name, Integer prod_number) {
        String sql = "Insert into PRODUCTION (prod_id,prod_name,prod_des,prod_number) "//
                + " values (?,?,?,?) ";
        int prod_id = this.getMaxProdId() + 1;
        String prod_des = "firm: netcracker" + prod_id;
        Object[] params = new Object[] { prod_id, prod_name, prod_des, prod_number };
        this.getJdbcTemplate().update(sql, params);
    }
}
