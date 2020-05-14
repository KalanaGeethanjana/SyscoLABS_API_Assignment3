package com.sysco.sample.api.response.model;

public class ProjectModel {

    public float id;
    public float dept_id;
    public String name;
    public String code;
    public String description;
    public float active;
    public String created_at;
    public String updated_at;
    public String jenkin_server_id = null;
    public float jira_server_id;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getDept_id() {
        return dept_id;
    }

    public void setDept_id(float dept_id) {
        this.dept_id = dept_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getActive() {
        return active;
    }

    public void setActive(float active) {
        this.active = active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getJenkin_server_id() {
        return jenkin_server_id;
    }

    public void setJenkin_server_id(String jenkin_server_id) {
        this.jenkin_server_id = jenkin_server_id;
    }

    public float getJira_server_id() {
        return jira_server_id;
    }

    public void setJira_server_id(float jira_server_id) {
        this.jira_server_id = jira_server_id;
    }


}
