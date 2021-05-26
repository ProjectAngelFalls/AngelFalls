package com.example.android.project_angel_falls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.UserProfileChangeRequest
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignIn : AppCompatActivity() {

    //firebase insatance
    var auth = FirebaseAuth.getInstance()
    var currentUser = auth.currentUser
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // condn for checking whether signed in or not
        if(currentUser != null){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        changeSignUp.setOnClickListener {

            changeSignUp.visibility = View.GONE
            changeSignIn.visibility = View.VISIBLE
            emailETXT1.visibility = View.GONE
            pswdETXT1.visibility = View.GONE
            loginBTN1.visibility =View.GONE

            nameETEXT.visibility =View.VISIBLE
            emailETXT.visibility = View.VISIBLE
            pswdETXT.visibility = View.VISIBLE
            loginBTN.visibility =View.VISIBLE
        }
        changeSignIn.setOnClickListener {
            changeSignIn.visibility = View.GONE
            changeSignUp.visibility =View.VISIBLE

            nameETEXT.visibility =View.GONE
            emailETXT.visibility = View.GONE
            pswdETXT.visibility = View.GONE
            loginBTN.visibility =View.GONE

            emailETXT1.visibility = View.VISIBLE
            pswdETXT1.visibility = View.VISIBLE
            loginBTN1.visibility =View.VISIBLE


        }
        loginBTN1.setOnClickListener{
            signIn(emailETXT1.text.toString(),pswdETXT1.text.toString())
        }
        loginBTN.setOnClickListener{
            signUp(nameETEXT.text.toString(),emailETXT.text.toString(),pswdETXT.text.toString())
        }

    }
    fun signUp(name: String,email: String,pswd: String){
        Log.d("aa","asfafaf")
        this?.let {
            auth.createUserWithEmailAndPassword(email, pswd)
                .addOnCompleteListener(it) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("TAG", "createUserWithEmail:success")
                        val user = auth.currentUser
                        //code for user profile change request
                        var userDetail = UserProfileChangeRequest.Builder().setDisplayName(name).build()
                        user!!.updateProfile(userDetail).addOnCompleteListener { Log.d("check","profile change request") }
                        updateUI(user)

                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("TAG", "createUserWithEmail:failure", task.exception)
                        Toast.makeText(this, "Authentication failed.${task.exception?.message}",
                            Toast.LENGTH_SHORT).show()
                        updateUI(null)
                    }
                }
        }
    }
    fun updateUI(user: FirebaseUser?){
        if(user != null){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun signIn(email: String,pswd: String){
        this.let {
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
                        Toast.makeText(this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                        updateUI(null)
                    }
                }
        }


    }


}