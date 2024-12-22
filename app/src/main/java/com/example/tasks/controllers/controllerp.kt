package com.example.tasks.controllers

import android.content.Context
import com.example.tasks.model.FirestoreManager
import com.example.tasks.model.projet

class controllerp private constructor() {

    private val firestoreManager = FirestoreManager()

    fun addProject(project: projet, context: Context?) {
        firestoreManager.addProject(project.name, project.description, project.deadline, context)
    }

    companion object {
        private var instance: controllerp? = null
        fun getInstance(): controllerp {
            if (instance == null) {
                instance = controllerp()
            }
            return instance!!
        }
    }
}
