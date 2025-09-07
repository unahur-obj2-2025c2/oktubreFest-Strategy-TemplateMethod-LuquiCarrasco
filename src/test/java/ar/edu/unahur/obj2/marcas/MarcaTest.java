package ar.edu.unahur.obj2.marcas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Carpa.Carpa;
import ar.edu.unahur.obj2.personas.Aleman;
import ar.edu.unahur.obj2.personas.Belga;
import ar.edu.unahur.obj2.personas.Checos;
import ar.edu.unahur.obj2.personas.Personas;

public class MarcaTest {
    Marcas hofbrau = new Roja("Aleman", 0.016);
    Marcas guiness = new Negra("Belga", 5.0);
    Marcas corona = new Rubia("Checo", 0.8, 5.0);
    Jarra jarraRoja = new Jarra(0.5, hofbrau);
    Jarra jarraRubia = new Jarra(1.0, corona);
    Personas marcos = new Aleman(95.0, false, 5.00);
    Personas nico = new Belga(69.0, true, 4.0);
    Personas cris = new Checos(75.0, true, 3.0);
    Personas lucas = new Aleman(78.0, true, 4.0);
    Personas loncha = new Aleman(86.0, true, 4.0);
    Carpa carpa1 = new Carpa(10, true, corona);
    Carpa carpa2 = new Carpa(10, true, guiness);
    
    @BeforeEach
    void initialize(){
         AlcoholReglamentario.getInstance().setValor(4.0);
    }
    
    @Test()
    void contenidoAlocholJarraRojaMedioLitro(){
        assertEquals(0.04, hofbrau.getGraduacionAlcoholica());
    }

    @Test()
    void totalAlcoholQueIngierioUnaPersonaEnBaseALasJarrasQueCompro(){
        marcos.comprarJarra(jarraRoja);
        marcos.comprarJarra(jarraRubia);
        assertEquals(5.02, marcos.cantidadAlcoholIngerido());
    }

    @Test()
    void saberSiUnaPersonaEstaEbria(){
        marcos.comprarJarra(jarraRoja);
        marcos.comprarJarra(jarraRubia);
        assertTrue(marcos.estaEbrio());
    }

    @Test()
    void saberSiLeGustaLaBirra(){
        assertTrue(marcos.leGustaUnaBirra(corona));
    }

    @Test()
    void saberSiUnaPersonaQuiereEntrarALaCarpa(){
        carpa1.ingresoUnaPersona(cris);
        carpa1.ingresoUnaPersona(marcos);
        assertTrue(lucas.quiereEntrarALaCarpa(carpa1));
    }

    @Test()
    void verSiSeDejaPasarAUnaPersona(){
        lucas.comprarJarra(jarraRoja);
        lucas.comprarJarra(jarraRubia);
        lucas.comprarJarra(jarraRubia);
        assertFalse(carpa1.puedeIngresarUnaPersona(lucas));
        assertTrue(carpa1.puedeIngresarUnaPersona(nico));
    }

    @Test()
    void saberSiPuedeEntrarYSiQuiereEntrar(){
        assertTrue(carpa1.puedeIngresarUnaPersona(lucas));
        assertTrue(lucas.quiereEntrarALaCarpa(carpa1));
    }

    @Test()
    void unaPersonaEntraALaCarpaSiNoPuedeTiraError(){
        lucas.comprarJarra(jarraRoja);
        lucas.comprarJarra(jarraRubia);
        lucas.comprarJarra(jarraRubia);
        assertThrows(RuntimeException.class, () -> {lucas.entrarALaCarpa(carpa1);});
    }

    @Test()
    void servirUnaJarraAUnaPersonaQueNoEsta(){
        assertThrows(RuntimeException.class, () -> {carpa1.servirBirritaEnJarra(cris, 2.0);});
    }

    @Test()
    void cantidadPersonasEbriasEmpedernidas(){
        lucas.entrarALaCarpa(carpa2);
        carpa2.servirBirritaEnJarra(lucas, 2.0);
        nico.entrarALaCarpa(carpa2);
        loncha.entrarALaCarpa(carpa2);
        carpa2.servirBirritaEnJarra(loncha, 20.0);
        assertEquals(2, carpa2.cantidadPersonasEbriasEmpedernidas());
    }

    @Test()
    void verSiUnaPersonaEsPatriota(){
        lucas.comprarJarra(jarraRoja);
        assertTrue(lucas.esPatriota());
    }

    

}
