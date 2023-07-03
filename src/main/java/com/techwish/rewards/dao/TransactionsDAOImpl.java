package com.techwish.rewards.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.techwish.rewards.model.Transaction;

@Repository
public class TransactionsDAOImpl implements TransactionsDAO {

    @Autowired
    JdbcTemplate transactionTemplate;
    
    @Override
    public int insertTransaction(Transaction transaction){
    	
    	KeyHolder keyHolder = new GeneratedKeyHolder();
    	
        String query = "INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) "
        		+ "VALUES(?,?,?,?)";
        
        transactionTemplate.update(connection -> {
        	PreparedStatement pst = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, transaction.getCustomerId());
            pst.setString(2, transaction.getMerchantId());
            pst.setFloat(3, transaction.getAmount());
            pst.setString(4, transaction.getDate());
            return pst;
        }, keyHolder);
        
        return keyHolder.getKey().intValue();
    }    
}
