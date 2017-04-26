package edu.bertalt.nlsandbox;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import edu.bertalt.nlsandbox.storage.realm.NlRealmHelper;
import edu.bertalt.nlsandbox.storage.realm.model.ProductRealm;
import io.realm.Realm;


public class NlApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        insertMockedProducts();
    }

    private void insertMockedProducts() {
        if (NlRealmHelper.INSTANCE.getAllProducts().isEmpty()) {
            List<ProductRealm> insertList = new ArrayList();

            for (Long i = 0L; i < 30; i++) {
                ProductRealm next = new ProductRealm();
                next.setId(i);
                next.setAlias("Product N" + i);
                next.setFavorite(false);
                insertList.add(next);
            }
            NlRealmHelper.INSTANCE.insertProducts(insertList);
        }
    }
}
