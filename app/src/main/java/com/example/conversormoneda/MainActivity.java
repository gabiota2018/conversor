package com.example.conversormoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton rdEurosDolares;
    private RadioButton rdDolaresEuros;
    private EditText etDolares;
    private EditText etEuros;
    private TextView respuesta;

    static final double valorEuro = 0.91;// 0.91 euros son 1 dólar
    static final double valorDolar = 1.1; //1.1 dólares  son 1 euro

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdEurosDolares=findViewById(R.id.rdEuroDolar);
        rdDolaresEuros=findViewById(R.id.rdDolarEuro);
        etDolares=findViewById(R.id.etDolares);
        etEuros=findViewById(R.id.etEuros);
        respuesta=findViewById(R.id.tvRespuesta);
    }
    public  void cambio(View v){
        double total=0;
        double monto=0;
        String cantidad,resultado=" ";
        if(rdDolaresEuros.isChecked()==true){
            cantidad=etDolares.getText().toString();
            monto=Double.parseDouble(cantidad);
            total=monto*valorEuro;
            resultado=String.valueOf(total);


        }
        else if(rdEurosDolares.isChecked()==true){
            cantidad=etEuros.getText().toString();
            monto=Double.parseDouble(cantidad);
            total=monto*valorDolar;
            resultado=String.valueOf(total);

        }

        respuesta.setText(resultado);
    }
 public void activarEuro(View v){
        etEuros.setEnabled(true);
        etDolares.setEnabled(false);
        etDolares.setText("");
        respuesta.setText("");

 }
    public void activarDolar(View v){
        etEuros.setEnabled(false);
        etDolares.setEnabled(true);
        etEuros.setText("");
        respuesta.setText("");
    }

}
