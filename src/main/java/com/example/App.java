package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Usamos un solo Scanner para toda la aplicación
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== VARIABLES Y CONSTANTES =====");
        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();

        System.out.println("\n===== TIPOS DE DATOS PRIMITIVOS =====");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();

        System.out.println("\n===== CONVERSIÓN DE TIPOS =====");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();

        System.out.println("\n===== OPERADORES =====");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadorTernario();

        System.out.println("\n===== ENTRADA DE DATOS =====");
        // Estos métodos usan el scanner, mantenemos el flujo abierto
        EntradaDeDatos.leerVariosTipos(scanner);
        EntradaDeDatos.manejarSaltoDeLineaPendiente(scanner);

        System.out.println("\n===== ESTRUCTURAS CONDICIONALES =====");
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();

        System.out.println("\n===== ESTRUCTURAS DE REPETICIÓN =====");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();

        System.out.println("\n===== MÉTODOS ESTÁTICOS =====");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros();
        MetodosEstaticosSimples.ejemploRetornoValores();
        MetodosEstaticosSimples.ejemploSobrecarga();

        System.out.println("\n===== ARREGLOS UNIDIMENSIONALES =====");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        ArreglosUnidimensionales.arrayComoParametroYRetorno();

        System.out.println("\n===== ARREGLOS BIDIMENSIONALES =====");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipicos();

        System.out.println("\n===== MANIPULACIÓN DE CADENAS =====");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.demostrarInmutabilidad();
        ManipulacionCadenas.usarStringBuilder();

        System.out.println("\n===== MANEJO BÁSICO DE EXCEPCIONES =====");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        // Si estos métodos piden datos, el scanner debe seguir abierto
        ManejoBasicoExcepciones.ejemploTryCatchInput(); 
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();

        System.out.println("\n===== FIN DEL PROGRAMA =====");
        
        // CERRAMOS EL SCANNER AL FINAL DE TODO EL PROGRAMA
        scanner.close();
    }
}
