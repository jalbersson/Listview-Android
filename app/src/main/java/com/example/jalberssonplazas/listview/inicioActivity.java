package com.example.jalberssonplazas.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class inicioActivity extends AppCompatActivity
{

    ListView lista;
    //CharSequence col="Colombia", chil="Chile", peru="Peru", para="Paraguay";
    String[] datos={"Colombia", "Chile", "Peru", "Paraguay", "Uruguay", "Argentina", "Brazil"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        lista=(ListView) findViewById(R.id.lstPrincipal);
        final ArrayAdapter<String> paises= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(paises);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Toast.makeText(getApplicationContext(), paises.getItem(0), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Toast.makeText(getApplicationContext(), paises.getItem(1), Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        Toast.makeText(getApplicationContext(), paises.getItem(2), Toast.LENGTH_LONG).show();
                        break;

                    case 3:
                        Toast.makeText(getApplicationContext(), paises.getItem(3), Toast.LENGTH_LONG).show();
                        break;

                }
            }
        });

    }
}
