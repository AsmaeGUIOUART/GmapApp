package com.example.gmapsapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class GeofenceBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Transition de Geofence détectée", Toast.LENGTH_SHORT).show();
        // Vous pouvez ajouter ici le code pour gérer les transitions de geofencing
    }
}
