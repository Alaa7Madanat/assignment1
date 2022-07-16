package com.example.alaaassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.buttoncheck)
        var flagz : String = "Zain"

        val spintype : Spinner = findViewById(R.id.spinid)

        val optiontype = arrayOf("Zain","Orange","Umniah")

        spintype.adapter=
            ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optiontype)
        button.setOnClickListener{
            val typeans : TextView = findViewById(R.id.anstype)
            if(flagz == "Zain") {
                typeans.text = "The number start 079"
            }else if(flagz == "Orange"){
                typeans.text = "The  number start 077 or 0777"
            }else{
                typeans.text="The number start 078"

            }            }
            spintype.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    flagz =optiontype.get(p2)
                }

               override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

    }
}