package planningforgold;

import java.io.*;

public class Planningforgold {

    public static void main(String[] args) throws IOException {                
        int comentariosHtml = 0;
        int comentariosAplicacion = 0;
        int direccionesIp = 0;
        int correosElectronicos = 0;
        int consultasSql = 0;
        int cadenasConexionBd = 0;
        int camposTipoHidden = 0;
        
        String direccion = "C:\\Users\\jesus_000\\Desktop\\panningforgold-master";
        File dir = new File(direccion);
        String[] ficheros = dir.list();
        
        if(ficheros == null)
        {
            System.out.println("No hay archivos disponibles.");
        }
        else
        {
            for (int i = 0; i < ficheros.length; i++) 
            {
                Lectordearchivos read = new Lectordearchivos();
                System.out.println("----- Archivo " + (i + 1) + " -----");
                System.out.println(read.Lectordearchivos(direccion + "\\" + ficheros[i]));
                
                comentariosHtml += read.getComentariosHtml();
                comentariosAplicacion += read.getComentariosAplicacion();
                direccionesIp += read.resultadoDireccionesIp;
                correosElectronicos += read.getCorreosElectronicos();
                consultasSql += read.getConsultasSql();
                cadenasConexionBd += read.getCadenasConexionBd();
                camposTipoHidden += read.getCamposTipoHidden();
                
            }
                System.out.println("----- Resumen -----");
                System.out.println("Comentarios HTML: " + comentariosHtml);
                System.out.println("Comentarios de la aplicación: " + comentariosAplicacion);
                System.out.println("Direcciones IP: " + direccionesIp);
                System.out.println("Direcciones de correo electrónico: " + correosElectronicos);
                System.out.println("Consultas SQL: " + consultasSql);
                System.out.println("Cadenas de conexión a la base de datos: " + cadenasConexionBd);
                System.out.println("Campos ocultos de entrada: " + camposTipoHidden);
        }
        
    }
}
