package com.example.aishmano.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.maps.android.heatmaps.HeatmapTileProvider;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
        LatLng centralPark = new LatLng(40.775801, -73.968556);
        LatLng destination = new LatLng(40.780937, -73.968712);
        float zoom = 15.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralPark, zoom));

        mMap.addMarker(new MarkerOptions().position(destination).title("Delacorte Theatre"));
        mMap.addMarker(new MarkerOptions().position(centralPark).title("Loeb Boathouse"));


        List<LatLng> list = new ArrayList<>();
        /*
        try {
            list = readItems(30);
        } catch (JSONException e) {

        }
        */
        //adding heat map location
        list.add(new LatLng(40.780937, -73.968712));
        list.add(new LatLng(40.780948, -73.968711));
        list.add(new LatLng(40.780948, -73.968700));
        list.add(new LatLng(40.780948, -73.968730));
        list.add(new LatLng(40.780930, -73.968709));
        list.add(new LatLng(40.780125, -73.969393));
        list.add(new LatLng(40.780027, -73.968449));
        list.add(new LatLng(40.779844, -73.969158));
        list.add(new LatLng(40.780510, -73.968981));
        list.add(new LatLng(40.780715, -73.968474));
        //
        list.add(new LatLng(40.780417, -73.969517));
        list.add(new LatLng(40.779920, -73.966702));
        list.add(new LatLng(40.779814, -73.966177));
        list.add(new LatLng(40.779324, -73.966387));
        list.add(new LatLng(40.779430, -73.965373));
        list.add(new LatLng(40.779986, -73.965303));
        list.add(new LatLng(40.780145, -73.966160));
        list.add(new LatLng(40.780516, -73.967541));
        list.add(new LatLng(40.780476, -73.966947));
        list.add(new LatLng(40.780277, -73.966212));
        list.add(new LatLng(40.780278, -73.966213));
        list.add(new LatLng(40.780279, -73.966214));
        list.add(new LatLng(40.780280, -73.966215));
        list.add(new LatLng(40.780281, -73.966216));
        list.add(new LatLng(40.780282, -73.966217));
        list.add(new LatLng(40.780475, -73.966946));
        list.add(new LatLng(40.780474, -73.966945));
        list.add(new LatLng(40.780473, -73.966944));
        HeatmapTileProvider  x = new HeatmapTileProvider.Builder()
                .data(list)
                .build();
        mMap.addTileOverlay(new TileOverlayOptions().tileProvider(x));
        Polyline line = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.775801, -73.968556 ), new LatLng(40.777259, -73.968256))
                .width(5)
                .color(Color.BLUE));
        Polyline line2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.777259, -73.968256), new LatLng(40.777714, -73.968696))
                .width(5)
                .color(Color.BLUE));
        Polyline line3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.777714, -73.968696), new LatLng(40.777927, -73.969144))
                .width(5)
                .color(Color.BLUE));
        Polyline line4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.777927, -73.969144), new LatLng(40.778384, -73.969032))
                .width(5)
                .color(Color.BLUE));
        Polyline line5 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.778384, -73.969032), new LatLng(40.779129, -73.969156))
                .width(5)
                .color(Color.BLUE));
        Polyline line6 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.779129, -73.969156), new LatLng(40.779580, -73.969135))
                .width(5)
                .color(Color.BLUE));
        Polyline line7 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(40.779580, -73.969135), destination)
                .width(5)
                .color(Color.BLUE));

        //zooming
        /*
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(destination)
                .zoom(17)
                .build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        */

    }

    /*
    private ArrayList<LatLng> readItems(int resource) throws JSONException {
        final ArrayList<LatLng> temp = new ArrayList<>(0);
         InputStream inputStream = getResources().openRawResource(R.raw.test);
        String json = new Scanner(inputStream).useDelimiter("\\A").next();
        JSONArray array = new JSONArray(json);

        for (int i = 0; i < resource; i++) {
            JSONObject object = array.getJSONObject(i);
            double lat = object.getDouble("long");
            double lng = object.getDouble("lat");
            temp.add(new LatLng(lat, lng));
        }

       return temp;
    }
    */

}


