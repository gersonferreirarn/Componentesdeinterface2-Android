package br.com.caicosoft.componentesdeinterface2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    Switch swLigadoDesligado;
    ToggleButton tbLigadoDesligado;
    CheckBox cbLigadoDesligado;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);
        swLigadoDesligado = findViewById(R.id.swLigadoDesligado);
        tbLigadoDesligado = findViewById(R.id.tbLigadoDesligado);
        cbLigadoDesligado = findViewById(R.id.cbLigadoDesligado);
        tvResultado = findViewById(R.id.tvResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviar();
            }
        });
    }

    public void enviar(){
        if(swLigadoDesligado.isChecked()){
            tvResultado.setText("Switch ligado!");
        }else{
            tvResultado.setText("Switch desligado!");
        }
    }
}
