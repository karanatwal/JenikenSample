package com.example.jenikensample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val emailValidator by lazy {
        EmailValidator()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameInput.addTextChangedListener(emailValidator)
    }

    fun onSaveClick(v: View){
        if (emailValidator.isValid()){
            println("Valid email: ${userNameInput.text}")
        }else{
            println("Not a valid email: ${userNameInput.text}")
        }
    }

}
