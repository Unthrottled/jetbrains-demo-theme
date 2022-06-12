package com.github.unthrottled.jetbrainsdemotheme.services

import com.intellij.openapi.project.Project
import com.github.unthrottled.jetbrainsdemotheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
