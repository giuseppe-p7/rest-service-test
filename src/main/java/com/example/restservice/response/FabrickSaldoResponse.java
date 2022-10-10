package com.example.restservice.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FabrickSaldoResponse {


        private String status;
        private ArrayList error;
        private Map<String, String> payload;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FabrickSaldoResponse{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", payload=" + payload +
                '}';
    }

    public ArrayList getError() {
        return error;
    }

    public void setError(ArrayList error) {
        this.error = error;
    }

    public Map<String, String> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, String> payload) {
        this.payload = payload;
    }
}

