package com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.adaptadores.ArticulosAdapter;
import com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.modelos.Articulo;
import com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.modelos.Articulos;

public class MainActivity extends AppCompatActivity {
    // https://www.youtube.com/watch?v=Mne2SrtySME

    /**
     * <p>Pasos para utilizar un RecyclerView:</p>
     * <ol>
     *     <li>Diseñamos nuestras clase modelos en Java. En este ejemplo: Articulo, Articulos</li>
     *     <li>Añadimos el RecyclerView a la actividad. Lo llamamos recyclerView</li>
     *     <li>Definimos un layout para representar cada Row del recyclerview. En nuestro ejemplo
     *     rec_row_articulos</li>
     *     <li>Ahora lo dificil. Crear el adaptador</li>
     *     <ol>
     *         <li>Creamos la clase NombreModeloAdapter: ej ArticulosAdapter</li>
     *         <li>Creamos las propiedades que necesitamos: la lista de los datos y el manejador de
     *         evento</li>
     *         <li>Creamos el constructor del adaptador</li>
     *         <li>Dentro de la clase creamos una subclase Holder que hereda de RecyclerView.ViewHolder</li>
     *         <li>Ahora heredamos de RecyclerView.Adapter&lt;ArticulosAdapter.myholderView&gt; e
     *         implementamos todos sus métodos</li>
     *     </ol>
     *     <li> En la activity</li>
     *     <ol>
     *         <li>Cargamos los datos que le vamos a pasar al adapter. En nuestro caso la lista de
     *         artículos</li>
     *         <li>Capturamos el recyclerView</li>
     *         <li>Definimos el LayoutManager y se lo asociamos al recyclerView</li>
     *         <li>Instanciamos el adaptador, definimos a la vez el evento onItemClick</li>
     *         <li>Asociamos el adaptador al recyclerView</li>
     *     </ol>
     * </ol>
     */

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturamos el recyclerView del layout
        recyclerView = findViewById(R.id.recyclerView);

        // Creamos un layoutManager tipo líneas pero puede ser de otros tipo.
        // Asociamos el LayoutManager al recyclerView
        LinearLayoutManager lmg = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(lmg);

        /*
        // Creamos un layoutManager tipo Grid de 2 columnas pero puede ser de otros tipo.
        // Habría que adaptar el rec_row_articulos.xml para que se vea bien.
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(glm);
         */

        // Cargamos en memoria los datos que vamos a representar en el recyclerView
        Articulos articulos = new Articulos();
        articulos.cargar();

        // Instanciamos el adaptador y le pasamos los datos y el evento onItemClick
        ArticulosAdapter.OnItemClickListener listener = new ArticulosAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Articulo item) {
                Toast.makeText(getApplicationContext(), item.getNombre(), Toast.LENGTH_SHORT).show(); //
            }
        };

        // Creamos el adaptador, le pasamos los datos e implementamos el itemClick
        ArticulosAdapter myAdapter = new ArticulosAdapter(articulos.getLista(), listener);

        // Asociamos el adaptador al recycler
        recyclerView.setAdapter(myAdapter);
    }
}