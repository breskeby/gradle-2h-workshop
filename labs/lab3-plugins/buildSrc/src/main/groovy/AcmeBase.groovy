// A base class for projects in acme org that pre configures
// the central coorporate maven repository

import org.gradle.api.Project
import org.gradle.api.Plugin

class AcmeBase implements Plugin<Project> {
    void apply(Project project){
        project.repositories {
            mavenCentral()
        }
    }
}
