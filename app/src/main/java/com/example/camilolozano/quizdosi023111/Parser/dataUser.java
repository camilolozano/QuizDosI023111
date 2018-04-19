package com.example.camilolozano.quizdosi023111.Parser;

import com.example.camilolozano.quizdosi023111.Models.Users;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilolozano on 17/04/18.
 */

public class dataUser {

    public static List<Users> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);
        List<Users> postList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            Users users = new Users();

            System.out.println();


            users.setName(item.getString("name"));
            users.setUsername(item.getString("username"));
            users.setEmail(item.getString("email"));
            users.setStreet(item.getJSONObject("address").getString("street"));

            postList.add(users);

        }

        return postList;
    }

}
