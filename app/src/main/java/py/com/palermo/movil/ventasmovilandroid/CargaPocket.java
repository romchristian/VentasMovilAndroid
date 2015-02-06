package py.com.palermo.movil.ventasmovilandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class CargaPocket extends ActionBarActivity implements View.OnClickListener {
    private Button btnIniciarCarga, btnCancelar;
    private ImageView imgCheckConf, imgCheckClientes, imgCheckProductos, imgCheckVisitas, imgCheckDatosCobro, imgCheckPendientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_pocket);
        btnIniciarCarga = (Button) findViewById(R.id.btnIniciarCarga);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        imgCheckConf = (ImageView)findViewById(R.id.checkConf);
        imgCheckClientes = (ImageView)findViewById(R.id.checkClientes);
        imgCheckProductos = (ImageView)findViewById(R.id.checkProductos);
        imgCheckVisitas = (ImageView)findViewById(R.id.checkVisitas);
        imgCheckDatosCobro =(ImageView) findViewById(R.id.checkDatosCobro);
        imgCheckPendientes = (ImageView) findViewById(R.id.checkPendientes);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_carga_pocket, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        //switch (view.getId())
    }
}
