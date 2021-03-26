package Proceso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iDavi
 */

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;

public class CarlosDavidRamirezAltanUedi {
    
    @Mock
    AsignarHorario mockAsignarHorario = new AsignarHorario();;

    
    @Mock
    RegistroAcademico mockRegistroAcademico = new RegistroAcademico(2012, "13132");;
    
    @Mock
    Carrera mockCarrera = new Carrera(10, "Sistemas");

    @Test
    public void procesarCarreraTest() throws Exception {
        assertEquals(3,mockCarrera.procesarCarrera());
    }



    @Test
    public void TeshorarioTest() throws Exception{
    assertNotEquals(210,mockAsignarHorario.generarHorario(mockCarrera,mockRegistroAcademico).getCodigoHorario());
    assertEquals(414,mockAsignarHorario.generarHorario(mockCarrera,mockRegistroAcademico).getCodigoHorario());
    assertEquals("Matutino",mockAsignarHorario.generarHorario(mockCarrera,mockRegistroAcademico).getDescripcion());

    }

    
    
}
