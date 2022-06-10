package com.github.shuyutech.codeplus.services

import com.intellij.openapi.project.Project
import com.github.shuyutech.codeplus.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
