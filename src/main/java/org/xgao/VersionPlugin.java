package org.xgao;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class VersionPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        String projectVersion = "projectVersion";
        if (project.hasProperty(projectVersion))
        {
        
            project.task("version").doLast(task -> {
                String version;
                try{   
                    version =  project.property(projectVersion).toString();            
                    if (version.isEmpty()) {
                        version = "DEVELOPMENT";
                    } 
                    System.out.println("The project version is " + version);
                    project.setVersion(version);
                    System.out.println("The project version has been set to " + version);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
            );
        }
            
        
    }

    public static void main(String[] args){
        System.out.println("This is a test");
    }
}
