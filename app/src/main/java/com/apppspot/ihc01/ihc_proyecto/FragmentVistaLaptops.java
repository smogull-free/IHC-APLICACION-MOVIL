package com.apppspot.ihc01.ihc_proyecto;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentVistaLaptops extends Fragment {
    //--------------------------------------------------------------------------------------------------
    //-------------------------------------------Vista horizontal Computadoras-----------------------------------------------
    //--------------------------------------------------------------------------------------------------



    private ArrayList<ModeloProducto> productos_mas_vendidos;
    private ArrayList<ModeloProducto> productos_oferta;
    private ArrayList<ModeloProducto> productos_recientes;

    private RecyclerView irecycler_mas_vendidos;
    private RecyclerView irecycler_oferta;
    private RecyclerView irecycler_recientes;

    private MainProductAdapter iadaptador_mas_vendidos;
    private MainProductAdapter iadaptador_oferta;
    private MainProductAdapter iadaptador_recientes;
    InterfaceViewProductoMensaje EM;

    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vista =inflater.inflate(R.layout.fragment_fragment_vista_laptops, container, false);

                //--------------------------------------------------------------------------------------------------
        //--------------------------------------------VISTA PRODUCTOS SUPERIOR-----------------------------------------------
        //--------------------------------------------------------------------------------------------------

        productos_mas_vendidos= new ArrayList<>();

        //LLENANDO DATOS DEL ARRAY LIST
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp5));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp2));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp7));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp4));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp5));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp9));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp7));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp8));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp9));
        productos_mas_vendidos.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp10));
        //--------------------------------------------------------------------------------------------------
        irecycler_mas_vendidos=(RecyclerView)vista.findViewById(R.id.recicler_mas_vendidos);
        irecycler_mas_vendidos.setHasFixedSize(true);
        irecycler_mas_vendidos.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        iadaptador_mas_vendidos= new MainProductAdapter(productos_mas_vendidos);
        irecycler_mas_vendidos.setAdapter(iadaptador_mas_vendidos);
        iadaptador_mas_vendidos.colocarEvento(getActivity(),EM,irecycler_mas_vendidos,productos_mas_vendidos);
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------VISTA PRODUCTOS SUPERIOR-----------------------------------------------
        //--------------------------------------------------------------------------------------------------

        productos_oferta= new ArrayList<>();

        //LLENANDO DATOS DEL ARRAY LIST
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp5));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp2));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp7));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp8));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp9));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp10));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp4));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp2));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp7));
        productos_oferta.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp4));
        //--------------------------------------------------------------------------------------------------
        irecycler_oferta=(RecyclerView)vista.findViewById(R.id.recicler_oferta);
        irecycler_oferta.setHasFixedSize(true);
        irecycler_oferta.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        iadaptador_oferta= new MainProductAdapter(productos_oferta);
        irecycler_oferta.setAdapter(iadaptador_oferta);

        iadaptador_oferta.colocarEvento(getActivity(),EM,irecycler_oferta,productos_oferta);
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------VISTA PRODUCTOS SUPERIOR-----------------------------------------------
        //--------------------------------------------------------------------------------------------------

        productos_recientes= new ArrayList<>();

        //LLENANDO DATOS DEL ARRAY LIST
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp10));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp9));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp8));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp7));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp2));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp5));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp4));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp7));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp2));
        productos_recientes.add(new ModeloProducto("v5 AC plus","15 Units","$150.56",R.drawable.lp10));
        //--------------------------------------------------------------------------------------------------
        irecycler_recientes=(RecyclerView)vista.findViewById(R.id.recicler_recientes);
        irecycler_recientes.setHasFixedSize(true);
        irecycler_recientes.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        iadaptador_recientes= new MainProductAdapter(productos_recientes);
        irecycler_recientes.setAdapter(iadaptador_recientes);

        iadaptador_recientes.colocarEvento(getActivity(),EM,irecycler_recientes,productos_recientes);
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------
        return vista;
    }


}
