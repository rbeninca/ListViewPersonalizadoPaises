package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        ArrayList<Pais> arrayList = new ArrayList<Pais>();

        PaisController paisController = new PaisController();

        PaisAdapter adapter = new PaisAdapter(
                getApplicationContext(),
                R.layout.list_item_pais,
                paisController.PAIS
                );
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                android.R.id.text1,
//                arrayList
//        );

        listView.setAdapter(adapter);





    }
}
