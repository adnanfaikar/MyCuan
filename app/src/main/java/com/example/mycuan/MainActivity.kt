package com.example.mycuan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycuan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(applicationContext, ApplyingJobs::class.java)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.goToApplyJobs.setOnClickListener(){
            binding.goToApplyJobs.text="You Are Applying"
            startActivity(intent)
        }

    }


}