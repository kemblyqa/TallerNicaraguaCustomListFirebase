package com.example.override.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.override.listviewpersonalizado.Base.ListData;

public class Agregar extends AppCompatActivity {
    EditText etNombre, etDescripcion, etPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        etNombre = findViewById(R.id.etProducto);
        etDescripcion = findViewById(R.id.etDescripcion);
        etPrecio = findViewById(R.id.etPrecio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.GuardarProducto) {
            finish();
        }
        if (item.getItemId() == R.id.Cancelar) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
