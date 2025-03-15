package com.example.no1
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.text.InputType
import android.util.AttributeSet
import android.view.Gravity
import android.widget.*

class customView (context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs){

    private val imageView = ImageView(context).apply {
        setImageResource(R.drawable.cover)
        layoutParams = LayoutParams(700, 700).apply {
            setMargins(0, 0,0, 20)
        }
    }

    private val usernameField = EditText(context).apply {
        hint = "Username"
        setPadding(40, 20, 40, 20)
        background = createRoundedBackground()
    }

    private val passwordField = EditText(context).apply {
        hint = "Password"
        inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        setPadding(40, 20, 40, 20)
        background = createRoundedBackground()
    }

    private val loginButton = Button(context).apply {
        text = "Login"
        setOnClickListener {
            Toast.makeText(context, "Login ditekan", Toast.LENGTH_SHORT).show()
        }
    }

    private val forgotPasswordText = TextView(context).apply {
        text = "Lupa Password?"
        gravity = Gravity.RIGHT
        setOnClickListener {
            Toast.makeText(context, "Arahkan ke halaman reset password", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, LupaActivity::class.java)
            context.startActivity(intent)
        }
    }

    private val registerText = TextView(context).apply {
        text = "Belum punya akun? Daftar"
        gravity = Gravity.CENTER
        setOnClickListener {
            Toast.makeText(context, "Arahkan ke halaman registrasi", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, DaftarActivity::class.java)
            context.startActivity(intent)
        }
    }

    init {
        orientation = VERTICAL
        gravity = Gravity.CENTER

        addView(imageView)
        addView(usernameField, createLayoutParams())
        addView(passwordField, createLayoutParams())
        addView(forgotPasswordText, createLayoutParams())
        addView(loginButton, createLayoutParams())
        addView(registerText, createLayoutParams())

    }

    private fun createRoundedBackground(): GradientDrawable {
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