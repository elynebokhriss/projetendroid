package com.example.tasks.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tasks.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.addProject.setOnClickListener {
            val intent = Intent(this, activity_project::class.java)  // Remplacez par l'activité appropriée
            startActivity(intent)
        }


        binding.ajouterTasks.setOnClickListener {
            val intent = Intent(this, Activity_Task::class.java)  // Remplacez par l'activité appropriée
            startActivity(intent)
        }

        // Gestionnaire de clic pour le bouton "Supprimer un produit"
        binding.dashborduser.setOnClickListener {
            val intent = Intent(this, dashborduser::class.java)  // Assurez-vous que la classe commence par une majuscule
            startActivity(intent)
        }
    }
}
