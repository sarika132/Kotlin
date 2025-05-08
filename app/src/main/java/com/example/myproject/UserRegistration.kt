package com.example.myproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue
import android.app.DatePickerDialog
import androidx.compose.foundation.layout.width
import java.util.Calendar
import com.example.myproject.ui.theme.MyProjectTheme

class UserRegistration : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Scaffold{ paddingValues ->
                    UserRegistration(paddingValues)
                }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserRegistration(paddingValues: PaddingValues){
    var firstName by remember{ mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var selectedCountry by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val countries = listOf("Nepal", "India", "USA", "China")
    var dob by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var acceptedTerms by remember { mutableStateOf(false) }
    val calendar = Calendar.getInstance()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("Register", style = MaterialTheme.typography.titleLarge)

        Spacer(Modifier.width(16.dp))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)){
            OutlinedTextField(
            value = firstName,
            onValueChange = {
                firstName = it
            },
                label = { Text("First Name") }

        )
            OutlinedTextField(
                value = lastName,
                onValueChange = { lastName = it },
                label = { Text("Last Name") }
            )
        }

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(Modifier.height(8.dp))

        ExposedDropdownMenuBox  (
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            OutlinedTextField(
                value = selectedCountry,
                onValueChange = {},
                readOnly = true,
                label = { Text("Select Country") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
                modifier = Modifier.fillMaxWidth()
            )
            ExposedDropdownMenu (
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                countries.forEach { country ->
                    DropdownMenuItem(
                        text = { Text(country) },
                        onClick = {
                            selectedCountry = country
                            expanded = false
                        }
                    )
                }
            }
        }

        Spacer(Modifier.height(8.dp))


        OutlinedTextField(
            value = dob,
            onValueChange = {},
            readOnly = true,
            label = { Text("DOB") },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = "Select DOB",
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(8.dp))

        Text("Gender")
        Row(verticalAlignment = Alignment.CenterVertically) {
            listOf("Male", "Female", "Other").forEach { label ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    RadioButton(
                        selected = gender == label,
                        onClick = { gender = label }
                    )
                    Text(label)
                }
            }
        }

        Spacer(Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = acceptedTerms,
                onCheckedChange = { acceptedTerms = it }
            )
            Text("I accept terms and conditions")
        }

        Spacer(Modifier.height(16.dp))

        Button (
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Already have an account? Sign In",
            color = Color.Blue,
            modifier = Modifier.clickable {  }
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRegistration() {
    UserRegistration(paddingValues = PaddingValues(0.dp))
}