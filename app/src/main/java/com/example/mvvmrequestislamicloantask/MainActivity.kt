package com.example.mvvmrequestislamicloantask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvmrequestislamicloantask.ViewModel.LoanViewModel
import com.example.mvvmrequestislamicloantask.composables.LoanCalculatorAmount
import com.example.mvvmrequestislamicloantask.ui.theme.MVVMRequestIslamicLoanTaskTheme

class MainActivity : ComponentActivity() {
    val viewModel by viewModels<LoanViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MVVMRequestIslamicLoanTaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {

                        LoanCalculatorAmount(viewModel = viewModel)

                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MVVMRequestIslamicLoanTaskTheme {
        Greeting("Android")
    }
}