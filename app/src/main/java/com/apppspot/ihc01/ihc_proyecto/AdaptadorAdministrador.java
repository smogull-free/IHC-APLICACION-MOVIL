package com.apppspot.ihc01.ihc_proyecto;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorAdministrador extends RecyclerView.Adapter<AdaptadorAdministrador.ViewHolder> implements View.OnClickListener {

    private View.OnClickListener listener;

    public void setOnClickListener(View.OnClickListener listener){

        this.listener=listener;

    }
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }

    }

    public void colocarEvento(final FragmentActivity fmac, final InterfaceViewProductoMensaje EM,
                              final RecyclerView recyclerFicha, final List<ModeloProducto> productos){
        this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fmac.getSupportFragmentManager().beginTransaction().replace(R.id.containerPrincipal, new FragmentVistaProducto()).commit();



            }
        });

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView modelo, stock, precio;
        ImageView imagenProducto;



        public ViewHolder( View itemView){
            super(itemView);

            modelo=(TextView)itemView.findViewById(R.id.modelo);
            stock=(TextView)itemView.findViewById(R.id.precio);
            precio=(TextView)itemView.findViewById(R.id.stock);
            imagenProducto=(ImageView)itemView.findViewById(R.id.imagen);

        }


    }

    //VARIABLE TIPO LISTA PARA ALMACENAR TODOS LOS DATOS MOSTRADOS EN CADA ITEM

    public List<ModeloProducto> listaDeProductos;


    //CONSTRUCTOR
    public AdaptadorAdministrador(List<ModeloProducto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;

    }

    //ENCARGADO DE INFLAR EL CONTENIDO DE UN NUEVO ITEM PARA LA LISTA
    public AdaptadorAdministrador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        /*INFLAR ES EL TERMINO QUE SE USA  CUANDO SE INCLUYE UN LAYOUT DENTRO DE OTRO LAYOUT*/
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_for_administrador,parent,false);
        AdaptadorAdministrador.ViewHolder viewHolder=new AdaptadorAdministrador.ViewHolder(view);

        view.setOnClickListener(this);

        return viewHolder;
    }

    //Este metodo realiza las modificaciones del contenido para cada item
    public void onBindViewHolder(AdaptadorAdministrador.ViewHolder holder, int position){
        if(!listaDeProductos.isEmpty()) {
            holder.modelo.setText(listaDeProductos.get(position).getModelo());
            holder.stock.setText(listaDeProductos.get(position).getStock());
            holder.precio.setText(listaDeProductos.get(position).getPrecio());
            holder.imagenProducto.setImageResource(listaDeProductos.get(position).getImagen());
        }
    }

    public int getItemCount(){
        return  listaDeProductos.size();
    }

}