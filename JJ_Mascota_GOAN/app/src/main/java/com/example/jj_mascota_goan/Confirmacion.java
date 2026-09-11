package com.example.jj_mascota_goan;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Confirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion);

        TextView txtNombre = findViewById(R.id.txtNombre);
        Button txtMostrar = findViewById(R.id.btnMostrar);

        Intent intentRecibido= getIntent();
        String nombre = intentRecibido.getStringExtra("NOMBRE_MASCOTA");
        String Mostrar = intentRecibido.getStringExtra("MOSTRAR_MASCOTA");

        txtNombre.setText(nombre);
        txtMostrar.setText(Mostrar);

       txtMostrar.setOnClickListener(v -> {
            Intent intent = new Intent(Confirmacion.this, Confirmacion.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        });
    }
}