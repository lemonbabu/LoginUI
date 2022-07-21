package com.devstation.loginui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.devstation.loginui.destinations.LoginUIDestination
import com.devstation.loginui.ui.theme.LoginUITheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginUITheme {
                DestinationsNavHost(
                    navGraph = NavGraphs.root,
                    startRoute = LoginUIDestination
                )
            }
        }
    }
}
