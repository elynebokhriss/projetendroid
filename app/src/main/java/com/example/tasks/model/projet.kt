package com.example.tasks.model

class projet (
    var name: String = "",             // Propriété mutable pour le nom du projet, initialisée par défaut à une chaîne vide
    var description: String = "",      // Propriété mutable pour la description du projet, initialisée par défaut à une chaîne vide
    var deadline: String = ""
) {
    // Redéfinition de la méthode toString() pour afficher les propriétés du projet
    override fun toString(): String {
        return "Project(name='$name', description='$description', deadline='$deadline')"
    }
}