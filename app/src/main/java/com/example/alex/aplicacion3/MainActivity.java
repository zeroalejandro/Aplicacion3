package com.example.alex.aplicacion3;

import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador = 0;

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        if(estado!=null){
            contador=estado.getInt("posision");
            mostrarResultado();
        }



    }

    public void incrementaContador (View vista) {

        contador++;

        mostrarResultado();

    }

    public void restaContador (View vista) {

        contador--;

        mostrarResultado();
    }

    public void reseteaContador (View vista) {

        contador=0;

        mostrarResultado();
    }

    public void mostrarResultado() {


        TextView textoResultado=(TextView) findViewById(R.id.contadorPulsaciones);

        textoResultado.setText("Contador: " + contador);

    }

    @Override
    protected void onSaveInstanceState(Bundle estado) {
        super.onSaveInstanceState(estado);
        estado.putInt("posision",contador);
            }
}