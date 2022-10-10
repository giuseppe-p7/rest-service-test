package com.example.restservice.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FabrickBonificoResponse {
    private String status;
    private HashMap<String, String> error;
    private Map<String, List<String>> payload;

    @Override
    public String toString() {
        return "FabrickBonificoResponse{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", payload=" + payload +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HashMap<String, String> getError() {
        return error;
    }

    public void setError(HashMap<String, String> error) {
        this.error = error;
    }

    public Map<String, List<String>> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, List<String>> payload) {
        this.payload = payload;
    }
}
