package com.example.aishmano.myapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng centralPark = new LatLng(40.780937, -73.968712);
        mMap.addMarker(new MarkerOptions().position(centralPark).title("Marker in Central Park"));
        float zoom = 15.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralPark, zoom));
        List<LatLng> list = null;

    }

    private ArrayList<LatLng> readItems(int resources) {
        final ArrayList<LatLng> temp = new ArrayList<LatLng>();
        InputStream inputStream = getResources().openRawResource(R.raw.test);
        String json = new Scanner(inputStream).useDelimiter("\\A").next();
        return null;
    }
}
