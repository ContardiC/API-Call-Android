package it.spacecoding.api_call_android;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RandomUserModel {
    private String firstName;
    private String gender;

    // Create a RandomUserModel object from a JSON object
    public  static RandomUserModel fromJSON(JSONObject json) {
        RandomUserModel model = new RandomUserModel();
        try {
             JSONArray results = json.getJSONArray("results");
             JSONObject user = results.getJSONObject(0);
             model.gender = user.getString("gender");
             model.firstName = user.getJSONObject("name").getString("first");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return model;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }
}
