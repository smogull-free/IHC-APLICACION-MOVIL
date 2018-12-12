package com.apppspot.ihc01.ihc_proyecto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentAdministrador extends Fragment {

    private ArrayList<ModeloProducto> productos;
    private RecyclerView recycler_productos;
    private AdaptadorAdministrador adaptador_productos;
    InterfaceViewProductoMensaje EM;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


       View vista =inflater.inflate(R.layout.fragment_fragment_administrador, container, false);

       productos= new ArrayList<>();

        //LLENANDO DATOS DEL ARRAY LIST
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp1));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp2));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp3));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp4));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp5));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp7));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp7));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp8));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp9));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.cp10));
        //--------------------------------------------------------------------------------------------------
        recycler_productos=(RecyclerView)vista.findViewById(R.id.recyclerAdministrador);
        //recycler_productos.setHasFixedSize(true);
        recycler_productos.setLayoutManager(new LinearLayoutManager(getContext()));
        adaptador_productos= new AdaptadorAdministrador(productos);
        recycler_productos.setAdapter(adaptador_productos);

        adaptador_productos.colocarEvento(getActivity(),EM,recycler_productos,productos);
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------



       return vista;
    }


}
