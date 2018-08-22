package br.ufjf.dcc196.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView labelSaida;
    private Button btnJuntar;
    private EditText txtNome;
    private EditText txtSobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelSaida = (TextView) findViewById(R.id.lbl_saida);
        btnJuntar = (Button) findViewById(R.id.btn_juntar);
        txtNome = (EditText) findViewById(R.id.txt_nome);
        txtSobrenome = (EditText) findViewById(R.id.txt_sobrenome);
        btnJuntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelSaida.setText(txtNome.getText() + " " + txtSobrenome.getText());
            }
        });
    }
}
