class juego(){

    val piedra: String = "piedra"
    val papel: String = "papel"
    val tijera: String = "tijera"
    val listaJugadasPosibles: List<String> = listOf(piedra, papel, tijera)

        fun logicadejuego(jugadaJugador: String){
        val jugadaCompu = listaJugadasPosibles.random()
            println("Tu lanzaste $jugadaJugador")
            println("La compu lanza $jugadaCompu")
            if (jugadaJugador == piedra) {
                if (jugadaCompu == piedra) {
                    println("Es un empate!")
                } else if (jugadaCompu == papel) {
                    println("El papel envuelve a la piedra. Lo siento, perdiste!")
                } else if (jugadaCompu == tijera) {
                    println("La piedra destruye a la tijera. Muy bien ganaste!")
                }
            }else if(jugadaJugador == papel){
                if (jugadaCompu == piedra) {
                    println("El papel envuelve a la piedra. Muy bien ganaste!")
                } else if (jugadaCompu == papel) {
                    println("Es un empate!")
                } else if (jugadaCompu == tijera) {
                    println("La tijera corta al papel. Lo siento, perdiste!")
                }
            }else if(jugadaJugador == tijera){
                if (jugadaCompu == piedra) {
                    println("La piedra destruye a la tijera. Lo siento, perdiste!")
                } else if (jugadaCompu == papel) {
                    println("La tijera corta al papel. Muy bien ganaste!")
                } else if (jugadaCompu == tijera) {
                    println("Es un empate!")
                }
            }
        }
}

fun main(args: Array<String>) {
    val juego1 = juego()
    juego1.logicadejuego("piedra")

}