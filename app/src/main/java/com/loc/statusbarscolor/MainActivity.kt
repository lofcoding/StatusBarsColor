package com.loc.statusbarscolor

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import com.loc.statusbarscolor.ui.theme.StatusBarsColorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatusBarsColorTheme {
                val window = (LocalContext.current as Activity).window
                val view = LocalView.current
                Button(
                    onClick = {
                        changeSystemBarsColor(
                            window = window,
                            view = view,
                            statusBarColor = Color.Green,
                            navigationBarColor = Color.Yellow,
                            isLightIcons = false
                        )
                    }) {
                    Text(text = "Change bars color")
                }
            }
        }
    }
}