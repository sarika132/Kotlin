package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class ClassworkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Scaffold {innerPadding->
                CardScreen(innerPadding)


            }
        }

    }
}


@Composable
fun CardScreen(innerPadding:PaddingValues){
    Column(modifier=
        Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .fillMaxSize().background(color = Color.Cyan)
    ) {
        Row(
            modifier = Modifier
                .padding(start = 19.dp, top = 19.dp, end = 19.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        )
        {
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .clip(shape = RoundedCornerShape(80.dp))
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 17.dp),
        ) {
            Text(
                text = "Card", style =
                    TextStyle(
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold, color = Color.White,
                        fontStyle = FontStyle.Normal
                    )
            )
            Text(
                "Simple and easy to use app", style = TextStyle(
                    fontWeight = FontWeight.SemiBold, color = Color.White
                )
            )
        }
        Row (
            modifier = Modifier
                .padding(start = 17.dp, top = 40.dp, end = 2.dp, bottom = 2.dp),
        ) {
            //First Card
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.White)
                    .width(160.dp)
                    .height(160.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.text),
                        contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                    )
                    Text(
                        text = "Text", style = TextStyle(
                            fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                        )
                    )
                    Text(text = "@ Click to Enter", color = Color.Gray)
                }

            }
            Spacer(modifier = Modifier.width(35.dp))

                // Second Card
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.White)
                    .width(160.dp)
                    .height(160.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.addresh),
                            contentDescription = null,
                            modifier = Modifier
                                .height(60.dp)
                                .width(60.dp)
                        )
                        Text(
                            text = "Addresh", style = TextStyle(
                                fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                            )
                        )
                        Text(text = "@ Click to Enter", color = Color.Gray)
                    }

                }

            }
        Row (
            modifier = Modifier
                .padding(start = 17.dp, top = 25.dp, end = 2.dp, bottom = 2.dp),
        ) {
            //Third Card
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.White)
                    .width(160.dp)
                    .height(160.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.character),
                        contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                    )
                    Text(
                        text = "Character", style = TextStyle(
                            fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                        )
                    )
                    Text(text = "@ Click to Enter", color = Color.Gray)
                }

            }
            Spacer(modifier = Modifier.width(35.dp))

            // Forth Card
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.White)
                    .width(160.dp)
                    .height(160.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.bankcard),
                        contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                    )
                    Text(
                        text = "Bank Card", style = TextStyle(
                            fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                        )
                    )
                    Text(text = "@ Click to Enter", color = Color.Gray)
                }

            }

        }
        Row (
            modifier = Modifier
                .padding(start = 17.dp, top = 25.dp, end = 2.dp, bottom = 2.dp),
        ) {
            //Fifth Card
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.White)
                    .width(160.dp)
                    .height(160.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.password),
                        contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                    )
                    Text(
                        text = "Password", style = TextStyle(
                            fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                        )
                    )
                    Text(text = "@ Click to Enter", color = Color.Gray)
                }

            }
            Spacer(modifier = Modifier.width(35.dp))

            // Sixth Card
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color.White)
                    .width(160.dp)
                    .height(160.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.logistics),
                        contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                    )
                    Text(
                        text = "Logistics", style = TextStyle(
                            fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                        )
                    )
                    Text(text = "@ Click to Enter", color = Color.Gray)
                }
            }
        }

        Row (
            modifier = Modifier
                .padding(start = 17.dp, top = 25.dp, end = 2.dp, bottom = 2.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.White)
                    .width(360.dp)
                    .height(70.dp)

            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 20.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null,
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(text = " Settings",style = TextStyle(
                        fontWeight = FontWeight.SemiBold, fontSize = 20.sp))
                }
            }
        }

        }
    }

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    CardScreen(innerPadding = PaddingValues(0.dp))
}

