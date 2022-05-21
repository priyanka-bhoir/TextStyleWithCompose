package com.priyanka.textstylewithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.priyanka.textstylewithcompose.ui.theme.TextStyleWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val FontFamily = FontFamily(
                Font(R.font.macondo_regular, FontWeight.Thin)
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
            ) {
                Column() {
                    Text(
                        text = "The Great Priyanka",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Green,
                                    fontSize = 50.sp
                                )
                            ){
                                append("T")
                            }
                            append("he")

                            withStyle(
                                style = SpanStyle(
                                    color = Color.Green,
                                    fontSize = 50.sp
                                )
                            ){
                                append("G")
                            }
                            append("reat")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Green,
                                    fontSize = 50.sp
                                )
                            ){
                                append("P")
                            }
                            append("riyanka")
                        },
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline
                    )
                }

            }
        }
    }
}
