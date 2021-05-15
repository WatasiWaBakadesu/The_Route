package com.example.theroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ChooseYourBus extends AppCompatActivity {
    ListView showOptions;
    Button button;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_bus);
        showOptions=findViewById(R.id.listViewoptionForBus);
        Intent intent=getIntent();
        button=findViewById(R.id.buttonToGoMap);
        a=intent.getStringExtra("option");
        //To get data from string.xml we should import android.content.res.Resources; and then following 2 lines of codes should help.
        Resources res=getResources();
        switch (a) {
            case "Chandragiri":
                String[] Option0 = res.getStringArray(R.array.busOptionsForChandragiri);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op = new BusOptions(this, R.layout.route_options, Option0);
                showOptions.setAdapter(Op);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "0");
                        startActivity(intent1);

                    }
                });
                break;
            case "Sundralijal":
                String[] Option1 = res.getStringArray(R.array.busOptionsForSundarijal);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op1 = new BusOptions(this, R.layout.route_options, Option1);
                showOptions.setAdapter(Op1);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "1");
                        startActivity(intent1);

                    }
                });
                break;
            case "Sanga":
                String[] Option2 = res.getStringArray(R.array.busOptionsForSanga);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op2 = new BusOptions(this, R.layout.route_options, Option2);
                showOptions.setAdapter(Op2);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "2");
                        startActivity(intent1);

                    }
                });
                break;
            case "Ratnapark":
                String[] Option3 = res.getStringArray(R.array.busOptionsForRatnaPark);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op3 = new BusOptions(this, R.layout.route_options, Option3);
                showOptions.setAdapter(Op3);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "3");
                        startActivity(intent1);

                    }
                });
                break;
            case "Champadevi":
                String[] Option4 = res.getStringArray(R.array.busOptionsForChampadevi);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op4 = new BusOptions(this, R.layout.route_options, Option4);
                showOptions.setAdapter(Op4);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "4");
                        startActivity(intent1);

                    }
                });
                break;
            case "Kalnki":
                String[] Option5 = res.getStringArray(R.array.busOptionsForKalanki);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op5 = new BusOptions(this, R.layout.route_options, Option5);
                showOptions.setAdapter(Op5);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "5");
                        startActivity(intent1);

                    }
                });
                break;
            case "Pilot Baba":
                String[] Option6 = res.getStringArray(R.array.busOptionsForPilotBaba);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op6 = new BusOptions(this, R.layout.route_options, Option6);
                showOptions.setAdapter(Op6);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "6");
                        startActivity(intent1);

                    }
                });
                break;
            case "Doleswor Mahadev":
                String[] Option7 = res.getStringArray(R.array.busOptionsForDoleshworMahadev);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op7 = new BusOptions(this, R.layout.route_options, Option7);
                showOptions.setAdapter(Op7);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "7");
                        startActivity(intent1);

                    }
                });
                break;
            case "Nagarkot":
                String[] Option8 = res.getStringArray(R.array.busOptionsForNagarkot);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op8 = new BusOptions(this, R.layout.route_options, Option8);
                showOptions.setAdapter(Op8);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "8");
                        startActivity(intent1);

                    }
                });
                break;
            case "Dhulikhel":
                String[] Option9 = res.getStringArray(R.array.busOptionsForDhulikhel);
                //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                BusOptions Op9 = new BusOptions(this, R.layout.route_options, Option9);
                showOptions.setAdapter(Op9);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ChooseYourBus.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                        Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                        intent1.putExtra("optionMap", "9");
                        startActivity(intent1);

                    }
                });
                break;
            default:
                Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
        }
    }
}