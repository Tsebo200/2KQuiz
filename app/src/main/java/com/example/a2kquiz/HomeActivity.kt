package com.example.a2kquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a2kquiz.R
import com.example.a2kquiz.databinding.ActivityHomeBinding
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {
    private lateinit var home: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)
        home = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(home.root)//This sets what xml frontend to use


        //onClick Event listener when user enters nicknames
        home.btnEnter.setOnClickListener {



            var nickname = home.etNickname.text

            //Check if nickname has been added
            if(nickname.toString() == ""){
//                var nicknameModal = Toast.makeText(this, "Oops You Forgot To Enter Your Nickname", Toast.LENGTH_LONG).show()
                Snackbar.make(it, "Please enter your Nickname", Snackbar.LENGTH_LONG)
                    .setAction("ok", {
                    })
                    .show()
            }else{
                //TODO: NAvigate next activity
                Log.i("Clicked", "$nickname")
            }

            Log.i("Clicked", "$nickname")

        }
    }
}