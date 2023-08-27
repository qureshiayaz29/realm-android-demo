package com.example.realmandroid.data.model

import io.realm.RealmObject

open class Person: RealmObject() {
    var name: String = ""
}