package com.devstation.loginui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devstation.loginui.ui.theme.OpenSans
import com.devstation.loginui.ui.theme.primary
import com.devstation.loginui.ui.theme.primary_lite
import com.devstation.loginui.view.CheckBoxWithLabel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph(start = true)
@Destination
@Composable
fun LoginUI() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.Start)
        )

        Text(
            text = "Login",
            color = Color.Black,
            fontWeight = FontWeight.Normal,
            fontSize = 40.sp,
            fontFamily = OpenSans,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 50.dp)
        )

        Text(
            text = stringResource(id = R.string.login_msg),
            color = Color.Black,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            fontFamily = OpenSans,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 40.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "Email", fontFamily = OpenSans, color = Color.Black)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_email_24) ,
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = primary
                )
            }
        )

        OutlinedTextField(
            value = "Password",
            onValueChange = {},
            placeholder = {
                Text(text = "Email", fontFamily = OpenSans, color = Color.Black)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_lock_24) ,
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = primary
                )
            }
        )

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            
            CheckBoxWithLabel(
                checked = false,
                label = "Remember Me",
            )

            Text(
                text = "Forget Password ?",
                color = primary_lite,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                fontFamily = OpenSans,
            )
        }

        Card(
            backgroundColor = primary,
            shape = RoundedCornerShape(46.dp),
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(80.dp)
                .padding(top = 50.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    fontFamily = OpenSans,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(10.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewLoginUI() {
    LoginUI()
}

