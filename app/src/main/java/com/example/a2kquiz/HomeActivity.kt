package com.example.a2kquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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



            val nickname = home.etNickname.text

            //Check if nickname has been added
            if(nickname.toString() == ""){
                //This is the Toast
//                var nicknameModal = Toast.makeText(this, "Oops You Forgot To Enter Your Nickname", Toast.LENGTH_LONG).show()

//                This is the Snackbar
                Snackbar.make(it, "Oops You Forgot To Enter Your Nickname", Snackbar.LENGTH_LONG)
                    .setAction("ok", { }).show()

                //Adding Validation
                home.etNickname.error = "Forgot Nickname"
            }else{
                //TODO: Navigate next activity
                Log.i("Clicked", "$nickname")

                val intent = Intent(this, QuestionActivity::class.java)

                intent.putExtra("nickname", nickname.toString())
                //finish()// close current activity when click the back button
                startActivity(intent)
//            If you want top parse data


            }







//            finish()//close current Activity From back stack
        }
    }
}