package com.github.falchio.engdictionaryapp.model

import com.github.falchio.engdictionaryapp.model.repository.local.LocalRepository
import com.github.falchio.engdictionaryapp.model.repository.local.LocalRepositoryImpl
import com.github.falchio.engdictionaryapp.model.repository.remote.RemoteRepository
import com.github.falchio.engdictionaryapp.model.repository.remote.RemoteRepositoryImpl

class ModelImpl:Model {
    private val localRepository: LocalRepository = LocalRepositoryImpl()
    private val remoteRepository: RemoteRepository = RemoteRepositoryImpl()

    override fun getData(word: String) {
        if (isOnline()){
            remoteRepository.getData(word)
        } else{
            localRepository.getData(word)
        }
    }

    override fun isOnline(): Boolean {
        return true
    }
}