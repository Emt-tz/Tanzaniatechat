package com.tanzanite.tanzanite

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.PluginRegistry

import io.flutter.view.FlutterMain
import io.inway.ringtone.player.FlutterRingtonePlayerPlugin
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin


class MainActivity : FlutterActivity(), PluginRegistry.PluginRegistrantCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      
        FlutterMain.startInitialization(this)
    }

    override fun registerWith(registry: PluginRegistry?) {
     
           if (!registry!!.hasPlugin("io.inway.ringtone.player")) {
            FlutterRingtonePlayerPlugin.registerWith(registry!!.registrarFor("io.inway.ringtone.player.FlutterRingtonePlayerPlugin"));
        }
          if (!registry!!.hasPlugin("com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin")) {
        FlutterLocalNotificationsPlugin.registerWith(registry!!.registrarFor("com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin"));
        }
    }

}