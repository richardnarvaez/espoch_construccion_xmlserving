package net.osgg.xmlserving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class httprequestXML {
    public static void get() {
        try {
            String url = "https://guarded-springs-28309.herokuapp.com/employees";
            System.out.println(url);
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            int responseCode = con.getResponseCode();

            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONArray json = new JSONArray(response.toString());
            System.out.println(json.length());
            for(int i = 0; i<= json.length()-1;i++ ){
                System.out.println("ID: " +  json.getJSONObject(i).getInt("id"));
                System.out.println("firstName: " +  json.getJSONObject(i).getString("firstName"));
                System.out.println("lastName: " +  json.getJSONObject(i).getString("lastName"));
                System.out.println("emailId: " +  json.getJSONObject(i).getString("emailId"));
            }
        } catch (Exception e) {
            System.out.println("E: " + e);
        }
    }
}

