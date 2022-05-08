package com.sanmiguel.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun presTeclas(campo1: View){
        val textV1 = findViewById<TextView>(R.id.tv1)
        var tvIni = textV1.text.toString()

        when(campo1.id){
            R.id.bt0 -> textV1.setText(tvIni + "0")
            R.id.bt1 -> textV1.setText(tvIni + "1")
            R.id.bt2 -> textV1.setText(tvIni + "2")
            R.id.bt3 -> textV1.setText(tvIni + "3")
            R.id.bt4 -> textV1.setText(tvIni + "4")
            R.id.bt5 -> textV1.setText(tvIni + "5")
            R.id.bt6 -> textV1.setText(tvIni + "6")
            R.id.bt7 -> textV1.setText(tvIni + "7")
            R.id.bt8 -> textV1.setText(tvIni + "8")
            R.id.bt9 -> textV1.setText(tvIni + "9")
            R.id.btPoint -> textV1.setText(tvIni + ".")
            //R.id.btPercent -> textV1.setText(tvIni + "%")

        }
    }

}
