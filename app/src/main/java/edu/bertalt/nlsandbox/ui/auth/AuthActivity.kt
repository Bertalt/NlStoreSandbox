package edu.bertalt.nlsandbox.ui.auth

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.bertalt.nlsandbox.R
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setupLayouts()
    }

    fun setupLayouts(){
        auth_expand_login_label.setOnClickListener {
            auth_expand_login.toggle()
        }
    }
}
