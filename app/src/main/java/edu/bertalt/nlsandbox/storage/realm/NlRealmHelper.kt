package edu.bertalt.nlsandbox.storage.realm

import edu.bertalt.nlsandbox.storage.realm.model.ProductRealm
import io.realm.RealmResults

object NlRealmHelper {

    fun insertProducts(insertArray: List<ProductRealm>) {
        val db = NlRealmBuilder.getRealm()
        db.executeTransaction {
            insertArray.forEach {
                db.copyToRealmOrUpdate(it)
            }
        }
                .also {
                    if (db.isClosed.not())
                        db.close()
                }
    }

    fun getAllProducts(): RealmResults<ProductRealm> {
        return NlRealmBuilder.getRealm().where(ProductRealm::class.java).findAll()

    }

}