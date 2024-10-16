package com.example.evaluacion1calcularhonorarios

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.evaluacion1calcularhonorarios.ui.theme.Evaluacion1CalcularHonorariosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaPrincipal()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PantallaPrincipal() {
    val PantallaBackground = Color(0xFFC4DAD2)
    val btnColor = Color(0xFF16423C)
    val txtColor = Color(0xFF16423C)

    val contexto = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PantallaBackground),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Pago de servicios",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = txtColor
            )

        )
        Spacer(modifier = Modifier.height(180.dp))
        Button(modifier = Modifier
            .width(200.dp)
            .height(80.dp), colors = ButtonDefaults.buttonColors(
            containerColor = btnColor,
            contentColor = Color.White
        ) ,onClick = {
            val intent = Intent(contexto, PantallaHonorariosActivity::class.java)
            contexto.startActivity(intent)
        }) {
            Text("EmpleadoHonorarios")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(modifier = Modifier
                .height(80.dp)
                .width(200.dp), colors = ButtonDefaults.buttonColors(
                containerColor = btnColor,
                contentColor = Color.White
            ), onClick = {
                val intent = Intent(contexto, PantallaRegularActivity::class.java)
                contexto.startActivity(intent)
            }) {
            Text("EmpleadoRegular")
        }
    }

}