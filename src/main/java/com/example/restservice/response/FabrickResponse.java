package com.example.restservice.response;

import com.example.restservice.model.FabrickModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FabrickResponse {


    private String status;
    private ArrayList error;
    private Map<String, List<FabrickModel>> payload;

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "FabrickResponse{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", payload=" + payload +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList getError() {
        return error;
    }

    public void setError(ArrayList error) {
        this.error = error;
    }

    public Map<String, List<FabrickModel>> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, List<FabrickModel>> payload) {
        this.payload = payload;
    }
}
