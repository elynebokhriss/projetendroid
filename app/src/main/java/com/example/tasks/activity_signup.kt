package com.example.tasks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference

class SignupActivity : AppCompatActivity() {
  //  private lateinit var auth: FirebaseAuth
   // private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //auth = FirebaseAuth.getInstance()
       // database = FirebaseDatabase.getInstance().reference

        //val emailInput = findViewById<EditText>(R.id.emailInput)
       // val passwordInput = findViewById<EditText>(R.id.passwordInput)
       // val roleGroup = findViewById<RadioGroup>(R.id.roleGroup)
        //val signupButton = findViewById<Button>(R.id.signupButton)

       // signupButton.setOnClickListener {
          //  val email = emailInput.text.toString()
           // val password = passwordInput.text.toString()
           // val role = if (roleGroup.checkedRadioButtonId == R.id.radioAdmin) "admin" else "user"

           // auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
              //  if (task.isSuccessful) {
                 //   val userId = auth.currentUser!!.uid
                  //  val user = mapOf("email" to email, "role" to role)

                  //  database.child("users").child(userId).setValue(user)
                      //  .addOnSuccessListener {
                         ///   Toast.makeText(this, "Inscription réussie", Toast.LENGTH_SHORT).show()
                           // finish()
                        //}
               // } else {
                   // Toast.makeText(this, "Erreur: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
               // }
          //  }
       // }
    }
}
