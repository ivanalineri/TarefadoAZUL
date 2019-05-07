package br.com.digitalhouse.tarefadoazul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mCuriosidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCuriosidade = findViewById(R.id.curiosidade);
        mCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Facebook, Twitter, Tumblr, Instagram, Linked in.\n" +
                        "Todas essas redes sociais tem a cor azul em seu logo ou em suas interfaces. Assim como a marca da IBM, HP, Intel.\n" +
                        "Inconscientemente, a cor ligada a tecnologia, alivia o stress e significa inteligência, liberdade e progresso;", Toast.LENGTH_LONG).show();
            }
        });
    }
}



/*Facebook, Twitter, Tumblr, Instagram, Linked in.
Todas essas redes sociais tem a cor azul em seu logo ou em suas interfaces. Assim como a marca da IBM, HP, Intel.
Inconscientemente, a cor ligada a tecnologia, alivia o stress e significa inteligência, liberdade e progresso;*/
