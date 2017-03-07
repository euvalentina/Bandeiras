package fiap.com.br.bandeiras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Selecione extends AppCompatActivity {

    Spinner spinner;
    ImageView imagem;

    String[] pais = {"argentina", "brasil", "franca", "japao" };

    int[] fotos = {
            R.drawable.argentina,
            R.drawable.brasil,
            R.drawable.franca,
            R.drawable.japao
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecione);

        spinner = (Spinner)findViewById(R.id.spinner);
        imagem = (ImageView)findViewById(R.id.imagem);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, pais);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imagem.setImageResource(fotos[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }



}
