package com.github.dorval.francois.kerlouantopo.activity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.List;

import com.github.dorval.francois.kerlouantopo.R;

public class MenuActivity extends AppCompatActivity {




    private int indexPage = 0;
    private PDFView pDFView;

    public static String MENU_SELECTED = "MENU_SELECTED";
    private Typeface typeface;

    public static enum MenuElement {
        TOUT,
        MENEHAM,
        PARADIS,
        BIVOUAC,
        RIVIERE,
        NEIZVRAN,
        CREMIOU
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.toolbar_menu);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);

        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.infos_appli:
                Intent intent = new Intent(MenuActivity.this, InfoActivity.class);
                startActivity(intent);
                return (true);
        }
        return false;
    }


    public void boutonMeneHam(View view)    {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.MENEHAM);
        startActivity(intent);
    }

    public void boutonParadis(View view)    {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.PARADIS);
        startActivity(intent);
    }

    public void boutonTout(View view)    {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.TOUT);
        startActivity(intent);
    }

    public void boutonRiviere(View view)    {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.RIVIERE);
        startActivity(intent);
    }

    public void boutonBivouac(View view)    {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.BIVOUAC);
        startActivity(intent);
    }

    public void boutonCremiou(View view)    {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.CREMIOU);
        startActivity(intent);
    }

    public void boutonNeizvran(View view)    {
        Intent intent = new Intent(MenuActivity.this, SecteurActivity.class);
        intent.putExtra(MENU_SELECTED, MenuElement.NEIZVRAN);
        startActivity(intent);


    }


}
