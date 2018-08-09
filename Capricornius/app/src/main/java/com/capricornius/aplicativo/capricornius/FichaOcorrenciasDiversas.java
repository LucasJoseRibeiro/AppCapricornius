package com.capricornius.aplicativo.capricornius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FichaOcorrenciasDiversas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_ocorrencias_diversas);
    }

    public void salvarContinuar(View view) {
        //função para validação da data
        //o metodo setLenient diz que a String não pode conter nenhum erro
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);

        EditText ODregistro = findViewById(R.id.ODedtRegistro);
        EditText ODdata = findViewById(R.id.ODedtData);
        EditText ODdescricao = findViewById(R.id.ODedtDescricao);

        //caso a data seja inválida, será lançada uma exception. Toda operação deverá ser feita dentro do try.
        try {
            Date data = simpleDateFormat.parse(ODdata.getText().toString());

            Intent it = new Intent(this, FichaOcorrenciasDiversas.class);
            startActivity(it);
            finish();
            Toast.makeText(this, "Ficha salva com sucesso!",Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this, "Formato e/ou data inválido(s)!",Toast.LENGTH_SHORT).show();
        }
    }

    public void salvarVoltar(View view) {
        finish();
        Toast.makeText(this, "Ficha salva com sucesso!",Toast.LENGTH_SHORT).show();
    }
}
