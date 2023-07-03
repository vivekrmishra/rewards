package com.techwish.rewards.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techwish.rewards.model.MonthlyReward;
import com.techwish.rewards.model.Reward;

@Repository
public class RewardsDAOImpl implements RewardsDAO {

    @Autowired
    JdbcTemplate rewardTemplate;
    
    private static String customeRewardSelect = "select customer.name, EXTRACT (MONTH FROM reward.rewarddate) as \"monthnum\", monthname(reward.rewarddate) as \"month\" , "
			+ "sum (reward.rewardpoints) as \"rewardpoints\" ";
    private static String customerRewardFrom = "from reward, customer ";
    private static String customerRewardWhereId = "where customer.id=? AND reward.customerid = customer.id ";
    private static String customerRewardWhereName = "where customer.name=? AND reward.customerid = customer.id ";
    private static String customerRewardWhereAll = "where reward.customerid = customer.id ";
    private static String customerRewardGroupBy = "group by customer.name, \"monthnum\", \"month\"";
    
    @Override
    public int insertReward (Reward reward){
        String query = "INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) "
        		+ "VALUES(?,?,?,?)";
        return rewardTemplate.update(query, reward.getRewardsPoints(), reward.getRewardsDate(), reward.getCustomerId(), 
        		reward.getTransactionId());
    }
    
    @Override
    public List<MonthlyReward> getCustomerReward(int customerId) {
    	List<MonthlyReward> rewardsSummary = rewardTemplate.query(customeRewardSelect + customerRewardFrom + customerRewardWhereId + customerRewardGroupBy ,
    			(resultSet, i) -> {
    				return getRewardSummary(resultSet);
    			}, customerId);
        return rewardsSummary;
    }
    
    @Override
    public List<MonthlyReward> getCustomerReward(String customerName) {
    	List<MonthlyReward> rewardsSummary = rewardTemplate.query(customeRewardSelect + customerRewardFrom + customerRewardWhereName + customerRewardGroupBy ,
    			(resultSet, i) -> {
    				return getRewardSummary(resultSet);
    			}, customerName);
        return rewardsSummary;
    }

    @Override
    public List<MonthlyReward> getCustomerReward() {
    	List<MonthlyReward> rewardsSummary = rewardTemplate.query(customeRewardSelect + customerRewardFrom + customerRewardWhereAll + customerRewardGroupBy ,
    			(resultSet, i) -> {
    				return getRewardSummary(resultSet);
    			});
        return rewardsSummary;
    }

    private MonthlyReward getRewardSummary(ResultSet resultSet) throws SQLException {
    	MonthlyReward monthlyReward = new MonthlyReward();
    	monthlyReward.setCustomerName(resultSet.getString("NAME"));
    	monthlyReward.setRewardMonth(resultSet.getString("month"));
    	monthlyReward.setMonthlyRewardPoints(resultSet.getInt("rewardpoints"));
        return monthlyReward;
    }
}
