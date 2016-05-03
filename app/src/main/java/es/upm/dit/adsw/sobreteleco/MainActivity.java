package es.upm.dit.adsw.sobreteleco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private boolean swap = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.button);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Click en botón");
                // Ejecuto algo

                Toast.makeText(getBaseContext(),
                               "La Escuela decana de Ingeniería de Telecomunicación",
                               Toast.LENGTH_SHORT).show();

                if (swap) {
                    image.setImageResource(R.drawable.etsit_b);
                } else {
                    image.setImageResource(R.drawable.etsit_a);
                }
                swap = !swap;
            }
        });
    }
}



