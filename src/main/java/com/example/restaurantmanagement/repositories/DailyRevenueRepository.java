package com.example.restaurantmanagement.repositories;

import org.example.machineCoding.restaurentMgmtSystem.models.DailyRevenue;

import java.util.Date;
import java.util.List;

public interface DailyRevenueRepository {
    public DailyRevenue save(DailyRevenue dailyRevenue);

    public List<DailyRevenue> getDailyRevenueBetweenDates(Date startDate, Date endDate);
}
