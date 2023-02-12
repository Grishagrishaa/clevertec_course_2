package ru.clevertec.standalonePlugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CopyPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.tasks.register('myCopyPluginTask') {

            onlyIf {
                project.file("$project.buildDir").exists()
            }
            doFirst {
                project.copy {
                    from("$project.buildDir/reports")
                    into("$project.rootDir/reports/reports-result")
                }
            }
            doFirst {
                project.copy {
                    from("$project.buildDir/test-results")
                    into("$project.rootDir/reports/test-result")
                }
            }
        }
    }
}
