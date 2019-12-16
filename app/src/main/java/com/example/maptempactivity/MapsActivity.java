package com.example.maptempactivity;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        LatLng paris = new LatLng(48.864716, 2.349014);
        LatLng toronto = new LatLng(43.6532,-79.3832);
        LatLng buenosAires = new LatLng(-34.6037,-58.3816);
        LatLng stockholm = new LatLng(59.308152, 18.031316);
        LatLng brasilia = new LatLng(-15.801513, -47.880897);
        LatLng tokyo = new LatLng(35.753507, 139.223119);

        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_2));
        mMap.addMarker(new MarkerOptions().position(paris).title("Marker in Paris")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_3));
        mMap.addMarker(new MarkerOptions().position(toronto).title("Marker in Toronto")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_4));
        mMap.addMarker(new MarkerOptions().position(buenosAires).title("Marker in Buenos Aires")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_5));
        mMap.addMarker(new MarkerOptions().position(stockholm).title("Marker in Stockholm")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_6));
        mMap.addMarker(new MarkerOptions().position(brasilia).title("Marker in Brasilia")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_7));
        mMap.addMarker(new MarkerOptions().position(tokyo).title("Marker in Tokyo")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.image_8));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(tokyo));

    }
}
