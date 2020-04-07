package com.example.listviewpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PaisAdapter  extends ArrayAdapter<Pais> {
    Context mContext;
    int mResource;

    public PaisAdapter(Context context, int resource,  Pais[] objects) {
        super(context, resource, objects);
        mContext=context;
        mResource=resource;
    }



    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        //Infrar o layout
        LayoutInflater layoutInflater  = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        //Associar variaveis locais as view do layout.
        TextView textViewNome=convertView.findViewById(R.id.textViewNome);
        TextView textViewPopulacao= convertView.findViewById(R.id.textViewPopulacao);
        ImageView imgPais=convertView.findViewById(R.id.imageView);

        Pais pais=getItem(position);

        //Associar Dados ao Layout inflado
        textViewNome.setText(pais.getNome());
        textViewPopulacao.setText(Integer.toString(pais.getPopulacao()));
        imgPais.setImageResource(pais.getImage());


        return convertView;
    }
}
