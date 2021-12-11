package com.example.zaratma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun zarAtma(v: View){
        var rastgele= Random.nextInt(1,7)
        val viewImage=findViewById()
        val number= findViewById(R.id.numara) as TextView
        number.text= rastgele.toString()
    }
    fun ResetFunc(v: View){
        val viewImage=findViewById(R.id.resim) as ImageView
        val number= findViewById(R.id.numara) as TextView

        viewImage.setImageResorcu(R.drawable.dsc_2)
        number.text="GDSC-METU"
    }
}
