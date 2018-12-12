package com.apppspot.ihc01.ihc_proyecto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentRegistrate extends Fragment {
    Button registrar;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista=inflater.inflate(R.layout.fragment_fragment_registrate, container, false);

        registrar= (Button)vista.findViewById(R.id.b_registrarse);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerPrincipal,new FragmentIniciaSesion()).commit();
            }
        });


        return vista;
    }

}
