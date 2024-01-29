package com.example.mvvmrequestislamicloantask.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoanViewModel: ViewModel() {
    var amountOfLoan by mutableStateOf(0)
        private set
    var periodOfLoan by mutableStateOf(0)
        private set
    var monthlyInstallmentOfLoan by mutableStateOf(0.0)
        private set

    fun calculateMonthlyInstallment(amountOfLoan: Double, periodOfLoan: Int) {
        monthlyInstallmentOfLoan = amountOfLoan / periodOfLoan
    }
    fun LoanViewModel.calculateLoanPeriod(salary:Double){
        monthlyInstallmentOfLoan = 0.4 *salary

        periodOfLoan = amountOfLoan/monthlyInstallmentOfLoan.toInt()

    }
}