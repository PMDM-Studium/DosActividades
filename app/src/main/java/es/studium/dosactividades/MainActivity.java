package es.studium.dosactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
Button btnBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoton= findViewById(R.id.miBoton);
        btnBoton.setOnClickListener(this);
    }
    @Override
    public void onclick(View v)
    {
        setContentView(R.layout.activity_secondary);
    }
}