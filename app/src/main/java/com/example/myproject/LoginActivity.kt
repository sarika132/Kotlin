package com.example.myproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myproject.ui.theme.MyProjectTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { paddingValues ->
                LoginActivity(paddingValues)
            }

        }
    }
}

@Composable
fun LoginActivity(paddingValues: PaddingValues){


    var email by remember{ mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    var  rememberme by remember { mutableStateOf(false) }
    var forgetPassword by remember { mutableStateOf(false) }


    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(R.drawable.login),
            contentDescription = null
        )

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            placeholder = {
                Text(text = "enter your email")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                focusedIndicatorColor = Color.Green,
                unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                unfocusedIndicatorColor = Color.Blue
            ),
            shape = RoundedCornerShape(12.dp),
            prefix = {
                Icon(Icons.Default.Email, contentDescription = null)
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )


        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            placeholder = {
                Text(text = "Enter email")
            },
//            minLines = 4,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                focusedIndicatorColor = Color.Green,
                unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                unfocusedIndicatorColor = Color.Blue
            ),
            shape = RoundedCornerShape(12.dp),
            prefix = {
                Icon(Icons.Default.Email, contentDescription = null)
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )


        Row(
            modifier = Modifier.padding(horizontal = 12.dp).fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    checkmarkColor = Color.White
                ),
                checked = rememberme,
                onCheckedChange = {
                    rememberme = it
                }

            )
            Text(text = "Remember me")

            Text(text = "forget password")}

        }


        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Button(
                onClick = {
                    //todo when button clicked
                },
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White)
            ) {
                Text(text = "Login")
            }

        }
       Text(text = "New User? Register Now",style = TextStyle(
           fontWeight = FontWeight.Bold, color = androidx.compose.ui.graphics.Color.Companion.Blue ))

        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Image(
                painter = painterResource(R.drawable.eye1),
                contentDescription = null
            )

        }
    }
}

@Preview
@Composable
fun PreviewLogin(){
    LoginActivity(paddingValues = PaddingValues(0.dp))
}