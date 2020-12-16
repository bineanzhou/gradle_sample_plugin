package com.qh.sample.plugin1

import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePluginImpl1 implements Plugin<Project> {
    void apply(Project project) {
        project.task('testTask') {
            println "Hello gradle plugin buildSrc"
        }
    }
}