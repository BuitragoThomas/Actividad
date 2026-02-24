import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeeCSV {
    public static void main(String[] args) {
        String rutaArchivo = "datos.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine(); 

            int contadorNotasAltas = 0;
            int sumaEdades = 0;
            int totalEstudiantes = 0;

            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(",");
                
                int edad = Integer.parseInt(columnas[1].trim());
                int nota = Integer.parseInt(columnas[2].trim());

                if (nota >= 90) {
                    contadorNotasAltas++;
                }

                sumaEdades += edad;
                totalEstudiantes++;
            }

            double promedioEdad = (totalEstudiantes > 0) ? (double) sumaEdades / totalEstudiantes : 0;

            System.out.println("Estudiantes con nota >= 90: " + contadorNotasAltas);
            System.out.println("Promedio de edad: " + promedioEdad);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}