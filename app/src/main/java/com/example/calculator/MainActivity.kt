package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textViewResult : TextView
    lateinit var textViewResult2 : TextView
    var num1 : Double = 0.0
    var operacion : Int = 0
    companion object {
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICACION = 3
        const val DIVISION = 4
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewResult = findViewById(R.id.textViewResult)
        textViewResult2 = findViewById(R.id.textViewResult2)
    }

    fun pulsarDigito(view: View){
        val res2: String = textViewResult.text.toString()

        when(view.id){
            R.id.buttonCero -> textViewResult.setText(res2 + "0")
            R.id.buttonUno -> textViewResult.setText(res2 + "1")
            R.id.buttonDos -> textViewResult.setText(res2 + "2")
            R.id.buttonTres -> textViewResult.setText(res2 + "3")
            R.id.buttonCuatro -> textViewResult.setText(res2 + "4")
            R.id.buttonCinco -> textViewResult.setText(res2 + "5")
            R.id.buttonSeis -> textViewResult.setText(res2 + "6")
            R.id.buttonSiete -> textViewResult.setText(res2 + "7")
            R.id.buttonOcho -> textViewResult.setText(res2 + "8")
            R.id.buttonNueve -> textViewResult.setText(res2 + "9")
            R.id.buttonParen1 -> textViewResult.setText(res2 + "(")
            R.id.buttonParen2 -> textViewResult.setText(res2 + ")")
            R.id.buttonPunto -> textViewResult.setText(res2 + ".")
            R.id.buttonC -> {
                textViewResult.setText("")
                textViewResult2.setText("")
            }
            R.id.buttonIgual -> {
                var num2 : Double = textViewResult.text.toString().toDouble()
                var result : Double = 0.0
                when(operacion){
                    SUMA -> result = num1 + num2
                    RESTA -> result = num1 - num2
                    MULTIPLICACION -> result = num1 * num2
                    DIVISION -> if(num2.toInt() == 0){
                        textViewResult.setText("Error")
                    }else {
                            result = num1 / num2
                    }
                }
                if()
                textViewResult.setText(result.toString())
                textViewResult2.setText("")
            }
        }
    }

    fun operations(view: View){
        num1 = textViewResult.text.toString().toDouble()
        var num2_text : String = textViewResult.text.toString()
        textViewResult.setText("")
        when(view.id){
            R.id.buttonSuma -> {
                textViewResult2.setText(num2_text + "+")
                operacion = 1
            }
            R.id.buttonResta -> {
                textViewResult2.setText(num2_text + "-")
                operacion = 2
            }
            R.id.buttonMult -> {
                textViewResult2.setText(num2_text + "*")
                operacion = 3
            }
            R.id.buttonDiv -> {
                textViewResult2.setText(num2_text + "/")
                operacion = 4
            }
        }
    }
}