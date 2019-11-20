/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Constantes
        final int PESO_MIN = 0;
        final int PESO_MAX = 250;
        final int DIAS_SEM = 7;

        //Variables
        double pesoDia;
        int diasCont = 1;
        boolean numVal;
        double mediaPeso;
        double dia1 = 0;
        double dia2 = 0;
        double dia3 = 0;
        double dia4 = 0;
        double dia5 = 0;
        double dia6 = 0;
        double dia7 = 0;

        //Bucle
        while (diasCont <= DIAS_SEM) {
            try {
                System.out.printf("%s %d%n", "Día", diasCont);
                System.out.print("Introduzca peso de hoy ..: ");
                
                pesoDia = SCN.nextDouble();
                
                numVal = pesoDia >= PESO_MIN && pesoDia <= PESO_MAX;
                
                if (numVal == true) {
                    switch (diasCont) {
                        case 1:
                            dia1 = pesoDia;
                            break;
                        case 2:
                            dia2 = pesoDia;
                            break;
                        case 3:
                            dia3 = pesoDia;
                            break;
                        case 4:
                            dia4 = pesoDia;
                            break;
                        case 5:
                            dia5 = pesoDia;
                            break;
                        case 6:
                            dia6 = pesoDia;
                            break;
                        case 7:
                            dia7 = pesoDia;
                            break;
                    }
                    diasCont++;
                }
            } catch (Exception e) {
                
            } finally {
                SCN.nextLine();
            }

        }

        //test
        //System.out.println(dia1);
        //System.out.println(dia2);
        //System.out.println(dia3);
        //System.out.println(dia4);
        //System.out.println(dia5);
        //System.out.println(dia6);
        //System.out.println(dia7);
        
        //Media
        mediaPeso = (dia1 + dia2 + dia3 + dia4 + dia5 + dia6 + dia7) / DIAS_SEM;
        System.out.printf(Locale.ENGLISH, "%s %.2f%n", "La media de peso es ...:"
                , mediaPeso);
    }

}
