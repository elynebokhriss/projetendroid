package com.example.tasks.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tasks.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialisation de FirebaseAuth
        firebaseAuth = FirebaseAuth.getInstance()

        // Redirection vers l'écran d'inscription
        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java) // Remplacement de la classe de liaison
            startActivity(intent)
        }

        // Gestion du bouton de connexion
        binding.loginButton.setOnClickListener {
            val email = binding.emailInput.text.toString().trim()
            val password = binding.passwordInput.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Tentative de connexion
                firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            // Connexion réussie : redirection vers l'écran d'accueil
                            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                            finish() // Empêche le retour à l'écran de connexion
                        } else {
                            // Affiche une erreur spécifique si la connexion échoue
                            val errorMessage = task.exception?.localizedMessage ?: "Authentication failed!"
                            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
                        }
                    }
            } else {
                // Gestion des champs vides
                Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
