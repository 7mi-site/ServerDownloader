package xyz.n7mn.dev;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import xyz.n7mn.dev.json.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) {

        // https://api.papermc.io/v2/projects/
        try {
            String project = null;
            String version = null;

            if (args.length == 0){
                Request request = new Request.Builder().url("https://api.papermc.io/v2/projects/").build();
                Response response = client.newCall(request).execute();

                System.out.println("以下のソフトのどれかを入力してください");
                Projects json = new Gson().fromJson(response.body().string(), Projects.class);
                for (String str : json.getProjects()){
                    System.out.println(str);
                }
                response.close();

                System.out.print("入力 : ");
                project = new Scanner(System.in).next();
            }
            if (args.length == 1){
                project = args[0];
            }
            if (args.length == 2){
                project = args[0];
                version = args[1];
            }

            download(project, version);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void download(String project, String version){
        try {
            if (version == null){
                Request request = new Request.Builder().url("https://api.papermc.io/v2/projects/"+project+"/").build();
                Response response = client.newCall(request).execute();

                System.out.println("DL可能なバージョンは以下のとおりです。");
                Project project1 = new Gson().fromJson(response.body().string(), Project.class);
                for (String str : project1.getVersions()){
                    System.out.println(str);
                }
                response.close();

                System.out.print("バージョンを入力してください : ");
                version = new Scanner(System.in).next();

            }

            Request request = new Request.Builder().url("https://api.papermc.io/v2/projects/"+project+"/versions/"+version+"/builds").build();
            Response response = client.newCall(request).execute();
            Builds json = new Gson().fromJson(response.body().string(), Builds.class);
            response.close();

            //System.out.println(json.getVersion());
            int build = json.getBuilds()[json.getBuilds().length - 1].getBuild();
            String fileName = json.getBuilds()[json.getBuilds().length - 1].getDownloads().getApplication().getName();

            // https://api.papermc.io/v2/projects/paper/versions/1.19.4/builds/449/downloads/paper-1.19.4-449.jar
            System.out.println(project+"の"+"バージョン "+version+"の最新は"+build+"です。");
            String url = "https://api.papermc.io/v2/projects/"+project+"/versions/"+version+"/builds/"+build+"/downloads/"+fileName;
            System.out.println(url+"からDL開始");
            Request request2 = new Request.Builder().url(url).build();
            Response response2 = client.newCall(request2).execute();

            byte[] bytes = response2.body().bytes();
            response2.close();
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("./" + fileName));
            stream.write(bytes);
            stream.flush();
            stream.close();
            System.out.println("DL完了！");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
