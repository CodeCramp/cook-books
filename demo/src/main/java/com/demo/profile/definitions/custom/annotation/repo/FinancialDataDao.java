package com.demo.profile.definitions.custom.annotation.repo;

import com.demo.profile.definitions.custom.annotation.beans.FinancialMonthSummary;
import com.demo.profile.definitions.custom.annotation.beans.FinancialQuarterSummary;
import com.demo.profile.definitions.custom.annotation.beans.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}