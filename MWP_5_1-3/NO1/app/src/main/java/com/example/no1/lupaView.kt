package com.example.no1

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.text.InputType
import android.util.AttributeSet
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class lupaView (context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    private val title = TextView(context).apply {
        text = "RESET PASSWORD"
        gravity = Gravity.CENTER
        setTypeface(null, Typeface.BOLD)
        textSize = 27f
        setPadding(0,25,0,50)
    }

    private val usernameField = EditText(context).apply {
        hint = "Username"
        setPadding(40, 20, 40, 20)
        background = oval()
    }

    private val passwordField = EditText(context).apply {
        hint = "Password"
        inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        setPadding(40, 20, 40, 20)
        background = oval()
    }

    private val confPasswordField = EditText(context).apply {
        hint = "Konfirmasi Password"
        inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        setPadding(40, 20, 40, 20)
        background = oval()
    }

    private val resetButton = Button(context).apply {
        text = "Reset"
        setOnClickListener {
            Toast.makeText(context, "Ayo Login", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    private val loginText = TextView(context).apply {
        text = "Masih ingat password? Login"
        gravity = Gravity.CENTER
        setOnClickListener {
            Toast.makeText(context, "Arahkan ke halaman login", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
        setPadding(0,50,0,0)
    }

    init{
        orientation = VERTICAL
        gravity = Gravity.CENTER
        setPadding(0, -850, 0, 0)

        addView(title, createLayoutParams())
        addView(usernameField, createLayoutParams())
        addView(passwordField, createLayoutParams())
        addView(confPasswordField, createLayoutParams())
        addView(resetButton, createLayoutParams())
        addView(loginText, createLayoutParams())

    }

    private fun oval(): GradientDrawable {
        return GradientDrawable().apply {
            setColor(Color.WHITE)
            setStroke(2, Color.GRAY)
            cornerRadius = 20f
        }
    }

    private fun createLayoutParams(): LayoutParams {
        return LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT).apply {
            setMargins(20, 20, 20, 20)
        }
    }
}