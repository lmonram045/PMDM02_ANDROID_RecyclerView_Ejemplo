package com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.R;
import com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.modelos.Articulo;

import java.util.List;

/**
 * Clase para cargar los datos en el RecyclerView
 */
public class ArticulosAdapter extends RecyclerView.Adapter<ArticulosAdapter.myHolderView> {

    private final List<Articulo> datos; // Lista de datos
    private OnItemClickListener listener; // Listener para el click en un elemento


    public interface OnItemClickListener { // Interfaz para el click en un elemento
        void onItemClick(Articulo item); // Método que se ejecuta al hacer click en un elemento
    }

    public ArticulosAdapter(List<Articulo> datos, OnItemClickListener listener) {
        this.datos = datos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public myHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflamos la vista con el xml que hemos creado para ello
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_row_articulos, parent, false);
        return new myHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolderView holder, int position) {
        // Asignamos los datos a los elementos del layout
        holder.nombre.setText(datos.get(position).getNombre());
        holder.precio.setText(String.valueOf(datos.get(position).getPrecio()));
        holder.imageView.setImageResource(datos.get(position).getImageId());

        // Al pulsar click en el contenedor lo propagamos hacia arriba al escuchador que recibimos en el constructor
        holder.contenedor.setOnClickListener(v -> {
            // listener.onItemClick(datos.get(position));
            // probar comentada de arriba
            listener.onItemClick(datos.get(holder.getAdapterPosition()));
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    class myHolderView extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView nombre;
        TextView precio;
        ConstraintLayout contenedor;

        public myHolderView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nombre = itemView.findViewById(R.id.tvNombre);
            precio = itemView.findViewById(R.id.tvPrecio);
            contenedor = itemView.findViewById(R.id.contenedor);
        }
    }
}
