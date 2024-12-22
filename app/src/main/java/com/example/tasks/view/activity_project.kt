package com.example.tasks.view
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tasks.R
import com.example.tasks.controllers.controllerp
import com.example.tasks.databinding.ActivityProjectBinding
import com.example.tasks.model.projet
class activity_project : AppCompatActivity() {
    private lateinit var binding: ActivityProjectBinding
    private lateinit var controller: controllerp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialiser le contrôleur
        controller = controllerp.getInstance()

        binding.addProjectButton.setOnClickListener {
            val projectName = binding.projectNameInput.text.toString().trim()
            val projectDescription = binding.projectDescriptionInput.text.toString().trim()
            val projectDeadline = binding.projectDeadlineInput.text.toString().trim()

            if (projectName.isEmpty() || projectDescription.isEmpty() || projectDeadline.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
            } else {
                val newProject = projet(projectName, projectDescription, projectDeadline)
                controller.addProject(newProject, this) // Ajouter le projet
                clearFields()
            }
        }
    }

    private fun clearFields() {
        binding.projectNameInput.text?.clear()
        binding.projectDescriptionInput.text?.clear()
        binding.projectDeadlineInput.text?.clear()
    }
}
