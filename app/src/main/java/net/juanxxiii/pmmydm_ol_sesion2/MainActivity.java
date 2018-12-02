package net.juanxxiii.pmmydm_ol_sesion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void agregar(View v){
        String email = ((EditText)findViewById(R.id.etEmail)).getText().toString();
        String password = ((EditText)findViewById(R.id.etPassword)).getText().toString();
        BBDDContactos bbddC = new BBDDContactos(this);
        bbddC.addContacto(email, password);
    }
    public void consultar(View v){
        BBDDContactos bbddC = new BBDDContactos(this);
        bbddC.consultarContactos();
    }
}
