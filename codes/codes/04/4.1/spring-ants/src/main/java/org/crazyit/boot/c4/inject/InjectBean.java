package org.crazyit.boot.c4.inject;

public class InjectBean {

    private String id;
    
    public InjectBean(String id) {
        this.id = id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
