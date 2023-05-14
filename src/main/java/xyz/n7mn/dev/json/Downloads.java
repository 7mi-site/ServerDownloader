package xyz.n7mn.dev.json;

import com.google.gson.annotations.SerializedName;

public class Downloads {
    private Application application;
    @SerializedName("mojang-mappings")
    private MojangMappings MojangMappings;

    public Downloads(Application application, MojangMappings mojangMappings){
        this.application = application;
        this.MojangMappings = mojangMappings;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public xyz.n7mn.dev.json.MojangMappings getMojangMappings() {
        return MojangMappings;
    }

    public void setMojangMappings(xyz.n7mn.dev.json.MojangMappings mojangMappings) {
        MojangMappings = mojangMappings;
    }
}
