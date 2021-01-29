package es.studium.dosactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBoton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        btnBoton2= findViewById(R.id.btnVolver);
        btnBoton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        setContentView(R.layout.activity_main);
    }
}