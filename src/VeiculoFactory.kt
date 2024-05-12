class VeiculoFactory {
    fun createVeiculo(type: Int): Veiculo {
        return when(type){
            1 -> Carro()
            else -> Moto()

        }
    }
}