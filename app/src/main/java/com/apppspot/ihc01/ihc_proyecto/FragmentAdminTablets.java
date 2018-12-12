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

public class FragmentAdminTablets extends Fragment {
    private ArrayList<ModeloProducto> productos;
    private RecyclerView recycler_productos;
    private AdaptadorAdministrador adaptador_productos;
    InterfaceViewProductoMensaje EM;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista =inflater.inflate(R.layout.fragment_fragment_admin_tablets, container, false);

        productos= new ArrayList<>();

        //LLENANDO DATOS DEL ARRAY LIST
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb1));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb8));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb3));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb4));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb5));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb3));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb1));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb8));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb9));
        productos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.tb3));
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
