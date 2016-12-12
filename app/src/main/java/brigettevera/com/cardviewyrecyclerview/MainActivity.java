package brigettevera.com.cardviewyrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List <Los_Simpson> arrayDatos;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarDatos();
        inicializarRecycler();
    }

    private void inicializarRecycler() {
        rv = (RecyclerView) findViewById(R.id.rview);
        final RecyclerView.LayoutManager layoutManager;

        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);

        AdaptadorSimpson adaptador = new AdaptadorSimpson(arrayDatos);

        rv.setAdapter(adaptador);
        rv.setHasFixedSize(true);
    }

    private void inicializarDatos() {
        arrayDatos = new ArrayList<>();
        arrayDatos.add(new Los_Simpson(getResources().getString(R.string.tituloHomero), getResources().getString(R.string.textHomero), R.drawable.homerosimpson));
        arrayDatos.add(new Los_Simpson(getResources().getString(R.string.tituloMarge), getResources().getString(R.string.textMarge), R.drawable.margesimpson));
        arrayDatos.add(new Los_Simpson(getResources().getString(R.string.tituloBart), getResources().getString(R.string.textBart), R.drawable.bartsimpson));
        arrayDatos.add(new Los_Simpson(getResources().getString(R.string.tituloLisa), getResources().getString(R.string.textLisa), R.drawable.lisasimpson));
        arrayDatos.add(new Los_Simpson(getResources().getString(R.string.tituloMaggie), getResources().getString(R.string.textMaggie), R.drawable.maggiesimpson));
    }

}
