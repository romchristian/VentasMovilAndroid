package py.com.palermo.movil.ventasmovilandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import py.com.palermo.movil.ventasmovilandroid.response.InfoPocket;
import py.com.palermo.movil.ventasmovilandroid.response.VendedorResponse;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            vendedorRequest();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private void vendedorRequest() throws JSONException {

        InfoPocket info = new InfoPocket();
        info.setPocketId(894162902);

        final String body = new GsonBuilder().setPrettyPrinting().create().toJson(info);

        Request req = new JsonRequest<VendedorResponse>(Request.Method.POST, "http://172.16.8.95:8080/ServicioPocketAndroid/webresources/sincronizacion/vendedor", body,
                new Response.Listener<VendedorResponse>() {
                    @Override
                    public void onResponse(VendedorResponse response) {
                        Toast.makeText(getApplicationContext(), "Exito: " + response.getVendedor().getVendedorNombre() +"   "+ new Date(response.getVendedor().getVendedorFechaCarga()), Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error al insertar " + error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }) {

            @Override
            protected Response<VendedorResponse> parseNetworkResponse(NetworkResponse response) {
                String jsonString = null;
                try {
                    jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));

                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                VendedorResponse resp = new GsonBuilder().create().fromJson(jsonString, VendedorResponse.class);
                Response<VendedorResponse> result = Response.success(resp, HttpHeaderParser.parseCacheHeaders(response));
                return result;
            }
        };
        AppController.getInstance().addToRequestQueue(req);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

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
}
