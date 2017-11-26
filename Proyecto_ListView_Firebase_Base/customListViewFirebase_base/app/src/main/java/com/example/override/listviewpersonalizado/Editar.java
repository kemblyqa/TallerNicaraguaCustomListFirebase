package com.example.override.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.override.listviewpersonalizado.Base.ListData;

public class Editar extends AppCompatActivity {
    EditText etNombre, etDescripcion, etPrecio;
    Bundle bundle;
    String oldName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        etNombre = findViewById(R.id.etProducto);
        etDescripcion = findViewById(R.id.etDescripcion);
        etPrecio = findViewById(R.id.etPrecio);

        bundle = getIntent().getExtras();
        oldName = bundle.getString("nombre");

        etNombre.setText("");
        etDescripcion.setText("");
        etPrecio.setText("");
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
