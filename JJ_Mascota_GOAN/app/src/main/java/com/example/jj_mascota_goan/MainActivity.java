package com.example.jj_mascota_goan;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class Main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button btnRescatista = findViewById(R.id.button);
        btnRescatista.setOnClickListener(v -> {
            Intent intent = new Intent(Main_activity.this, Main_activity.class);
            startActivity(intent);
        });
        Button btnTutorAdoptante = findViewById(R.id.button2);
        btnTutorAdoptante.setOnClickListener(v -> {
            Intent intent = new Intent(Main_activity.this, Main_activity.class);
            startActivity(intent);
        });
        Button btnHogarTemporal = findViewById(R.id.button3);
        btnRescatista.setOnClickListener(v -> {
            Intent intent = new Intent(Main_activity.this, Main_activity.class);
            startActivity(intent);
        });
    }
}
