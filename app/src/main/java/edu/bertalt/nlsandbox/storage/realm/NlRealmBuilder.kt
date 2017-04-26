package edu.bertalt.nlsandbox.storage.realm

import io.realm.Realm
import io.realm.RealmConfiguration


object NlRealmBuilder {
    private val DB_NAME = "nl_sandbox.realm"
    private val SCHEMA_VERSION = 1L

    private val mConfig = RealmConfiguration.Builder()
            .name(DB_NAME)
            .schemaVersion(SCHEMA_VERSION)
            .build()

    fun getRealm(): Realm = Realm.getInstance(mConfig)
}