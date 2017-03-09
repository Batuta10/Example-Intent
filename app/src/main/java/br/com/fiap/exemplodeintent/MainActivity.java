package br.com.fiap.exemplodeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    EditText edtIdade;
    EditText edtSalario;
    RadioGroup rgDeficiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtIdade = (EditText) findViewById(R.id.edtIdade);
        edtSalario = (EditText) findViewById(R.id.edtSalario);
        rgDeficiente = (RadioGroup) findViewById(R.id.rgDeficiente);

    }//OnCreate

    public void envia(View V){
        Intent it = new Intent(this,OtherActivity.class);

        Pessoa p = new Pessoa();
            p.setNome(edtNome.getText().toString());
            p.setIdade(Integer.parseInt(edtIdade.getText().toString()));
            p.setSalario(Double.parseDouble(edtSalario.getText().toString()));
            int op = rgDeficiente.getCheckedRadioButtonId();
            if (op == R.id.rbSim){
                p.setDeficiencia(true);
            }else {
                p.setDeficiencia(false);
            }
            it.putExtra("pessoa",p);

            startActivity(it);
        //it.putExtra("nome","Batuta 10");
        //it.putExtra("idade",24);
        //it.putExtra("deficiente",false);
    }//Abrir

}//Main Class