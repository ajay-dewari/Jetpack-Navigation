package me.ajay.jetpack_navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment: Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userName = edit_text_username.text.toString()
        val pwd = edit_text_password.text.toString()
        button_confirm.setOnClickListener{
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(userName, pwd)
            findNavController().navigate(action)
        }
    }
}