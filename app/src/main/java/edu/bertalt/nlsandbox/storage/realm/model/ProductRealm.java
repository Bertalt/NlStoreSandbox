package edu.bertalt.nlsandbox.storage.realm.model;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

public class ProductRealm extends RealmObject {

    @PrimaryKey
    @Index
    Long id;
    String alias;
    Boolean isFavorite;
    Integer amountInBasket;

}
