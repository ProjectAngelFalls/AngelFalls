package com.example.android.project_angel_falls.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.android.project_angel_falls.MainActivity
import com.example.android.project_angel_falls.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SignInFragment : Fragment() {
    var auth = FirebaseAuth.getInstance()
    var currentUser = auth.currentUser

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.loginBTN).setOnClickListener {
            Log.d("cc","chal jaa saale")
            val email = view.findViewById<EditText>(R.id.emailETXT)
            val pswd = view.findViewById<EditText>(R.id.pswdETXT)
            if ( email.text.toString()
                    .isEmpty() || pswd.text.toString().isEmpty()
            ) {
                email.error = "All fields are required"
                pswd.error = "All fields are required"
            }
            else{
                signIn(email.text.toString(),pswd.text.toString())
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }
    fun updateUI(user: FirebaseUser?){
        if(user != null){
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }
}
    fun signIn(email: String,pswd: String){
        activity?.let {
            auth.signInWithEmailAndPassword(email, pswd)
                .addOnCompleteListener(it) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("TAG", "signInWithEmail:success")
                        val user = auth.currentUser
                        updateUI(user)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("TAG", "signInWithEmail:failure", task.exception)
                        Toast.makeText(activity, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                        updateUI(null)
                    }
                }
        }


    }
}