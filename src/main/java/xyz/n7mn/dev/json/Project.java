package xyz.n7mn.dev.json;

public class Project {
    // https://api.papermc.io/v2/projects/
    private String project_id;
    private String project_name;
    private String[] version_groups;
    private String[] versions;

    public Project(String project_id, String project_name, String[] version_groups, String[] versions){
        this.project_id = project_id;
        this.project_name = project_name;
        this.version_groups = version_groups;
        this.versions = versions;
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

    public String[] getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(String[] version_groups) {
        this.version_groups = version_groups;
    }

    public String[] getVersions() {
        return versions;
    }

    public void setVersions(String[] versions) {
        this.versions = versions;
    }
}
