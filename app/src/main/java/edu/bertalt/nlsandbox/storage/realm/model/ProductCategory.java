package edu.bertalt.nlsandbox.storage.realm.model;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ProductCategory extends RealmObject {
    @PrimaryKey
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
