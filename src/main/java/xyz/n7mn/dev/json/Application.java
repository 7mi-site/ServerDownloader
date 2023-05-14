package xyz.n7mn.dev.json;

public class Application {
    private String name;
    private String sha256;

    public Application(String name, String sha256){
        this.name = name;
        this.sha256 = sha256;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }
}
