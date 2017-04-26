package edu.bertalt.nlsandbox.storage.realm

import edu.bertalt.nlsandbox.storage.realm.model.ProductRealm
import io.realm.RealmResults

object NlRealmHelper {

    fun insertProducts(insertArray: List<ProductRealm>) {
        val db = NlRealmBuilder.getRealm()
        insertArray.forEach {
            db.copyToRealmOrUpdate(it)
        }
        db.also {
            if (db.isClosed.not())
                db.close()
        }
    }

    fun getAllProducts(): RealmResults<ProductRealm> {
        NlRealmBuilder.getRealm().use {
            return it.where(ProductRealm::class.java).findAll()
        }
    }

}