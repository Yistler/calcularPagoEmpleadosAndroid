package com.example.evaluacion1calcularhonorarios

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import employee.EmpleadoRegular

class PantallaRegularActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pantalla_regular)

        val btnVolver = findViewById<Button>(R.id.btnVolver)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            val resultado = findViewById<TextView>(R.id.txtResultado)
            val montoBruto = findViewById<EditText>(R.id.txtMonto)

            val m = montoBruto.text.toString().toDoubleOrNull() ?: 0

            val empleado = EmpleadoRegular(m.toDouble())
            val monto = empleado.calcularLiquito()

            resultado.text = "El monto es ${monto}"

        }

    }
    fun volverAtras(view:View){
        finish()
    }
}
