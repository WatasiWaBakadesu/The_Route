package com.example.theroute;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int a;
    LanLong lanLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Intent intent = getIntent();
        LatLng zoomOn = new LatLng(27.7023816, 85.3282081);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoomOn, 12));
        lanLong=new LanLong(mMap);
        a = Integer.parseInt(intent.getStringExtra("optionMap"));
        switch (a) {
            case 0: lanLong.forChandragiri();
                break;
            case 1: lanLong.forSundarijal();
                break;
            case 2: lanLong.forSanga();
                break;
            case 3: lanLong.forRatnapark();
                break;
            case 4: lanLong.forChampadevi();
                break;
            case 5: lanLong.forKalnki();
                break;
            case 6: lanLong.forPilotBaba();
                break;
            case 7: lanLong.forDolesworMahadev();
                break;
            case 8: lanLong.forNagarkot();
                break;
            case 9: lanLong.forDhulikhel();
                break;
            default:
                Toast.makeText(this, "Invalid choice", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}