package xyz.n7mn.dev.json;

import com.google.gson.annotations.SerializedName;

public class Builds {
    private String project_id;
    private String project_name;
    private String version;
    private Build[] builds;

    public Builds(String project_id, String project_name, String version, Build[] builds){
        this.project_id = project_id;
        this.project_name = project_name;
        this.version = version;
        this.builds = builds;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Build[] getBuilds() {
        return builds;
    }

    public void setBuilds(Build[] bulids) {
        this.builds = bulids;
    }
}
