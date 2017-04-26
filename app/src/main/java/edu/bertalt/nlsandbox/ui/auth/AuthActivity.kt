package edu.bertalt.nlsandbox.ui.auth

import android.os.Bundle
import android.view.View
import edu.bertalt.nlsandbox.R
import edu.bertalt.nlsandbox.mvp.view.BaseMvpActivity
import edu.bertalt.nlsandbox.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : BaseMvpActivity<AuthContract.View, AuthContract.Presenter>(),
        AuthContract.View {
    override fun getRootView(): View? = auth_activity

    override fun toggleAuth() {
        auth_expand_login.toggle()
    }

    override fun goOnMainScreen() {
        startActivity(MainActivity.getIntent(this))
    }

    override var mPresenter: AuthContract.Presenter = AuthPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setupLayouts()
    }

    fun setupLayouts() {
        auth_expand_login_label.setOnClickListener {
            toggleAuth()
        }
        auth_btn_login.setOnClickListener {
            requestAuth()
        }

    }

    private fun requestAuth() {
        val email = auth_edit_email.text.toString()
        val password = auth_edit_pass.text.toString()
        mPresenter.requestAuth(email, password)
    }
}
