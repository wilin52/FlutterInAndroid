package com.wilin.flutterinandroid

import android.app.Application
import io.flutter.facade.Flutter

/**
 * Created by Lin Wenlong on 2019/1/29 上午10:53
 *
 */
class FlutterDemoApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    Flutter.startInitialization(this)

  }
}