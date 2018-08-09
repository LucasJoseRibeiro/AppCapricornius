package com.capricornius.aplicativo.capricornius;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
    }

    public void SaidaAnimais(View view) {
        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        try {
            FileWriter writer = new FileWriter(path.getPath().toString() + "/saidadeanimais.csv");

            writer.append("Registro");
            writer.append(',');
            writer.append("Data Saída");
            writer.append(',');
            writer.append("Motivo");
            writer.append(',');
            writer.append("Causa");
            writer.append(',');
            writer.append("Descrição");
            writer.append('\n');

            writer.append("4580");
            writer.append(',');
            writer.append("25/07/2018");
            writer.append(',');
            writer.append("Morte");
            writer.append(',');
            writer.append("Idade");
            writer.append(',');
            writer.append("Informe uma descrição");
            writer.append('\n');

            writer.append("4581");
            writer.append(',');
            writer.append("26/07/2018");
            writer.append(',');
            writer.append("Morte");
            writer.append(',');
            writer.append("Idade");
            writer.append(',');
            writer.append("Informe uma descrição");
            writer.append('\n');
            //generate whatever data you want

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Ficha de Saída de animais salva em Downloads", Toast.LENGTH_LONG).show();
    }

    public void Desmama(View view) {

    }

    public void OcorrenciasDiversas(View view) {
        Intent it = new Intent(this, FichaOcorrenciasDiversas.class);
        startActivity(it);
    }

    public void PesagemAnimal(View view) {

    }

    public void EscoreCorporal(View view) {

    }

    public void PesagemLeite(View view) {

    }

    public void EncerramentoLactacao(View view) {

    }

    public void PartosNascimentos(View view) {

    }
}
