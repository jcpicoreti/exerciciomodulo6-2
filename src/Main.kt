fun main() {
    val factory = VeiculoFactory()
    val veiculosList : MutableList<Veiculo> = mutableListOf()

    for (i in 1..2){
        val veiculo = factory.createVeiculo(i)
        veiculosList.add(veiculo)
    }

    veiculosList.forEach{
        veiculo ->
        veiculo.velocityUp()
        println(veiculo.velocity)

    }
}