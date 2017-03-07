package com.mightyducklings.cpre186.cashmeoutside;

import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
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


    /*** Manipulates the map once available.
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
        LatLng gilman = new LatLng(42.029525, -93.648627);
        mMap.addMarker(new MarkerOptions().position(gilman).title("Aren Halleland").snippet("Text Aren? (319)-939-9627"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gilman));
        LatLng agronomy = new LatLng(42.028242, -93.642507);
        mMap.addMarker(new MarkerOptions().position(agronomy).title("Nathan Shull").snippet("Text Nathan? (319)-827-2327"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(agronomy));
        LatLng memUnion = new LatLng(42.023650, -93.645959);
        mMap.addMarker(new MarkerOptions().position(memUnion).title("Nathan Goodwin").snippet("Text Nathan? (319)-123-4567"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(memUnion));
        LatLng campaneil = new LatLng(42.026619, -93.646465);
        mMap.addMarker(new MarkerOptions().position(campaneil).title("Ryan Connolly").snippet("Text Ryan? (319)-765-4321"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(campaneil));
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
