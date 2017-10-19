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

/**
 *
 * @author Rafael Bautista Martinez 
 * INSTITUTO TECNOLÓGICO SUPERIOR DE TEZIUTLÁN
 */
public class Constantes {

    /**
     * Contantes declaradas para servir un {@code DefaultTableModel}
     */
    private final int[][] Constante = new int[][]{
        {128, 65, 34, 94, 72, 37, 32, 164, 1, 108, 186, 66, 128, 57, 24, 99, 85, 100, 90, 195, 26, 12, 186, 14, 193, 120, 36, 70, 4, 98, 48},
        {145, 62, 45, 177, 65, 87, 64, 14, 101, 58, 21, 10, 64, 102, 60, 17, 99, 52, 1, 76, 103, 80, 71, 25, 63, 100, 161, 26, 98, 47, 56},
        {161, 174, 19, 53, 4, 49, 29, 20, 132, 25, 104, 143, 151, 79, 58, 5, 81, 129, 54, 88, 24, 128, 19, 122, 197, 114, 28, 131, 17, 16, 90},
        {178, 2, 77, 127, 80, 55, 179, 89, 147, 193, 13, 92, 62, 148, 83, 6, 124, 178, 34, 141, 18, 61, 13, 30, 170, 66, 7, 74, 2, 164, 160},
        {195, 6, 70, 59, 184, 7, 23, 124, 136, 12, 169, 94, 15, 8, 186, 30, 73, 12, 146, 85, 191, 17, 115, 57, 60, 91, 145, 20, 181, 12, 9},
        {13, 24, 20, 18, 82, 112, 154, 93, 86, 73, 33, 183, 21, 95, 36, 79, 65, 27, 45, 185, 33, 174, 11, 2, 75, 182, 78, 51, 14, 189, 50},
        {30, 76, 86, 126, 158, 38, 70, 78, 142, 23, 41, 105, 65, 69, 175, 108, 11, 139, 91, 5, 40, 100, 156, 61, 87, 96, 85, 8, 59, 35, 152},
        {47, 28, 149, 8, 46, 13, 10, 12, 5, 34, 113, 3, 9, 28, 1, 68, 165, 19, 3, 82, 171, 27, 84, 89, 90, 30, 166, 64, 10, 93, 21},
        {63, 37, 67, 63, 140, 78, 97, 106, 60, 190, 87, 75, 159, 31, 25, 92, 36, 72, 21, 11, 110, 69, 7, 138, 15, 6, 97, 68, 155, 3, 180},
        {80, 75, 14, 21, 74, 111, 194, 18, 9, 2, 107, 29, 6, 76, 90, 123, 13, 116, 134, 192, 4, 14, 67, 5, 130, 83, 35, 43, 26, 96, 31},
        {97, 143, 109, 88, 22, 24, 84, 125, 187, 39, 168, 99, 16, 135, 157, 95, 3, 37, 66, 29, 133, 94, 121, 167, 98, 195, 80, 137, 16, 72, 120},
        {113, 156, 32, 172, 77, 44, 150, 119, 37, 173, 62, 162, 81, 4, 27, 144, 32, 190, 118, 153, 48, 15, 22, 143, 117, 71, 188, 23, 28, 163, 42}
    };

    /**
     * Obtiene los valores del vector en {@link #Constante}
     * 
     * @param a valor del vector
     * @param b valor del vector
     * @return valor de la constante declarada en {@link #Constante}
     */
    public int Dato(int a, int b) {
        int i = Constante[a][b];
        return i;
    }
}
