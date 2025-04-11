package desafios.`01_gasolina_etanol`

fun main() {

    print("Entre com o preço da gasolina: R$ ")
    val gasolina = readlnOrNull()?.toDoubleOrNull()

    print("Entre com o preço do etanol: R$ ")
    val etanol = readlnOrNull()?.toDoubleOrNull()

    if (gasolina == null || etanol == null) {
        println("Os valores inseridos são inválidos.")
        return
    }

    val razao = etanol / gasolina

    println(
        when {
            razao < 0.7 -> "Etanol é mais econômico"
            razao > 0.7 -> "Gasolina é mais econômico"
            else -> "Ambos os combustíveis tem o mesmo custo-benefício"
        }
    )

}