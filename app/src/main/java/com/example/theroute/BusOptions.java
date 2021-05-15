package com.example.theroute;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BusOptions extends ArrayAdapter<String> {
    private final String[] Data1;
    private Context context;

    public BusOptions(@NonNull Context context, int resource, @NonNull String[] Data) {
        super(context, resource, Data);
        this.Data1=Data;
    }// Its a constructor that receive data from MainActivity in Data and stores in Data1.

    @Nullable
    @Override
    public String getItem(int position) {
        return Data1[position];
    }//here we are overriding the getItem function which returns the position of our Data1.

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //we cannot use the ids of layout routesoptions so we created convertview which inflates the layout.
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.route_options,parent,false);
        TextView O= convertView.findViewById(R.id.routeOptions_text);
        O.setText(getItem(position));
        /*convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you clicked!"+ position,Toast.LENGTH_SHORT).show();
            }
        });*/
        return convertView;


    }//here we are overriding the getView function which returns the Converted layout i.e.routesoptions.
}
