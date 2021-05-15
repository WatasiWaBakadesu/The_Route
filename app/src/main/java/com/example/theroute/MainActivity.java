package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    SearchView searchView;
    ListView listView;
    String[] searchedOption;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth=FirebaseAuth.getInstance();
        listView=findViewById(R.id.destinationOptionsList);
        searchView=findViewById(R.id.searchDestination);
        Resources res=getResources();
        String[] Option=res.getStringArray(R.array.Destinationoptions);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,Option);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*Toast.makeText(MainActivity.this, "You Clicked on"+ adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();*/
                searchView.setQuery(adapterView.getItemAtPosition(i).toString(),true);
            }
        });
        //searchView set filter
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                MainActivity.this.arrayAdapter.getFilter().filter(query);
                Intent intent=new Intent(MainActivity.this,ChooseYourBus.class);
                intent.putExtra("option",query);
                /*Toast.makeText(MainActivity.this, "Searching...", Toast.LENGTH_SHORT).show();*/
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                MainActivity.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.top_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.logout:{
                auth.signOut();
                Intent intent =new Intent(MainActivity.this,LogInActivity.class);
                startActivity(intent);
                finish();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}