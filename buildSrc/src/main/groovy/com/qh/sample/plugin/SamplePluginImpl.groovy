package com.qh.sample.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePluginImpl implements Plugin<Project> {
    void apply(Project project) {
        project.task('testTask') {
            println "Hello gradle plugin buildSrc"
        }
    }
}