package com.apppspot.ihc01.ihc_proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------MENU-----------------------------------------------
    //--------------------------------------------------------------------------------------------------
    private Button computadoras;
    private Button laptops;
    private Button tablets;
    private Button celulares;


    Fragment fragmentprincipal;
    Fragment fragmentcomputadoras;
    Fragment fragmentlaptops;
    Fragment fragmentcelulares;
    Fragment fragmenttablets;

    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------MENU-----------------------------------------------
        //--------------------------------------------------------------------------------------------------
       computadoras=(Button)findViewById(R.id.MenuComputadoras);
        laptops=(Button)findViewById(R.id.MenuLaptops);
        celulares=(Button)findViewById(R.id.MenuCelulares);
        tablets=(Button)findViewById(R.id.MenuTablets);


        fragmentprincipal= new FragmentPrincipal();
        fragmentcomputadoras= new FragmentVistaComputadoras();
        fragmentlaptops= new FragmentVistaLaptops();
        fragmenttablets= new FragmentVistaTablets();
        fragmentcelulares= new FragmentVistaCelulares();

        getSupportFragmentManager().beginTransaction().add(R.id.containerPrincipal,fragmentprincipal).commit();


        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------





    }


    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //----------------------------------------AUTOGENERADO----------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        //noinspection SimplifiableIfStatement
        if (id == R.id.Espanol) {

        }else if(id==R.id.Ingles){

        }else if(id==R.id.Portugues){

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Utilidades.MODO=Utilidades.USER;
            fragmentManager.beginTransaction().replace(R.id.containerPrincipal, new FragmentPrincipal()).commit();

        } else if (id == R.id.nav_gallery) {
            Utilidades.MODO=Utilidades.ADMIN;
            fragmentManager.beginTransaction().replace(R.id.containerPrincipal, new FragmentAdministrador()).commit();

        } else if (id == R.id.nav_slideshow) {

            fragmentManager.beginTransaction().replace(R.id.containerPrincipal,new FragmentRegistrate()).commit();

        } else if (id == R.id.nav_manage) {
            Intent intento = new Intent(getBaseContext(),MainActivity.class);
            startActivity(intento);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //CUANDO SE PRESIONE SUAQLUIERA DE LOS BOTONES

    public void onclick(View view) {
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.MenuComputadoras:

                if(Utilidades.MODO==Utilidades.ADMIN){
                    fragmentTransaction.replace(R.id.containerPrincipal,new FragmentAdministrador());
                }else{
                    fragmentTransaction.replace(R.id.containerPrincipal,fragmentcomputadoras);
                }
                break;
            case R.id.MenuCelulares:
                if(Utilidades.MODO==Utilidades.ADMIN){
                    fragmentTransaction.replace(R.id.containerPrincipal,new FragmentAdminCelulares());
                }else{
                    fragmentTransaction.replace(R.id.containerPrincipal,fragmentcelulares);
                }


                break;
            case R.id.MenuLaptops:
                if(Utilidades.MODO==Utilidades.ADMIN){
                    fragmentTransaction.replace(R.id.containerPrincipal,new FragmentAdminLaptops());
                }else {
                    fragmentTransaction.replace(R.id.containerPrincipal, fragmentlaptops);
                }
                break;
            case R.id.MenuTablets:
                if(Utilidades.MODO==Utilidades.ADMIN){
                    fragmentTransaction.replace(R.id.containerPrincipal,new FragmentAdminTablets());
                }else {
                    fragmentTransaction.replace(R.id.containerPrincipal, fragmenttablets);
                }
                break;
        }

        fragmentTransaction.commit();

    }



    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------





}
