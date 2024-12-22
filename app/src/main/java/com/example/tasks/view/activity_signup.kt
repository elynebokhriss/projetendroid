package com.example.tasks.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tasks.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialisation du binding pour lier la vue
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialisation de FirebaseAuth
        firebaseAuth = FirebaseAuth.getInstance()

        // Gestionnaire de clic pour rediriger vers l'écran de connexion
        binding.tvSignIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Gestionnaire de clic pour le bouton de création de compte
        binding.signupButton.setOnClickListener {
            val email = binding.emailInput.text.toString().trim()
            val password = binding.passwordInput.text.toString().trim()
            val confirmPassword = binding.confirmPasswordInput.text.toString().trim()

            // Vérification que les champs email, mot de passe et confirmation de mot de passe ne sont pas vides
            if (email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                // Vérification que les mots de passe correspondent
                if (password == confirmPassword) {
                    // Création du compte utilisateur avec Firebase
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                // Si la création du compte est réussie, redirection vers l'écran de connexion
                                Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show()
                                val intent = Intent(this, LoginActivity::class.java)
                                startActivity(intent)
                                finish() // Empêche le retour à l'écran d'inscription
                            } else {
                                // Affichage d'un message d'erreur en cas d'échec de création du compte
                                val errorMessage = task.exception?.localizedMessage ?: "Registration failed!"
                                Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
                            }
                        }
                } else {
                    // Affichage d'un message si les mots de passe ne correspondent pas
                    Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Affichage d'un message si les champs email, mot de passe ou confirmation de mot de passe sont vides
                Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
