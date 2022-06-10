package io.github.gqrlt1207;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class VersionPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        String version = "DEVELOPMENT";
        try{ 
            if (project.hasProperty("projectVersion")) {
                version = project.property("projectVersion").toString(); 
            } 
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        project.setVersion(version);
        System.out.println("The project version has been set to " + version);
    }
}