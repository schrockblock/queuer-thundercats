package com.demo.queuer;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.Before;

import org.robolectric.RobolectricTestRunner;

import android.app.Activity;
import android.widget.TextView;

import com.demo.queuer.models.Project;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.Exception;
import java.lang.reflect.Type;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;

import dalvik.annotation.TestTargetClass;

@RunWith(RobolectricTestRunner.class)
public class SyncTests {
    private ArrayList<Project> projects;

    @Before
    public void testInstantiation() {

        String jsonString = "[{\"color\":-16661061,\"created_at\":\"2014-01-22T17:36:10Z\",\"id\":95,\"name\":\"Winter Study\",\"updated_at\":\"2014-01-22T17:36:10Z\",\"tasks\":[{\"created_at\":\"2014-01-22T17:36:30Z\",\"finished\":false,\"id\":1183,\"name\":\"Add unit tests to project\",\"order\":0,\"project_id\":95,\"updated_at\":\"2014-01-22T17:36:30Z\"}]}]";
        JSONArray jsonObject = null;
        try {
            jsonObject = new JSONArray(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Type listType = new TypeToken<ArrayList<Project>>() {}.getType();
        projects = new Gson().fromJson(jsonObject.toString(), listType);

        assertNotNull("Projects are null!", projects);
        assertNotNull("Updated_at is null!", projects.get(0).getUpdated_at());
    }

    @Test
    public void testLocalProjectOlder(){
        Project serverProject = projects.get(0);

        Project localProject = new Project();
        localProject.setLocalId(1);
        Date localUpdated = (Date)serverProject.getUpdated_at().clone();
        localUpdated = new Date(localUpdated.getTime() - 1 * 3600 * 1000);
        localProject.setUpdated_at(localUpdated);

        Project result = Project.syncProject(serverProject, localProject);

        assertEquals("LocalId not transferred!", result.getLocalId(), localProject.getLocalId());
        assertEquals("Server project title not in result", result.getName(), serverProject.getName());
    }

    @Test
    public void testServerProjectOlder(){
        Project localProject = projects.get(0);
        localProject.setLocalId(2);

        Project serverProject = new Project();
        Date serverUpdated = (Date)localProject.getUpdated_at().clone();
        serverUpdated = new Date(serverUpdated.getTime() - 1 * 3600 * 1000);
        serverProject.setUpdated_at(serverUpdated);

        Project result = Project.syncProject(localProject, serverProject);

        assertEquals("LocalId not transferred!", result.getLocalId(), localProject.getLocalId());
        assertEquals("Server project title not in result", result.getName(), localProject.getName());
    }

    @Test
    public void testLocalId(){
        int testId = 10;

        Project project = new Project();
        project.setLocalId(testId);

        assertEquals(testId, project.getLocalId());
    }
}