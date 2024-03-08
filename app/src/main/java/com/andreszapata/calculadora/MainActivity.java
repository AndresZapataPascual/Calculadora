package com.andreszapata.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1;
    Button btnCalcular;
    TextView textViewSeno, textViewCoseno, textViewRaiz, textViewPotencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.Num1);
        btnCalcular = findViewById(R.id.btnCalcular);
        textViewSeno = findViewById(R.id.resultadoSeno);
        textViewCoseno = findViewById(R.id.resultadoCoseno);
        textViewRaiz = findViewById(R.id.resultadoRaiz);
        textViewPotencia = findViewById(R.id.resultadoPotencia);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el número ingresado por el usuario
                String num1String = editTextNum1.getText().toString();
                if (!num1String.isEmpty()) {
                    double num1 = Double.parseDouble(num1String);

                    // Calcular los resultados
                    double seno = Math.sin(num1);
                    double coseno = Math.cos(num1);
                    double raizCuadrada = Math.sqrt(num1);
                    double potencia = Math.pow(num1, 2);

                    // Imprimir los resultados en los TextViews
                    textViewSeno.setText(getString(R.string.resultadoSeno) +  String.valueOf(seno));
                    textViewCoseno.setText(getString(R.string.resultadoCoseno) + String.valueOf(coseno));
                    textViewRaiz.setText(getString(R.string.resultadoRaiz) + String.valueOf(raizCuadrada));
                    textViewPotencia.setText(getString(R.string.resultadoPotencia) + String.valueOf(potencia));
                }
            }
        });
    }
}
