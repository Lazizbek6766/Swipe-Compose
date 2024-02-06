package com.example.myapplicationpay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationpay.ui.theme.MyApplicationpayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationpayTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var isExpanded by remember {
                        mutableStateOf(false)
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        SwipeActionsRight(
                            modifier = Modifier
                                .fillMaxWidth(0.95f)
                                .height(100.dp),
                            numberOfActions = 1,
                            isExpanded = isExpanded,
                            onChangedCard = { isExpanded = it },
                            actionOneImage = Icons.Default.Share,
                            actionOneColor = Color(0xFF005EFF)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .padding(15.dp),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.SpaceAround
                                ) {
                                    Text(
                                        text = "Swipe to share",
                                        color = Color.Black,
                                        fontSize = 18.sp,
                                    )

                                }

                            }
                        }

                        SwipeActionsRight(
                            modifier = Modifier
                                .fillMaxWidth(0.95f)
                                .height(100.dp),
                            itemWidth = 200.dp,
                            isExpanded = isExpanded,
                            actionOneImage = Icons.Default.Share,
                            actionTwoImage = Icons.Default.ThumbUp,
                            onChangedCard = { isExpanded = it }) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .padding(15.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.SpaceAround
                                ) {
                                    Text(
                                        text = "Swipe Actions",
                                        color = Color.Black,
                                        fontSize = 18.sp
                                    )

                                    Text(
                                        text = "For more options, swipe the card",
                                        color = Color.Black,
                                        fontSize = 16.sp
                                    )
                                }

                                Icon(
                                    imageVector = Icons.Default.ThumbUp, contentDescription = null,
                                    modifier = Modifier.fillMaxHeight(), tint = Color.Gray
                                )

                            }
                        }
                    }
                }
            }
        }
    }
}