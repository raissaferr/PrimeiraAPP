package kessia.raissa.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { //representa a tela principal, gere o comportamento da tela principal

    @Override   protected void onCreate(Bundle savedInstanceState) { //o método onCreate é chamado pelo sistema operacional do android toda vez que a tela está sendo criada. É chamado automaticamente. Ele cria classes automaticamente, basicamente preenchemos funções que o sistema operacional vai chamar.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constrói a interface gráfica da tela baseada na xml criada anteriormente

        Button btnEnviar = findViewById(R.id.btn_enviar); //obtém o botão enviar. Cada elemento de interface que criamos no arquivo xml tem um id, que nos permite acessar esses elementos de interface aqui no código java.
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override //configurando o botão
            public void onClick(View v) { //'v' é o botão, quando ele for clicado irá chamar o método onclick
                //exemplos em sala:
                //Button b = (Button) v;
                //float a = 1.5f;
                //int b =(int) a;

                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui); //pega a caixa de texto que foi criada e guarda na variável et_digite_aqui
                String textoDigitado = etDigiteAqui.getText().toString(); //obtendo o texto que está contido na caixa de texto

                Intent i = new Intent(MainActivity.this, NextActivity.class);

                i.putExtra("texto", textoDigitado);

                startActivity(i);

            }
        });
    }
}
// bla bla bla bla bla bla bla