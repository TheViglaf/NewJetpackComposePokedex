package com.example.newjetpackcomposepokedex.di

import com.example.newjetpackcomposepokedex.data.PokemonRepository
import com.example.newjetpackcomposepokedex.data.remote.PokeApi
import com.example.newjetpackcomposepokedex.pokemondetail.PokemonDetailViewModel
import com.example.newjetpackcomposepokedex.pokemonlist.PokemonListViewModel
import com.example.newjetpackcomposepokedex.utils.Constants.BASE_URL
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokeApi::class.java)
    }
    singleOf(::PokemonRepository)
    viewModelOf(::PokemonListViewModel)
    viewModelOf(::PokemonDetailViewModel)

}

