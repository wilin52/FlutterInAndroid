package com.wilin.flutterinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    start_flutter.setOnClickListener {
      startFlutter()
    }
  }

  private fun startFlutter() {
    val intent = Intent(this, FlutterDemoActivity::class.java)
    startActivity(intent)
  }
}
