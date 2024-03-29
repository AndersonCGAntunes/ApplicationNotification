package com.relaxingsoft.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.installations.FirebaseInstallations

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById( R.id.button_send_notification )
        btnSend.setOnClickListener {
            this.showNotification( "1234", "bootcamp Android", "Kotlin Android curso" )
        }

        Log.i( "**newToken", FirebaseInstallations.getInstance().getToken( true ).toString() )
    }
}