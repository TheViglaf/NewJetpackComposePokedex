package com.example.newjetpackcomposepokedex.data

import com.example.newjetpackcomposepokedex.data.remote.responses.Pokemon
import com.example.newjetpackcomposepokedex.data.remote.responses.PokemonList
import com.example.newjetpackcomposepokedex.utils.Resource


interface PokemonRepository {
    fun pokemonList(limit: Int, offset: Int): Resource<PokemonList>
    fun pokemonInfo(pokemonName: String): Resource<Pokemon>
}

class PokemonRepositoryImpl: PokemonRepository{

    private val _pokemonList = (mutableListOf<PokemonList>())
    private val _pokemonInfo = (mutableListOf<Pokemon>())

    override fun pokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        TODO("Not yet implemented")
    }

    override fun pokemonInfo(pokemonName: String): Resource<Pokemon> {
        TODO("Not yet implemented")
    }

}