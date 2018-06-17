package planningforgold;

import java.io.*;

public class Lectordearchivos {     
    
    int comentariosHtmli = 0;    
    int comentariosAplicacion = 0;
    int direccionesIp = 0;
    int correosElectronicos = 0;
    int consultasSql = 0;
    int cadenasConexionBd = 0;
    int camposTipoHidden = 0;
    int resultadoDireccionesIp = 0;  
    
    public String Lectordearchivos(String direccion)
    {
        String resultado = "";
 
        try
        {
          
            boolean estado = true;
            String palabras = "";
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            String cadena = "";
            int numero;
            String[] antesPunto = new String[100];
            
              int cont = 0;
              char[] letras = new char[20000];
              
              //Agrega cada letra a vector String
              while((numero = br.read()) != -1)
              {
                  letras[cont] = ((char)numero);
                  cadena += ((char)numero);
                  cont++;
              }
              
              for(int i = 0; i < cont; i++)
              {
                  String letra;
                  String letra2;                 
                  letra = String.valueOf(letras[i]);               
                  
                  //Direcciones IP
                  if("<".equals(letra))
                  {
                    int cont2 = i;
                    cont2++;
                    letra2 = String.valueOf(letras[cont2]);
                    
                    if("p".equalsIgnoreCase(letra2))
                    {                         
                        cont2++;
                        letra2 = String.valueOf(letras[cont2]);

                        if(">".equalsIgnoreCase(letra2))
                        {
                            int cont3 = 0;
                          
                            while(cont3 != 3 && estado == true)
                            {
                                cont2++;
                                letra2 = String.valueOf(letras[cont2]);
                                if(".".equals(letra2))
                                {
                                    cont3++;
                                    direccionesIp++;
                                    resultadoDireccionesIp = direccionesIp / 3;
                                }
                                else if("<".equalsIgnoreCase(letra2))
                                {
                                    cont2++;
                                    letra2 = String.valueOf(letras[cont2]);

                                    if("/".equalsIgnoreCase(letra2))
                                    {
                                        estado = false;
                                    }
                                }
                            }
                        }
                    }                      
                  }                 
                  
                //Consultas SQL SELECT
                if("s".equalsIgnoreCase(letra))
                {
                    int cont2 = i;
                    cont2++;
                    letra = String.valueOf(letras[cont2]);
                    
                    if("e".equalsIgnoreCase(letra))
                    {                         
                        cont2++;
                        letra = String.valueOf(letras[cont2]);

                        if("l".equalsIgnoreCase(letra))
                        {
                            cont2++;
                            letra = String.valueOf(letras[cont2]);
                            
                            if("e".equalsIgnoreCase(letra))
                            {
                                cont2++;
                                letra = String.valueOf(letras[cont2]);
                                
                                if("c".equalsIgnoreCase(letra))
                                {
                                    cont2++;
                                    letra = String.valueOf(letras[cont2]);
                                    
                                    if("t".equalsIgnoreCase(letra))
                                    {
                                        consultasSql++;
                                    }
                                }
                            }
                        }
                    }
                }                            
                  
                //Consultas SQL INSERT
                if("i".equalsIgnoreCase(letra))
                {
                    int cont2 = i;
                    cont2++;
                    letra = String.valueOf(letras[cont2]);
                    
                    if("n".equalsIgnoreCase(letra))
                    {                         
                        cont2++;
                        letra = String.valueOf(letras[cont2]);

                        if("s".equalsIgnoreCase(letra))
                        {
                            cont2++;
                            letra = String.valueOf(letras[cont2]);
                            
                            if("e".equalsIgnoreCase(letra))
                            {
                                cont2++;
                                letra = String.valueOf(letras[cont2]);
                                
                                if("r".equalsIgnoreCase(letra))
                                {
                                    cont2++;
                                    letra = String.valueOf(letras[cont2]);
                                    
                                    if("t".equalsIgnoreCase(letra))
                                    {
                                        consultasSql++;
                                    }
                                }
                            }
                        }
                    }
                }                                                                          
                
                //Consultas SQL UPDATE
                if("u".equalsIgnoreCase(letra))
                {
                    int cont2 = i;
                    cont2++;
                    letra = String.valueOf(letras[cont2]);
                    
                    if("p".equalsIgnoreCase(letra))
                    {                         
                        cont2++;
                        letra = String.valueOf(letras[cont2]);

                        if("d".equalsIgnoreCase(letra))
                        {
                            cont2++;
                            letra = String.valueOf(letras[cont2]);
                            
                            if("a".equalsIgnoreCase(letra))
                            {
                                cont2++;
                                letra = String.valueOf(letras[cont2]);
                                
                                if("t".equalsIgnoreCase(letra))
                                {
                                    cont2++;
                                    letra = String.valueOf(letras[cont2]);
                                    
                                    if("e".equalsIgnoreCase(letra))
                                    {
                                        consultasSql++;
                                    }
                                }
                            }
                        }
                    }
                }                   

                  //Campos ocultas de entrada
                  if("h".equalsIgnoreCase(letra))
                  {
                      int cont2 = i;
                      cont2++;
                      letra = String.valueOf(letras[cont2]);
                      
                      if("i".equalsIgnoreCase(letra))
                      {                         
                          cont2++;
                          letra = String.valueOf(letras[cont2]);
                        
                          if("d".equalsIgnoreCase(letra))
                          {
                              cont2++;
                              letra = String.valueOf(letras[cont2]);
                              
                              if("d".equalsIgnoreCase(letra))
                              {
                                  camposTipoHidden++;
                              }
                          }
                      }
                  }
                  
                  //Cadenas de conexión a BD
                  if("d".equalsIgnoreCase(letra))
                  {
                      int cont2 = i;
                      cont2++;
                      letra = String.valueOf(letras[cont2]);
                      
                      if("a".equalsIgnoreCase(letra))
                      {                         
                          cont2++;
                          letra = String.valueOf(letras[cont2]);
                        
                          if("t".equalsIgnoreCase(letra))
                          {
                              cont2++;     
                              letra = String.valueOf(letras[cont2]);
                              
                              if("a".equalsIgnoreCase(letra))
                              {
                                  cont2++;
                                  letra = String.valueOf(letras[cont2]);
                                  
                                  if("b".equalsIgnoreCase(letra))
                                  {
                                      cont2++;
                                      letra = String.valueOf(letras[cont2]);
                                      
                                      if("a".equalsIgnoreCase(letra))
                                      {
                                          cadenasConexionBd++;
                                      }
                                  }
                              }
                          }
                      }
                  }
                  
                  //Comentarios de aplicación
                  if("/".equalsIgnoreCase(letra))
                  {
                      int cont2 = i;
                      cont2++;
                      letra = String.valueOf(letras[cont2]);
                      
                      if("*".equalsIgnoreCase(letra))
                      {                         
                          comentariosAplicacion++;

                      }
                  }
                  
                //Comentarios de aplicacion
                if("/".equalsIgnoreCase(letra))
                  {
                      int cont2 = i;
                      cont2++;
                      letra = String.valueOf(letras[cont2]);
                      
                      if("/".equalsIgnoreCase(letra))
                      {                         
                          comentariosAplicacion++;

                      }
                  }
                  
                  //Correos electronicos 
                  if("@".equals(letra))
                  {
                      boolean flag = true;
                      boolean flag2 = true;
                      boolean flag3 = true;
                      boolean flag4 = true;
                      boolean flag5 = true;
                      letra = String.valueOf(letras[i-1]);
                      
                      //Antes del @
                      if(" ".equals(letra))
                      {
                          flag = false;
                      }
                      
                      letra = String.valueOf(letras[i + 1]);
                      
                      //Despues del @
                      if(" ".equals(letra))
                      {
                          flag4 = false;
                      }
                      
                      
                      if(flag == true)
                      {
                          int cont2 = i;
                          int contPunto = 0;
                          cont2++;
                          letra = String.valueOf(letras[cont2]);               
                          
                          while(!".".equals(letra))
                          {
                              antesPunto[contPunto] = letra;
                              
                              cont2++;
                              letra = String.valueOf(letras[cont2]);
                              
                              contPunto++;                            
                          }
                          
                          letra = String.valueOf(letras[cont2 - 1]);
                          
                          //Antes del punto
                          if(" ".equals(letra))
                          {
                              flag2 = false;
                          }
                          
                          letra = String.valueOf(letras[cont2 + 1]);
                          
                          //Después del punto
                          if(" ".equals(letra))
                          {
                              flag3 = false;
                          }
                          
                          //String antes del punto 
                          for (int j = 0; j < antesPunto.length; j++) 
                          {
                              if(" ".equals(antesPunto[j]))
                              {
                                  flag5 = false;
                              }
                          }
                          
                          if(flag == true && flag2 == true && flag3 == true && flag4 == true && flag5 == true)
                          {
                              correosElectronicos++;
                          }
                          
                      }


                  }
                 
                  //Comentarios HTML
                  if("<".equals(letra))
                  {
                      int cont2 = i;
                      cont2++;
                      letra = String.valueOf(letras[cont2]);
                      
                      if("!".equals(letra))
                      {                         
                          cont2++;
                          letra = String.valueOf(letras[cont2]);
                        
                          if("-".equals(letra))
                          {
                              cont2++;
                              letra = String.valueOf(letras[cont2]);
                              
                              if("-".equals(letra))
                              {
                                  comentariosHtmli++; 
                              }
                                                           
                          }
                      }
                  }
                 
              }              

              System.out.println(String.valueOf("Comentarios HTML: " + comentariosHtmli));
              System.out.println(String.valueOf("Comentarios de la aplicación: " + comentariosAplicacion));
              System.out.println(String.valueOf("Direccines IP: " + resultadoDireccionesIp));
              System.out.println(String.valueOf("Direcciones de correo electrónico: " + correosElectronicos));
              System.out.println(String.valueOf("Consultas SQL: " + consultasSql));
              System.out.println(String.valueOf("Cadenas de conexión a la base de datos: " + cadenasConexionBd));
              System.out.println(String.valueOf("Campos ocultos de entrada: " + camposTipoHidden));                  
                           
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex);
        }        
            return resultado;
    }
    
    public int getComentariosHtml()
    {
        return comentariosHtmli;
    }

    public int getComentariosAplicacion() {
        return comentariosAplicacion;
    }

    public int getDireccionesIp() {
        return direccionesIp;
    }

    public int getCorreosElectronicos() {
        return correosElectronicos;
    }

    public int getConsultasSql() {
        return consultasSql;
    }

    public int getCadenasConexionBd() {
        return cadenasConexionBd;
    }

    public int getCamposTipoHidden() {
        return camposTipoHidden;
    }

    public int getResultadoDireccionesIp() {
        return resultadoDireccionesIp;
    }
}