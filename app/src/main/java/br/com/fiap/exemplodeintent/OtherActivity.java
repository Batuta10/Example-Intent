package br.com.fiap.exemplodeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent it = getIntent();

        Pessoa p = (Pessoa)it.getSerializableExtra("pessoa");

        //String nome = it.getStringExtra("nome");
        //int idade = it.getIntExtra("idade",0);
        //boolean deficiente = it.getBooleanExtra("deficiente",false);


        TextView txtNome = (TextView) findViewById(R.id.txtNome);
        txtNome.setText("Nome: " + p.getNome());

        TextView txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtIdade.setText("Idade: " + p.getIdade());

        TextView txtSalario = (TextView) findViewById(R.id.txtSalario);
        txtSalario.setText("Salario: " + p.getSalario());

        //Boliano
        String ifDefeciente = (p.isdeficiente())? "A pessoa possui deficiêcia":"A pessoa não possui deficiencia";
        TextView txtDeficiente = (TextView) findViewById(R.id.txtDeficiente);
        txtDeficiente.setText(ifDefeciente);
    }//OnCreate

}//Main Class