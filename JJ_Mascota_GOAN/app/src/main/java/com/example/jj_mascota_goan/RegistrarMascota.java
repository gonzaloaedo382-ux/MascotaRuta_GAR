package com.example.jj_mascota_goan;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroMascota extends AppCompatActivity {
    private EditText editNombre;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registromascota);
        editNombre = findViewById(R.id.editNombre);
        radioGroup = findViewById(R.id.Registrar);
        Button btnRegistrar = findViewById(R.id.btnMostrar);

        btnRegistrar.setOnClickListener(v -> {
            String nombre = editNombre.getText().toString();
            int idSeleccionado = radioGroup.getCheckedRadioButtonId();

            if (nombre.isEmpty()) {
                editNombre.setError("El nombre no puede estar vacío");
            } else if (idSeleccionado == -1) {
            } else {
                RadioButton rb = findViewById(idSeleccionado);
                String categoria = rb.getText().toString();

                Intent intent = new Intent(RegistroMascota.this, RegistroMascota.class);
                intent.putExtra("NOMBRE_MASCOTA", nombre);
                intent.putExtra("CATEGORIA_MASCOTA", categoria);
                startActivity(intent);
            }
        });
    }
}

