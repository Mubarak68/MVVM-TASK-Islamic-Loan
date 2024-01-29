package com.example.mvvmrequestislamicloantask.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.mvvmrequestislamicloantask.ViewModel.LoanViewModel

@Composable
fun LoanCalculatorAmount(viewModel: LoanViewModel) {
    var amountOfLoan by remember { mutableStateOf(0.0) }
    var periodOfLoan by remember {mutableStateOf(0)}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {

        OutlinedTextField(value = amountOfLoan.toString(),
            onValueChange = { amountOfLoan = it.toDoubleOrNull() ?: 0.0 },
            label = { Text(text = "Amount of loan") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number))
        OutlinedTextField(value = periodOfLoan.toString(),
            onValueChange = { periodOfLoan = it.toIntOrNull() ?: 0 },
            label = { Text(text = "Period of loan in months") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        Button(onClick = { viewModel.calculateMonthlyInstallment(amountOfLoan,periodOfLoan) })

        {
            Text("Calculate the monthly installment")
        }
        Text("Monthly Installment: ${viewModel.monthlyInstallmentOfLoan}")
        }
    }
