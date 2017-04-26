package edu.bertalt.nlsandbox.storage.realm.model;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

public class ProductRealm extends RealmObject {

    @PrimaryKey
    @Index
    private  Long id;
    private String alias;
    private Boolean isFavorite;
    private Integer amountInBasket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public Integer getAmountInBasket() {
        return amountInBasket;
    }

    public void setAmountInBasket(Integer amountInBasket) {
        this.amountInBasket = amountInBasket;
    }
}
