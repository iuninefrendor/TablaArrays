/**
 * MIT License
 *
 * Copyright (c) 2017 Rafael Bautista Martínez
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package tabla;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rafael Bautista Martinez
 * INSTITUTO TECNOLÓGICO SUPERIOR DE TEZIUTLÁN
 */
public class Acciones {

    private int filas;
    private int columnas;
    private DefaultTableModel dtm;

    /**
     * Obtiene el valor de {@link #filas} y de {@link #columnas} y
     * genera el Modelo que se utilizará para agregar datos a un {@code JTable}
     * 
     * @return DefaultTableModel
     */
    public DefaultTableModel Agregar() {
        try {
            filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese filas"));
            columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columnas"));
        } catch (NumberFormatException e) {
        }
        String[] titulos = new String[columnas];
        Object[][] modelo = new Object[filas][columnas];
        dtm = new DefaultTableModel(modelo, titulos);
        return dtm;
    }

    /**
     * Genera un archivo de texto utilizando un {@code JFileChooser}
     * guardandolo en la ruta elegida por el usuario
     * 
     * @param texto cadena a guardar en el archivo
     */
    public void Guardar(String texto) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de texto", ".txt", "text");
        fileChooser.setFileFilter(filter);
        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile() + ".txt";
            File file = new File(ruta);
            try (FileWriter fw = new FileWriter(file)) {
                fw.write(texto);
            } catch (IOException e) {
            }
        }
    }

    /**
     * Obtiene las variables del {@code DefaultTableModel} ({@link #dtm})
     * las convierte en {@code String} aplicando la sintaxis
     * de un vector
     * 
     * @return {@code String} con la sintaxis de un vector
     * @see #Agregar
     */
    public String Salida() {
        String salida = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 && j == 0) {
                    salida += "{" + dtm.getValueAt(i, j) + ",";
                } else if (j == (columnas - 1)) {
                    salida += dtm.getValueAt(i, j) + "}" + "," + "\r\n" + "{";
                } else {
                    salida += dtm.getValueAt(i, j) + ",";
                }
            }
        }
        return salida;
    }

    /**
     * Inicializa un nuevo DefaultTableModel,lo llena de las constantes
     * declaradas en {@link Constantes#Constante}
     *
     * @return DefaultTableModel
     * @see Constantes#Dato
     */
    public DefaultTableModel Constantes() {
        String[] titulos = new String[this.columnas = 31];
        Object[][] modelo = new Object[this.filas = 12][this.columnas = 31];
        dtm = new DefaultTableModel(modelo, titulos);
        Constantes cons = new Constantes();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                dtm.setValueAt(cons.Dato(i, j), i, j);
            }
        }
        return dtm;
    }

    /**
     * Inicializa un nuevo DefaultTableModel,lo llena de numeros aleatorios
     * segun el numero de {@code filas} y de {@code columnas}.
     * Dentro de {@code r.nextInt()} 30 significa el numero maximo del aleatorio
     *
     * @return DefaultTableModel
     */
    public DefaultTableModel Aleatorio() {
        String[] titulos = new String[columnas];
        Object[][] modelo = new Object[filas][columnas];
        dtm = new DefaultTableModel(modelo, titulos);
        Random r = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                dtm.setValueAt(r.nextInt(31), i, j);
            }
        }
        return dtm;
    }
}
