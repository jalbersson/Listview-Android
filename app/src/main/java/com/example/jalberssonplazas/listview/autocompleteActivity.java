package com.example.jalberssonplazas.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class autocompleteActivity extends AppCompatActivity
{

    String[] datos={"Colombia","Peru", "Paraguay", "Uruguay", "Argentina", "Brazil", "Chile"};
    AutoCompleteTextView atxtPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete);

        ArrayAdapter<String> paises= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        atxtPrincipal=(AutoCompleteTextView) findViewById(R.id.atxtPrincipal);
        atxtPrincipal.setAdapter(paises);
    }
}
