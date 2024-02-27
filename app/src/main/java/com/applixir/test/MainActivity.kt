package com.applixir.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.appLixir.applixir.v2.startApplixir
import com.appLixir.applixir.v2.utils.checkRewardedAd
import com.applixir.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var adsLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            val isRewarded = checkRewardedAd(result)

        }

    private  var binding: ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.rewardBtn?.setOnClickListener {
            adsLauncher.launch(
                startApplixir(
                    this@MainActivity,
                    url = "https://js.applixirads.com/Android-test-1.html"
                )
            )
        }

    }
}