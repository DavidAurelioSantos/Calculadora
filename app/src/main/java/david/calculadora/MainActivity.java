package david.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numeral = (EditText) findViewById(R.id.numeral);

        Button bC = (Button) findViewById(R.id.bC);
        Button binverso = (Button) findViewById(R.id.binverso);
        Button bpercente = (Button) findViewById(R.id.bpercente);
        Button bdivide = (Button) findViewById(R.id.bdivide);
        Button b7 = (Button) findViewById(R.id.b7);
        Button b8 = (Button) findViewById(R.id.b8);
        Button b9 = (Button) findViewById(R.id.b9);

        b7.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                int resultado = Integer.parseInt("7".toString());
                String convertido = String.valueOf(resultado);
                numeral.setText(convertido);
            }
        });

        b8.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View view) {
                int resultado = Integer.parseInt("8".toString());
                String convertido = String.valueOf(resultado);
                numeral.setText(convertido);
            }
        });
    }
}
