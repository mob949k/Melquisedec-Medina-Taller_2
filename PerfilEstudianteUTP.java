/**
 * Ficha de matrícula estudiantil UTP.
 *
 * @author Melquisedec Medina - 8-1051-683
 * @version 1.0
 */
public class PerfilEstudianteUTP {

    public static void main(String[] args) {

        // ==============================================================
        // NIVEL 1: IDENTIFICADORES Y TIPOS DE DATOS PRIMITIVOS
        // ==============================================================

        // TODO 2.1 resuelto: identificador en camelCase
        String primerNombre = "Carlos Pérez";

        // TODO 2.2 resuelto: sin guion medio, en camelCase
        int creditosMatriculados = 18;

        // TODO 2.3 resuelto: double para conservar los decimales
        double costoCredito = 15.50;

        // TODO 2.4 resuelto: tipo primitivo boolean, literal sin comillas
        boolean estaPazYSalvo = true;

        // TODO 2.5 resuelto: inicial del segundo nombre
        char inicialSegundoNombre = 'M';

        // ==============================================================
        // NIVEL 2: CONSTANTES (final) E INMUTABILIDAD
        // ==============================================================

        // TODO 3.1 resuelto: final + UPPER_SNAKE_CASE
        final double CARNET_ESTUDIANTIL = 5.00;

        // TODO 3.2 resuelto: se eliminó la reasignación que violaba la inmutabilidad

        // ==============================================================
        // NIVEL 3: CÁLCULO ARITMÉTICO Y SALIDA FORMATO COMPROBANTE
        // ==============================================================

        // TODO 4 resuelto: cálculos con los nombres corregidos
        double subtotalMatricula = creditosMatriculados * costoCredito;
        double totalPagar = subtotalMatricula + CARNET_ESTUDIANTIL;

        System.out.println("==========================================");
        System.out.println("    FICHA DE MATRÍCULA ESTUDIANTIL UTP");
        System.out.println("==========================================");
        System.out.println("Estudiante : " + primerNombre);
        System.out.println("Paz y Salvo: " + estaPazYSalvo);
        System.out.println("Subtotal   : $" + subtotalMatricula);
        System.out.println("Total      : $" + totalPagar);
        System.out.println("==========================================");
    }
}