package com.devo.elmart.dummylib

import org.gradle.api.initialization.*
import org.gradle.api.*

class DummylibBuildPlugin implements Plugin<Settings> {
  void apply(Settings settings) {
    settings.with {
      rootProject.name = 'dummylib'
      gradle.rootProject {
        apply plugin: 'java-library'

        group "com.devo.elmart"

        println "---- PROJECT ----" + project.name
        println "---- NORMAL REPOS ----" + project.repositories.collect {it.name}
        println "---- PLUGIN MANAGEMENT REPOS ----" + gradle.settings.pluginManagement.repositories.collect {it.name}
      }
    }
  }
}