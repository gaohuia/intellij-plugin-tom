package com.github.gaohuia.intellijplugintom.services

import com.intellij.openapi.project.Project
import com.github.gaohuia.intellijplugintom.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
