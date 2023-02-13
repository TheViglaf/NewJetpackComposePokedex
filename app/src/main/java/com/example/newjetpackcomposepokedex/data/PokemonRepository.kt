package com.example.newjetpackcomposepokedex.data

import com.example.newjetpackcomposepokedex.data.remote.PokeApi
import com.example.newjetpackcomposepokedex.data.remote.responses.Pokemon
import com.example.newjetpackcomposepokedex.data.remote.responses.PokemonList
import com.example.newjetpackcomposepokedex.utils.Resource
import org.koin.core.component.KoinComponent

class PokemonRepository(
    private val api: PokeApi
): KoinComponent {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

}