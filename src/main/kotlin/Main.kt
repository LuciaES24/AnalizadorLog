import java.io.File

fun main() {
    print("Escriba la ruta del archivo log del modelo:")
    var rutaModelo = readln()
    var logModelo = File(rutaModelo)
    print("Escriba la ruta del archivo log del controlador:")
    var rutaControlador = readln()
    var logControlador = File(rutaControlador)

    var lineasModelo = logModelo.bufferedReader().lines()
    var lineasControlador = logControlador.bufferedReader().lines()

    var contaErrorModelo = 0
    var contaErrorControlador = 0

    for (line in lineasModelo){
        if (line.contains("ERROR")){
            contaErrorModelo++
            println("MODELO || "+line)
        }
    }

    for (line in lineasControlador){
        if (line.contains("ERROR")){
            contaErrorControlador++
            println("CONTROLADOR || "+line)
        }
    }

    println("Se han detectado $contaErrorModelo errores en el Modelo")
    println("Se han detectado $contaErrorControlador errores en el Controlador")

}