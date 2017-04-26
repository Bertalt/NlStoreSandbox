package edu.bertalt.nlsandbox.storage.realm

import edu.bertalt.nlsandbox.storage.realm.model.ProductRealm

object NlRealmHelper {

    fun insertProducts(insertArray: Array<ProductRealm>) {
        val db = NlRealmBuilder.getRealm()
        insertArray.forEach {
            db.copyToRealmOrUpdate(it)
        }
        db.also {
            if (db.isClosed.not())
                db.close()
        }
    }

}