package com.example.tasks.model

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class FirestoreManager {
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun addProject(name: String, description: String, deadline: String, context: Context?) {
        if (context == null) {
            Log.e("FirestoreManager", "Le contexte est null")
            return
        }

        val project = hashMapOf(
            "name" to name,
            "description" to description,
            "deadline" to deadline
        )

        db.collection("Projects")
            .add(project)
            .addOnSuccessListener { documentReference ->
                Log.d("FirestoreManager", "Projet ajouté avec l'ID: ${documentReference.id}")
                Toast.makeText(context, "Projet ajouté avec succès", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener { e ->
                Log.e("FirestoreManager", "Erreur lors de l'ajout du projet: ${e.message}", e)
                Toast.makeText(context, "Erreur: ${e.localizedMessage}", Toast.LENGTH_SHORT).show()
            }
    }
}
